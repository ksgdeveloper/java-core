package com.shree.geeksforgeeks;

public class BinarySearchFindElement {
    public static void main(String[] args) {
        int position =  binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 10,9);
        System.out.println(position);
    }

    private static int binarySearch(int arr[], int n, int k){

        int midPos = n/2;
        int firstPos = 0;

        while(firstPos <= n){
            if(arr[firstPos] < k){

            }
        }
        return 0;
    }

}
