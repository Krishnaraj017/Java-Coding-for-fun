import java.util.Arrays; 
import java.util.Collections;
import java.util.List;

public class reversingelementsinArray {
    public static void main(String args[]) {
        int [] a1={1,2,4,2,4};
        System.out.println("array without reverse"+Arrays.toString(a1));
        reverseArray(a1);

    }
    public static void reverseArray(int[] a1){
        List<int[]> list=Arrays.asList(a1);
        Collections.reverse(list);
        System.out.println("Reverse Array");
        for(int[] val:list) {
            System.out.println(""+val);
            
        }
            
    
    }
    
}
