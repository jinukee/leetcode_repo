package easy;

public class _1480_ {
    public int[] runningSum(int [] nums){
        for (int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
