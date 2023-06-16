public class duplicatesInArray {
    public static void main(String args[]) {
        String[] a1 = { "hero","zero" ,"hero"};
      // int[]a1={1,2,4,5,1};
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = i + 1; j < a1.length; j++) {
                if (a1[i] == a1[j]&&i!=j  ) {
                    System.out.println("duplicate element is " + a1[j]);
                }

            }
        }
    }

}
