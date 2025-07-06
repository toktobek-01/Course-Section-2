import java.util.Arrays;

public class TakeOutChar {
    public static void main(String[] args) {
        int[] nums = {71 ,42 ,13, 24, 55};

        System.out.println(nums[3]);
        System.out.println(Arrays.stream(nums).min());
        System.out.println(nums);

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

}
