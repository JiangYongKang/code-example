#include <stdio.h>
int main() {
    double arr[] = { 1.78, 1.77, 1.82, 1.79, 1.85, 1.75, 1.86, 1.77, 1.81, 1.80 };
    int i, j;
    printf("\n************排队前*************\n");
    for(i = 0; i < 10; i++) {
        if(i != 9)
            printf("%.2f, ", arr[i]);  //%.2f表示小数点后精确到两位
        else
            printf("%.2f", arr[i]);    //%.2f表示小数点后精确到两位
    }
    for(i = 8; i >= 0; i--) {
        for(j = 0; j <= i; j++) {
            if(arr[j] > arr[j + 1]) {
                double temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    printf("\n************排队后*************\n");
    for(i = 0; i < 10; i++) {
        if(i != 9)
            printf("%.2f, ", arr[i]);  //%.2f表示小数点后精确到两位
        else
            printf("%.2f", arr[i]);    //%.2f表示小数点后精确到两位
    }
    return 0;
}
