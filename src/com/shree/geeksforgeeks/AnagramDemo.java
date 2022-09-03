package com.shree.geeksforgeeks;

import java.util.HashMap;
import java.util.Map;

public class AnagramDemo {
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
        System.out.println(isAnagram(a,b));
    }

    private static boolean isAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        HashMap<Character, Integer> aMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> bMap = new HashMap<Character, Integer>();

        for(int i=0; i<a.length();i++){
            Character aChar = a.charAt(i);
            Character bChar = b.charAt(i);

            if(aMap.containsKey(aChar)){
                aMap.put(aChar, aMap.get(aChar) +1);
            }else{
                aMap.put(aChar, 1);
            }

            if(bMap.containsKey(bChar)){
                bMap.put(bChar, bMap.get(bChar) +1);
            }else{
                bMap.put(bChar, 1);
            }
        }

        if(aMap.equals(bMap)){
            return true;
        }

        return false;
    }
}
