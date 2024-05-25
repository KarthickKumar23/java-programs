import java.util.*;



public class palindrome {
    public static void main(String args[])
    {
        String original,reverse="";
        Scanner in = new Scanner(System.in);
        System.out.println("numstring to be entered");
        original = in.nextLine();   
        int length = original.length();  
        for(int i = length - 1;i>=0;i--) {
            reverse = reverse+original.charAt(i);
        }
           if(original.equals(reverse))
           {
               System.out.println(original+" It is a palindrome");

           }
           else{
               System.out.println(original+"It is not a palindrome");
               
        }
    }
    
}