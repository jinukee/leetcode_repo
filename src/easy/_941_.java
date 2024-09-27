package easy;

public class _941_ {
    public boolean validMountainArray(int[] arr) {
        boolean climb_state = true;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i - 1]) return false; // same height? return false immediately!
            else if (arr[i] > arr[i - 1] && !climb_state) return false; // twice up and down!
            else if (arr[i] < arr[i - 1] && climb_state){
                if (i == 1) return false; // only down path
                climb_state = false;
            }
        }
        if(climb_state) return false; // only up path
        return true;
    }
}
