public class factorial {
    public static long findfactorial(long n){
        if(n==1)
            return 1;
        else
             return (n*findfactorial(n-1));

    }
    public static void main(String args[]){
        System.out.println(findfactorial(4));
    }
    
}
