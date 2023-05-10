public class removeWhiteSpace{
    static String removespace(String input){
        StringBuilder out=new StringBuilder();
        char[] charArray=input.toCharArray();
        for(char c:charArray){
            if(!Character.isWhitespace(c))
            out.append(c);
        }


        return out.toString();
        
    }
    public static void main(String args[]){
        System.out.println(removespace("huhf bfuf"));
    }


}