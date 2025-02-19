package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        char res=maxFrequency(name);
        System.out.println(res);

    }
    public static char maxFrequency(String name){
        Map<Character,Integer>map=new HashMap<>();
        int maxFreq=0;
        char c='\0';
        for(char ch:name.toCharArray()){
            if(ch!=' ') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
                if (map.get(ch) > maxFreq) {
                    maxFreq = map.get(ch);
                    c = ch;
                }

            }
        }
        return c;
    }
    }

