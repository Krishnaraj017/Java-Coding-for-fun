public class findLargestSmallestnumInArray {
    public static void main(String args[]) {
        int[] a1 = { 1, 3, 4, 5, 7 };
        int largest = a1[0];
        int smallest = a1[0];
        for (int number : a1) {
            if (number > largest) {
                largest = number;
            } else if (number >smallest) {
                smallest = number;
            }

        }
        System.out.printf("largest is" + largest+ "smallest is" + smallest);
    }
}
