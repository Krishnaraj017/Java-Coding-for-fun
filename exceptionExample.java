public class exceptionExample {
    public static void main(String[] args) {
        // Example of IllegalArgumentException
        int age = -10;
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        // Example of NullPointerException
        String name = null;
        try {
            if (name.isEmpty()) {
                System.out.println("Name is empty");
            }
        } catch (NullPointerException e) {
            System.out.println("Name is null");
        }
    }
}
