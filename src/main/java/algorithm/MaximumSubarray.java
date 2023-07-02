package algorithm;

public class MaximumSubarray {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = nums[0], curr = nums[0];
        for (int i=1; i<nums.length; i++) {

            curr += nums[i];
            max = Math.max(max, curr);

            if (curr<0)
                curr = 0;
        }
        System.out.println(max);
    }
}
