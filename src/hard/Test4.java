package hard;

public class Test4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int m = 0;
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (m == nums1.length) {
                arr[i] = nums2[n];
                n++;
            } else if (n == nums2.length) {
                arr[i] = nums1[m];
                m++;
            } else if (nums1[m] < nums2[n]) {
                arr[i] = nums1[m];
                m++;
            } else {
                arr[i] = nums2[n];
                n++;
            }
        }
        if (arr.length % 2 == 1) {
            return arr[arr.length / 2];
        } else {
            double res = arr[arr.length / 2 - 1] + arr[arr.length / 2];
            return res / 2;
        }
    }
}
