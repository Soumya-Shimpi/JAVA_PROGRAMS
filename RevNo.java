import java.util.*;
public class RevNo
{
	public static void main(String[] args)
	{
		int sum=0,rem,no;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 digit no:");
		no=sc.nextInt();
		
		/*
			or
		no =(no%10)*10 +((no/10)%10)*10+ no/100;
		*/
		while(no!=0)
		{
			
			rem=no %10;
			sum=sum * 10 + rem;
			no = no / 10;
		}
		System.out.println(sum);

	}	

}
