package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.LinkedList;
import java.util.List;


class Course
{
    String courseName;

    Course(String courseName)
    {
        this.courseName= courseName;
    }

    public String toString()
    {
        return courseName;
    }
}
public class ListInterface {
    public static void main(String[] args)
    {
       // List<Course> courseList = new LinkedList<>();
         List<Course> courseList = new ArrayList<>();
        courseList.add(new Course("JAVA"));
        courseList.add(new Course("C++"));
        courseList.add(new Course("AJP"));
        

        // Accessing the list of courses Using Iterator
		Iterator<Course> courseIterator = courseList.iterator();
		System.out.println("Using Iterator to access the list of courses");
		while (courseIterator.hasNext()) 
        {
			Course c = courseIterator.next();
			System.out.println(c); // toString() method has been overridden in the Course class
		}

		// Accessing the list of courses Using for loop
		System.out.println("Using for loop to access the list of courses");
		for (int index = 0; index < courseList.size(); index++) 
        {
			System.out.println(courseList.get(index));
		}

		// Accessing the list of courses Using enhanced for loop (for-each)
		System.out.println("Using enhanced for loop to access the list of courses");
		for (Course c : courseList)
        { // Can be read as: for each Course c in courseList
			System.out.println(c);
		}
    }   
}
