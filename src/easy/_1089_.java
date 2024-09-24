package easy;

public class _1089_ {
        public void duplicateZeros(int[] A) {

            int n = A.length, count = 0;

            for (int num : A) if (num == 0) count++;
            int i = n - 1;
            int p = n + count - 1;

            while (i >= 0 && p >= 0)  {

                if (A[i] != 0) { // Non-zero, just write it in
                    if (p < n) A[p] = A[i];

                } else { // Zero found, write it in twice if we can
                    if (p < n) A[p] = A[i];
                    p--;
                    if (p < n) A[p] = A[i];
                }

                i--;
                p--;
            }
        }
}
