import java.util.*;

public class NonRepeatingCharacter {

    public static void main(String[] args) {
        String s="bharath bava";
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.get(ch)==null){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
        }
        for (char key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
       for(char c: s.toCharArray()){
           if(map.get(c)==1){
               System.out.println("First repeated character in the syring is:" +c);
               break;
           }
       }

    }
}
