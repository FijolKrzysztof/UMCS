import java.util.Arrays;

public class TestSingleton {
    public static TestSingleton testSingleton = null;
    public int[] nums = new int[0];

    @Override
    public String toString() {
        return "TestSingleton{" +
                "nums=" + Arrays.toString(nums) +
                '}';
    }

    public void addNum(int num) {
        this.nums = Arrays.copyOf(this.nums, this.nums.length + 1);
        this.nums[this.nums.length - 1] = num;
    }

    public static TestSingleton getInstance() {
        if (testSingleton == null) {
            testSingleton = new TestSingleton();
        }
        return testSingleton;
    }
}
