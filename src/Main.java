import java.util.Arrays;

public class Main {
    public static void testBuilder() {
        TestBuilder builder = new TestBuilder.Builder()
                .setA1(5)
                .setA2(2)
                .setA4(10)
                .build();
        System.out.println(builder.toString());
    }

    public static void testSingleton() {
        TestSingleton testSingleton = TestSingleton.getInstance();
        testSingleton.addNum(5);
        System.out.println(testSingleton);
        testSingleton.addNum(10);
        System.out.println(testSingleton);
        TestSingleton testSingleton1 = TestSingleton.getInstance();
        System.out.println(testSingleton1);
    }

    public static void testTxtFile() {
        TxtFile file = new TxtFile();
        file.write("something", "else");
        System.out.println(file.read());
    }

    public static void testCsvFile() {
        CsvFile file = new CsvFile();
        file.write();
        System.out.println(file.read());
    }

    public static void testEventLoop() {
        EventLoop loop = new EventLoop(System.in, System.out);
        loop.eventLoop();
    }

    public static void testCustomException() {
        try {
            throw new CustomException("some message 123");
        } catch (CustomException exception) {
            System.out.println(exception);
        }
    }

    public static void testStream() {
        TestStream stream = new TestStream();
        stream.doSomething();
    }

    public static void main(String[] args) {
//        testBuilder();
//        testSingleton();
//        testTxtFile();
//        testCsvFile();
//        testEventLoop();
//        testCustomException();
        testStream();
    }
}