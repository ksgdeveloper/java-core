package com.shree.geeksforgeeks;

public class PalindromeSubString {
    public static void main(String[] args) {
        solution("abaaba", 3);
    }

    private static void solution(String s, int n){
        int counter = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0; j<s.length()-i-1; j++){
                StringBuffer temp = new StringBuffer(s.substring(j,j+i+2));
                System.out.println(temp +" "+ temp.reverse());
                if(temp.toString().equals(temp.reverse().toString())){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

/*
abaaba

iteration 1
ab, ba, aa, ab, bb

iteration 2
aba, baa, aab, aba

iteration 3
abaa, baab, aaba

iteration 4
abaab, baaba

iteration 4
abaaba

 */