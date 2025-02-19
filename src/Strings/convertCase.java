package Strings;

public class convertCase {
    public static void main(String[] args) {
        String str="ajav CaseLeVwl LanguAGe";
        StringBuilder res=new StringBuilder();

        for(char ch:str.toCharArray()){
            if(Character.isLowerCase(ch)){
                res.append(Character.toUpperCase(ch));
            }
            else{
                res.append(Character.toLowerCase(ch));
            }
        }
        System.out.println(res);

    }
}
