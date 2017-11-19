/**
 * Created by IDEA.
 * User: vincent
 * Date: 2017/8/8
 * Comment: Google PageRank 算法实现(Map-Reduce计算方式未实现)
 * 参考资料: http://www.cnblogs.com/fengfenggirl/p/pagerank-introduction.html
 * 原文资料: http://ilpubs.stanford.edu:8090/422/1/1999-66.pdf
 */
public class PageRank {
    private static final double ALPHA = 0.80;
    private static final double DISTANCE = 0.0000001;
    private static final double[][] DEFAULT_M = {
            {1.0, 1.0, 1.0, 1.0},
            {1.0, 1.0, 1.0, 1.0},
            {1.0, 1.0, 1.0, 1.0},
            {1.0, 1.0, 1.0, 1.0}
    };
    private static final double[][] DEFAULT_S = {
            {0.0, 1.0 / 2.0, 0.0, 0.0},
            {1.0 / 3.0, 0.0, 0.0, 1.0 / 2.0},
            {1.0 / 3.0, 0.0, 1.0, 1.0 / 2.0},
            {1.0 / 3.0, 1.0 / 2.0, 0.0, 0.0}
    };
    private static final double[] V = {0.25,0.25,0.25,0.25};

    public static void main(String[] args) {
        System.out.println("alpha的值为: " + ALPHA);
        System.out.println("初始的向量V为: " + Arrays.toString(V));
        System.out.println("初始的矩阵Matrix为:");
        printMatrix(getMatrix(ALPHA));
        double[] pageRank = calPageRank(V, ALPHA);
        System.out.println("PageRank为: " + Arrays.toString(pageRank));
        System.out.println();
    }

    /**
     * 打印输出一个矩阵
     * @param matrix
     */
    private static void printMatrix(double[][] matrix) {
        for (double[] m : matrix) {
            System.out.println("matrix: " + Arrays.toString(m));
        }
    }
    /**
     * 计算两个向量的距离
     * @param v1 第一个向量
     * @param v2 第二个向量
     * @return 它们的距离
     */
    private static double calDistance(double[] v1, double[] v2) {
        double sum = 0;
        if (v1.length != v2.length) {
            return -1;
        }
        for (int i = 0; i < v1.length; i++) {
            sum += Math.pow(v1[i] - v2[i], 2);
        }
        return Math.sqrt(sum);
    }

    /**
     * 计算pagerank
     * @param v 初始向量
     * @param alpha  alpha的值
     * @return pagerank的结果
     */
    private static double[] calPageRank(double[] v, double alpha) {
        double[][] matrix = getMatrix(alpha);
        double[] new_v;
        while (true) {
            new_v = vectorMulMatrix(matrix, v);
            double dis = calDistance(new_v, v);
            //System.out.println("dis: " + dis);
            //System.out.println("v: " + Arrays.toString(v));
            System.out.println("new_v: " + Arrays.toString(new_v));
            if (dis <= DISTANCE) {
                break;
            }
            v = new_v;
        }
        return new_v;
    }

    /**
     * 计算获得初始的G矩阵
     * @param a 为alpha的值，0.85
     * @return 初始矩阵G
     */
    private static double[][] getMatrix(double a) {
        int n = DEFAULT_S.length;
        double[][] matrix_s = numberMulMatrix(DEFAULT_S, a);
        double[][] matrix_u = numberMulMatrix(DEFAULT_M, (1 - a) / n);
        return sumMatrix(matrix_s, matrix_u);
    }

    /**
     * 计算一个矩阵乘以一个向量
     * @param matrix 一个矩阵
     * @param v 一个向量
     * @return 返回一个新的向量
     */
    private static double[] vectorMulMatrix(double[][] matrix, double[] v) {
        if (matrix == null || v == null || matrix.length <= 0 || matrix[0].length != v.length) {
            return null;
        }
        double[] new_v = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                double temp = matrix[i][j] * v[j];
                sum += temp;
            }
            new_v[i] = sum;
        }
        return new_v;
    }

    /**
     * 计算两个矩阵的和
     * @param matrix_s 第一个矩阵
     * @param matrix_u 第二个矩阵
     * @return 两个矩阵的和
     */
    private static double[][] sumMatrix(double[][] matrix_s, double[][] matrix_u) {
        double[][] matrix = new double[4][4];
        if (matrix_s.length != matrix_u.length || matrix_s.length <= 0 || matrix_u.length <= 0) {
            return null;
        }
        for (int i = 0; i < matrix_u.length; i++) {
            for (int j = 0; j < matrix_u[i].length; j++) {
                double temp = matrix_s[i][j] + matrix_u[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;
    }

    /**
     * 计算一个数乘以矩阵
     * @param s 矩阵s
     * @param a double类型的数
     * @return 一个新的矩阵
     */
    private static double[][] numberMulMatrix(double[][] s, double a) {
        double[][] matrix = new double[4][4];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                double temp = a * s[i][j];
                matrix[i][j] = temp;
            }
        }
        return matrix;
    }
}