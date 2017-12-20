import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {

    private static void filter(List<String> list, Predicate condition) {
        list.stream().filter(condition::test).forEach(name -> System.out.println("name: " + name));
    }

    @Test
    public void listTest() {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(System.out::println);
    }

    @Test
    public void mapTest() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax.stream().map(t -> t + t * .12).forEach(System.out::println);
    }

    @Test
    public void reduceTest() {
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        double total = costBeforeTax.stream().map(t -> t + t * .12).reduce((sum, t) -> sum + t).get();
        Assert.assertEquals(total, 1680.0, 1680.0);
    }

    @Test
    public void filterTest() {
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        List<String> filtered = features.stream().filter(x -> x.startsWith("S")).collect(Collectors.toList());
        System.out.println(filtered);
    }

    @Test
    public void innerClassTest() {
        new Thread(() -> System.out.println("hello lambda"));
    }

    @Test
    public void predicateTest() {
        List<String> languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        filter(languages, (s) -> String.valueOf(s).startsWith("C"));
        filter(languages, (s) -> String.valueOf(s).length() > 4);
        filter(languages, (s) -> true);
        filter(languages, (s) -> false);
    }
}
