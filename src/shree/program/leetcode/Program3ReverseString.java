package shree.program.leetcode;

public class Program3ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< str.length(); i++){
            sb.append(str.charAt(str.length()-i-1));
        }
        System.out.println(sb.toString());

        System.out.println((new StringBuilder(str)).reverse());

    }
}
