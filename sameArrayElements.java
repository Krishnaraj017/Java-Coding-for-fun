import java.util.Arrays; // Importing the Arrays class from the java.util package
import java.util.HashSet; // Importing the HashSet class from the java.util package
import java.util.Set; // Importing the Set interface from the java.util package

public class sameArrayElements { // Declaring a class named sameArrayElements

    public static void main(String[] args) { // Declaring the main method
        Integer[] a1 = { 1, 2, 3, 2, 1 }; // Declaring an array of Integers named a1 and initializing it with some
                                          // values
        Integer[] a2 = { 1, 2, 3 }; // Declaring another array of Integers named a2 and initializing it with some
                                    // values
        Integer[] a3 = { 1, 2, 3, 7 }; // Declaring another array of Integers named a3 and initializing it with some
                                       // values

        System.out.println(sameElements(a1, a2)); // Calling the sameElements method with a1 and a2 as arguments and
                                                  // printing the returned value
        System.out.println(sameElements(a1, a3)); // Calling the sameElements method with a1 and a3 as arguments and
                                                  // printing the returned value
    }

    static boolean sameElements(Object[] array1, Object[] array2) { // Declaring a method named sameElements that takes
                                                                    // two arrays of Objects as arguments and returns a
                                                                    // boolean value
        Set<Object> uniqueElements1 = new HashSet<>(Arrays.asList(array1)); // Creating a new HashSet from the first
                                                                            // array and storing it in a variable named
                                                                            // uniqueElements1
        Set<Object> uniqueElements2 = new HashSet<>(Arrays.asList(array2)); // Creating a new HashSet from the second
                                                                            // array and storing it in a variable named
                                                                            // uniqueElements2

        // if size is different, means there will be a mismatch
        if (uniqueElements1.size() != uniqueElements2.size()) // Checking if the sizes of the two sets are different
            return false; // Returning false if they are different

        for (Object obj : uniqueElements1) { // Iterating over the elements of the first set using a for-each loop
            // element not present in both?
            if (!uniqueElements2.contains(obj)) // Checking if the second set contains the current element
                return false; // Returning false if it doesn't contain the element
        }

        return true; // Returning true if all elements are present in both sets
    } // End of the sameElements method
} // End of the sameArrayElements class
