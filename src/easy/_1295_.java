package easy;

public class _1295_ {
    public int findNumbers(int[] nums) {
        int result = 0, count;
        for (int i : nums){
            count = 1;
            while(i >= 10){
                i /= 10;
                count++;
            }
            if(count %2 == 0){
                result++;
            }
        }
        return result;
    }
}
