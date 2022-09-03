package shree.program.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program4StringRemoveSpecialChar {
    public static void main(String[] args) {

        String str = "@#$#$ This @#$#@ is a String";
        str = str.replaceAll("[^a-zA-Z0-0]","");
        System.out.println(str.toString());

    }
}
