package CollectionFramework;

import java.util.*;

public class TreeSet {
    
    public static void main(String[] args) {
        Set<String> treeSet = new java.util.TreeSet<>();
        treeSet.add("Mars");
        treeSet.add("Earth");
        treeSet.add("Neptune");

        //Accessing elements using for-each loop
        for(String e : treeSet)
        {
            System.out.println(e);
        }

        //Taking the first and last element from the TreeSet
        System.out.println("First Element:"+ ((java.util.TreeSet<String>) treeSet).first());//casting
        System.out.println("Last Element:"+ ((java.util.TreeSet<String>) treeSet).last());//casting
    }
}
// Tree Set is a part of the Java Collection Framework and implements the Set interface. 
// It stores elements in a sorted order and does not allow duplicate elements. 
