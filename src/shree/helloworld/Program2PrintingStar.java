package shree.helloworld;

import java.util.stream.IntStream;

public class Program2PrintingStar {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer();
        for(int i =0; i< 10; i++){
            System.out.println(stringBuffer.append("*"));
        }

    }
}
