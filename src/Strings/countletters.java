package Strings;

import java.util.HashMap;

public class countletters {
    public static void main(String[] args) {
        String s = "abbbcccdiiuiiuiaaiiuu";
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder res=new StringBuilder();
        for (char c : map.keySet()) {
            res.append(c).append(map.get(c));
        }
        System.out.println(res.toString());
    }
}
