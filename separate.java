import java.util.ArrayList;
import java.util.List;

public class separate {
    public static void main(String[] args) {
        String[] strArray = {"AAA", "BBB", "CCC"};
        ArrayList<String> list = new ArrayList<>();
        
        for (String s : strArray) {
            list.add(s);
        }
        
        for (String s : list) {
            System.out.println(s);
        }
    }
}
