import java.util.ArrayList;

public class arrayListToString {
    public static void main(String args[]){
    ArrayList<String> cities=new ArrayList<>();
    cities.add("shs");
    cities.add("sdjd");
    cities.add("sjdjd");
    String citinames[]=cities.toArray(new String[cities.size()]);
    for(String s:citinames){
        System.out.println(s);
    }
    
}}
