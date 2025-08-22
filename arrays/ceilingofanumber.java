package com.dsa.arrays;

import java.util.Scanner;

public class ceilingofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,5,32,47,55,77};
        int target = 78;
        int ans = binarysearchh(arr,target);
        System.out.println(ans);
    }
    public static int binarysearchh(int [] arr, int target) {

        if(target > arr[arr.length-1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}
