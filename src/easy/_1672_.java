package easy;

public class _1672_ {
    public int maximumWealth(int[][] accounts){
        int maxWealth = 0, temp;
        for (int[] wallet : accounts){
            temp = 0;
            for (int money : wallet){
                temp += money;
            }
            it (temp > maxWealth){
                maxWealth = temp;
            }
        }
        return maxWealth;
    }
}
