import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class TestStream {
    public void doSomething() {
        String[] arr = { "labelOne", "labelTwo", "labelThree" };
        String[] result = Arrays.stream(arr)
                .map(String::toUpperCase)
                .filter(elem -> elem.contains("O"))
                .toArray(String[]::new);
        System.out.println(Arrays.toString(result));
    }
}
