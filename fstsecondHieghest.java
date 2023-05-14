public class fstsecondHieghest {
    public static int SecHieghest(int[] array){
        int highest=Integer.MIN_VALUE;
        int secondHieghest=Integer.MIN_VALUE;
        for(int i:array){
            if(i>highest){
                secondHieghest=highest;
                highest=i;

            }
            else if(i>secondHieghest){
                secondHieghest=i;
            }
        }
        return secondHieghest;
        
    }
    public static void main(String args[]){
        int[] array={1,2,9,4,5,7};
        System.out.println(SecHieghest(array));
    }
    
}
