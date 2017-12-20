import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class FunctionalTest {

    @Test
    public void functionalInterfaceExampleTest() {
        FunctionalInterfaceExample example = i -> System.out.println("param: " + i);
        example.apply(100);
    }

    @Test
    public void objectMethodFunctionalInterfaceTest() {
        ObjectMethodFunctionalInterface objectMethod = i -> System.out.println("param: " + i);
        objectMethod.apply(100);
        Assert.assertNotNull(objectMethod.toString());
    }

    @Test
    public void functionalInterfaceWithExceptionTest() throws Exception {
        // 为了验证能否正常出现异常，这里会在 lambda 表达式中手动抛出异常
        // 如果在抽象方法的定义处没有 throws Exception，那么这里将编译不通过
        FunctionalInterfaceWithException withException = i -> {
            throw new Exception();
        };
        withException.apply(100);
    }

    @Test
    public void functionalInterfaceWithStaticMethodTest() {
        FunctionalInterfaceWithStaticMethod staticMethod = i -> System.out.println("接口中声明了静态方法后，该接口任然是一个函数式接口。");
        staticMethod.apply(100);
        int sum = FunctionalInterfaceWithStaticMethod.sum(new int[]{1, 2, 3, 4, 5});
        Assert.assertEquals(15, sum);
    }

    @Test
    public void interfaceWithDefaultMethodTest() {
        InterfaceWithDefaultMethod defaultMethod = i -> System.out.println("默认方法不是一个抽象方法，所以也不会影响判断一个接口是不是函数式接口。");
        defaultMethod.apply(100);
        defaultMethod.say("default method");
    }
}

@FunctionalInterface
interface FunctionalInterfaceExample {
    void apply(int i); // FunctionalInterface 注解的函数式接口，有且只能有一个抽象方法
}

@FunctionalInterface
interface ObjectMethodFunctionalInterface {
    void apply(int i);

    @Override
    int hashCode(); // 可以在接口中添加来自 Object 的 public 方法

    @Override
    boolean equals(Object obj);

    @Override
    String toString();
}

@FunctionalInterface
interface FunctionalInterfaceWithException {
    void apply(int i) throws Exception;
}

// 静态方法
@FunctionalInterface
interface FunctionalInterfaceWithStaticMethod {
    void apply(int i);

    static int sum(int[] array) {
        return Arrays.stream(array).sum();
    }
}

// 默认方法
@FunctionalInterface
interface InterfaceWithDefaultMethod {
    void apply(int i);

    default void say(String name) {
        System.out.println("Hello " + name);
    }
}
