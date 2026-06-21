package InterfaceDemo;
public class Trainee implements DataProvider
{
    int markSecured;
    Trainee(int markSecured)
    {
        this.markSecured = markSecured;
    }
    public void calculatePercentage()
    {
        double percentage =(markSecured * 100.0) / totalMaximumMarks;
        System.out.println("Percentage: " +percentage + "%");
    }
}
