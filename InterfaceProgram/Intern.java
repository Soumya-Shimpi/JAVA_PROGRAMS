package InterfaceDemo;

public class Intern implements DataProvider{
    int markSecured;
    int graceMarks;

    Intern(int markSecured, int graceMarks){
        this.markSecured = markSecured;
        this.graceMarks = graceMarks;
    }
    public void calculatePercentage()
    {
        int totalMarks = markSecured + graceMarks;
        double percentage = (totalMarks * 100.0) / totalMaximumMarks;
        System.out.println("Percentage: " + percentage + "%");

    }
}
