import java.util.HashSet;

public class hashsetToArray {
    public static void main(String args[]){
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("whh");
        hashSet.add("ajj");
        hashSet.add("ahdd");
        System.out.println("HashSet contains"+ hashSet);
        String[] array=new String[hashSet.size()];
        hashSet.toArray(array);
        System.out.println("Array Contains:");;
        for(String str:array){
            System.out.println(str);
        }
    }
    
}
