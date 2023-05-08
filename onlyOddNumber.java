import java.util.Arrays;
import java.util.List;

public class onlyOddNumber {
    public static boolean oddCheck(List<Integer> list) {
        for (int i : list) {
            if (i % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 4, 5);
        boolean containsOnlyOdd = oddCheck(list);

        if (containsOnlyOdd) {
            System.out.println("The list contains only odd numbers.");
        } else {
            System.out.println("The list contains at least one even number.");
        }
    }
}
