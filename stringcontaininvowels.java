public class stringcontaininvowels {
    public static void main(String args[]) {
        System.out.println(vowelss("hello"));
        

        
    }
    public static boolean vowelss(String input){
        return input.toLowerCase().matches(".*[aeiou].*");

    }
    
}
