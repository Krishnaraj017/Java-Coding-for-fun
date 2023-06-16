public class missingNumInArray {
    public static void main(String args[]){
        int[] input={1,2,3,4,5,6,7,9};
        int n=input.length+1;
        int SumOfNNumbers=SumOfAllNumbers(n);
        int sumofarray=SumOfAllarrayinputNumbers(input);
        int missingNumber=SumOfNNumbers-sumofarray;  
        System.out.println("Missing number in the array is "+missingNumber);
    }

    private static int SumOfAllarrayinputNumbers(int[] input) {
      int sum=0;
      for(int i=0;i<input.length;i++){
        sum=sum+input[i];
      }
        return sum; 
    }

    private static int SumOfAllNumbers(int n) {
             int sum=(n*(n+1))/2;
            return sum;
             

    }
    
   
}
