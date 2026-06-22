package StringDemo;

import java.util.Scanner;

public class ValidUserName {
    
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            int size = username.length();
            int count = 0;
            if(size >= 4 && size <=10)
            {
                char arr[] = username.toCharArray();
                for(char c : arr)
                {
                    if(Character.isLetter(c))
                    {
                        ++count;
                    }
                }
                if(count == size)
                {
                    System.out.println("Valid username");
                }
                else
                {
                     System.out.println("Invalid username");
                }
            }
            
          
        }
    }
                                                                
}
