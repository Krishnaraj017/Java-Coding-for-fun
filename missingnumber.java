import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class missingnumber {
    public static void main(String args[]){
        Integer[]input={1,2,3,5,6,4,7,2,9,7,6};
        List arrList=Arrays.asList(input);
        HashSet<Integer> hsobj=new HashSet(arrList);
        int n=hsobj.size()+1;
        int SumOfNNumber=SumOfAllNumbers(n);
        int SumOfHashSetNumber=SumOfHashSetNumbers(n);
        int missingOfHashSetNumbers=SumOfHashSetNumbers(hsobj);
        int missingnumber=SumOfNNumber-SumOfHashSetNumbers(hsobj);
        
               

    }

    private static int SumOfHashSetNumbers(HashSet<Integer> hsobj) {
        return 0;
    }

    private static int SumOfAllNumbers(int n) {
        return 0;
    }
    
}
