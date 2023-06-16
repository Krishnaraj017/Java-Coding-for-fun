import java.util.HashSet;

public class duplicateHashSet {
    public static void main(String args[]){
        int a1[]={1,24,2,3,1,2};
        HashSet<Integer> Set=new HashSet<>();
        for(int val:a1){
            if(Set.add(val)==false){
                System.out.println(val+"");

            }

        }
    }
    
}
