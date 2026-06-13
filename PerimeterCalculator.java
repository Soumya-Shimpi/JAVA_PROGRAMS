class Rectangle
{
    private int length;
    private int breadth;

    public void calCulatePerimeter(int l, int b)
    {   
        this.length=l;
        this.breadth=b;
        int res;
        res= 2*(length + breadth);
        System.out.println("Perimeter of Rectangle: "+ res);
    }
}
public class PerimeterCalculator
{
    public static void main(String[] args)
    {
        Rectangle rect = new Rectangle();
        rect.calCulatePerimeter(2,2);
    }
}