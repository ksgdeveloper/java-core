package shree.program.leetcode;

import java.util.Arrays;

//https://www.w3resource.com/java-exercises/array/java-array-exercise-1.php
public class Program1SortNumericAndStringArray {
    public static void main(String[] args) {
        int[] my_array = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};

        for(int i=0; i<my_array.length ; i++){
            for(int j=0; j< my_array.length-i-1; j++){
                if(my_array[j] > my_array[j+1]){
                    int temp = my_array[j+1];
                    my_array[j+1] = my_array[j] ;
                    my_array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(my_array));
    }
}
