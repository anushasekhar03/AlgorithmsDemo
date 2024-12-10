import java.util.HashMap;
import java.util.Map;

public class charFrequency {
    public static void main(String[] args) {
        String s="gounipalli anusha";
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

    }
}
