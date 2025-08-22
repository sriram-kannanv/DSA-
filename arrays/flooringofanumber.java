package com.dsa.arrays;

import java.util.Scanner;

public class flooringofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,13,24,35,46,57,625,777};
        int target = 1;
        int ans = binarysearchh(arr,target);
        System.out.println(ans);
    }
    public static int binarysearchh(int [] arr, int target) {
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
        if(end>=0) {
            return end;
        }
        else {return -1;}
    }
}
