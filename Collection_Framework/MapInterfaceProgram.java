package CollectionFramework;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapInterfaceProgram 
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeMap<Integer, Character> studentGrades = new TreeMap<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Total Marks (0-100): ");
            int totalMarks = sc.nextInt();

            char grade;

            if (totalMarks >= 90 && totalMarks <= 100) {
                grade = 'A';
            } 
            else if (totalMarks >= 80) {
                grade = 'B';
            } 
            else if (totalMarks >= 70) {
                grade = 'C';
            } 
            else if (totalMarks >= 60) {
                grade = 'D';
            } 
            else if (totalMarks >= 50) {
                grade = 'E';
            } 
            else {
                grade = 'F';
            }

            studentGrades.put(rollNo, grade);
        }

        System.out.println("\nStudent Grades:");
        for (Map.Entry<Integer, Character> entry : studentGrades.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() +
                               " Grade: " + entry.getValue());
        }

        sc.close();
    }

}


