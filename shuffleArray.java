import java.util.Arrays;
import java.util.Random;

public class shuffleArray{
    public static void main(String args[]){
        Random rand=new Random();
        int array[]={1,2,3,5,3,6,7};
        for(int i=0;i< array.length;i++){
            int randomIndex=rand.nextInt(array.length);
            int temp=array[randomIndex];
            array[randomIndex]=array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }
}