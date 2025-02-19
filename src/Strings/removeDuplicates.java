package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicates {
    public static void main(String[] args) {
        String str="banana";
        Set<Character> set=new LinkedHashSet<>();
        for(char ch:str.toCharArray()){
            set.add(ch);
        }
        StringBuilder res=new StringBuilder();
        for(char c:set){
            res.append(c);
        }
        System.out.println(res.toString());
    }
}
