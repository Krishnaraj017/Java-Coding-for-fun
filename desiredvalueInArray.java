import java.util.Arrays;

public class desiredvalueInArray {
    public static void main(String args[]){
        String[] inputArray={"w","R","K"};
        System.out.println(isExists(inputArray,"B"));
        System.out.println(isExists(inputArray,"w"));

    }
    public static boolean isExists(final String[] array,final String obj){
        return Arrays.asList(array).contains(obj);
    }
    
}
