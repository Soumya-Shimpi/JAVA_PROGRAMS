import java.util.*;
public class PalindromeNo
{
    public static void main(String [] args)
    {
       int rem,reverseNo=0,no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no to check Palindrome or not");
        no=sc.nextInt();
       int original=no;
        while(no !=0)
        {
            rem = no %10;
            reverseNo=reverseNo*10+rem;
            no = no/10;
        }    
        if(original == reverseNo)
        {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is Not Palindrome");
        }
        

    }
}