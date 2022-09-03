package shree.program.leetcode;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {

        //IntStream.range(1,21).forEach(FizzBuzz::display);
        IntStream.range(1,21).forEach(FizzBuzz::anotherDisplay);
    }
    //old method
    private static void display(int num){

            StringBuilder sb = new StringBuilder();
            if(num%3==0){
                sb.append("FIZZ");
            }
            if(num%5==0){
                sb.append("BUZZ");
            }
            if(sb.isEmpty()){
                sb.append(num);
            }

            System.out.println(sb.toString());
    }
    //new method
    private static void anotherDisplay(int num){
        System.out.println(num%15 == 0? "FizzBuzz" : (num%3 == 0 ? "Fizz" : (num%5 ==0 ? "Buzz" : num)) );
    }

}
