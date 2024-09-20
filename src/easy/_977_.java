package easy;

public class _977_ {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--){
            if (nums[i] * nums[i] >= nums[j] * nums[j]){
                result[p] = nums[i] * nums[i];
                i++;
            }
            else{
                result[p] = nums[j] * nums[j];
                j--;
            }
        }
        return result;
    }
}
