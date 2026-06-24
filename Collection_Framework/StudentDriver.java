package CollectionFramework;
import java.util.HashSet;

public class StudentDriver {
 
    public static void main(String[] args) {
        Student s1 = new Student("Amit", 101);
        Student s2 = new Student("Amit", 101);
        
        HashSet<Student> studentSet = new HashSet<Student>();
        studentSet.add(s1);
        studentSet.add(s2);
        System.out.println("Number of students in the set: " + studentSet.size());

    }
    
}
