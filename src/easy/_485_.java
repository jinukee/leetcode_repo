package easy;

public class _485_ {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for (int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(count, max);
    }
}
