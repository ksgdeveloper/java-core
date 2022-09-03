package shree.program.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program5StringArrayOrder {
    public static void main(String[] args) {
        //reversing the String array
        String[] fruits = {"apples", "tomatoes", "bananas", "guavas", "pineapples"};

        List<String> fruitsList = Arrays.asList(fruits);
        Collections.reverse(fruitsList);
        System.out.println(fruitsList);

        Collections.sort(fruitsList);
        System.out.println(fruitsList);
    }
}
