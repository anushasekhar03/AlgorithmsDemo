package Strings;

import java.util.*;

public class KMostUniqueElements {
    public static void main(String[] args) {
       String []requests= {"item1","item2","item2","item3","item1","item3"};
        List<String> res=duplicateCount(requests);
        System.out.println(res);

    }
    public static List<String> duplicateCount(String[]requests) {
        LinkedHashSet<String> seen = new LinkedHashSet<>();
        List<String>res=new ArrayList<>();
        for(int i=requests.length-1;i>=0;i--){
            if(!seen.contains(requests[i])){
                seen.add(requests[i]);
                res.add(requests[i]);
            }
        }
        return res;
    }
}
