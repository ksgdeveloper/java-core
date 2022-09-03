package shree.helloworld.string;

import java.util.Arrays;

public class StringSegregation {
    public static void main(String[] args) {
        //Num = 2
        //Input:{1,2,4,3,2,5,1,2}
        //Output:{1,4,3,5,1,2,2,2}

        int arr[] = {1,2,4,3,2,5,1,2};
        int var = 1;

        for(int i=0; i<arr.length ; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] == var){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
