import java.util.*;
public class pallindrome{

     public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int l=s.length();
        String s1="";
        while(l>0)
        {
            s1=s1+s.charAt(l-1);
            l=l-1;

        }
        if(s.equals(s1))
        {
            System.out.println("Pallindrome String");
        
        }
        else
        System.out.println("Not a Pallindrome");
        
    }
}