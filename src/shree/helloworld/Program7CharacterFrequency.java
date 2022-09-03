package shree.helloworld;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Program7CharacterFrequency {
    public static void main(String[] args) {
        String occurence = "All that glitters is not gold";
        String str = occurence.replaceAll("[^a-zA-Z0-0]","");
        Map<Character, Long> freq = new HashMap<Character,Long>();

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(freq.containsKey(c)){
                freq.put(c, freq.get(c)+1);

            }else{
                freq.put(c, 1L);
            }
        }

        System.out.println(freq);
        freq.forEach((k, v) -> System.out.print((k + ":" + v+", ")));
        System.out.println();
        freq.entrySet().stream().forEach(e ->System.out.print(e.getKey()+ "-"+ e.getValue()+" " ));
    }
}
