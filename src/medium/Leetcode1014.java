package medium;

public class Leetcode1014 {
    public int maxScoreSightseeingPair(int[] A) {
        int ans = 0;
        int mx = A[0] + 0;
        for (int i = 1; i < A.length; i++) {
            ans = Math.max(ans, mx + A[i] - i);
            mx = Math.max(mx, A[i] + i);
        }
        return ans;
    }
}
