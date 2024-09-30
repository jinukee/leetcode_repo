package easy;

public class _1299_ {
    public int[] replaceElements(int[] arr) {
        int n = arr.length, max_Right = -1;

        for(int i = n - 1; i >= 0; i--){
            int current = arr[i];
            arr[i] = max_Right;

            if (current > max_Right) max_Right = current;
        }
        return arr;
    }
}
