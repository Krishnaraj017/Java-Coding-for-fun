// public class fibrecursion {
//     public static int fibonacci(int count){
//         if(count<1)
//         return count;

//         return fibonacci(count-1 )+fibonacci( count -2);
        
//     }
//     public static void main(String args[]){
//         int num=10;
//         System.out.println("fibonacci"+num+"is");
//         for(int i=0;i<num;i++){
//             System.out.println(fibonacci(i)+"");
//         }
//     }
    
// }
public class fibrecursion{

    public static int fibonacci(int count) {
        if (count <= 1)
            return count;

        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    public static void main(String args[]) {
        int seqLength = 10;

        System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

        for (int i = 0; i < seqLength; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

}