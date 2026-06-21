package InterfaceDemo;

public class InterfaceMain {
    public static void main(String[] args) 
    {
        Intern intern = new Intern(5000,500);
        intern.calculatePercentage();

        Trainee trainee = new Trainee(6000);
        trainee.calculatePercentage();
    }
}
