public class DoWhileReverse
{
    public static void main(String[] args)
    {
        int no=123, sum=0,rem;

        do{
            rem=no % 10;
            sum= sum * 10 + rem;
            no = no / 10;
            
        }
        while(no != 0);
        System.out.println(sum);
    }


}