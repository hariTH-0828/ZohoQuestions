package test.zohointerview;

import java.util.Arrays;

public class MedianTwoSortedArray {

    public double findMedianSortedArray(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length+nums2.length];
        double res;
        System.arraycopy(nums1,0,arr, 0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        Arrays.sort(arr);

        int midPos = arr.length / 2;

        if(arr.length % 2 == 0){
            res = ((float)arr[midPos-1] + (float) arr[midPos]) / 2;
        }else{
            res = arr[midPos];
        }

        return res;
    }

    public static void main(String[] args) {
        MedianTwoSortedArray obj = new MedianTwoSortedArray();

        int[] num1 = {1,4,5};
        int[] num2 = {2,3};  //[1,2,3,4]
        System.out.println(obj.findMedianSortedArray(num1, num2));
    }
}
