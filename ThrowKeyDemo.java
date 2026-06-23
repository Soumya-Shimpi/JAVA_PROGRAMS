package ExceptionHandling;

public class ThrowKeyDemo {
    public static void divide(int x, int y)
    {
        try {
            if (y == 0) 
                throw new Exception("The divisor should not be zero");
                int z =x/y;
                System.out.println("Result is: "+ z);
        
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        divide(10, 0);
    }
}
