package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String [] args)
    {
        List<String>lst = new LinkedList<>();
        lst.add("Amit");
        lst.add("Soumya");
        lst.add("Arohi");

        for(int i=0;i<lst.size();i++)
        {
            System.out.println(lst.get(i));
        }

        ((LinkedList<String>) lst).removeFirst();
        ((LinkedList<String>) lst).removeLast();
        System.out.println("After Removing the First and Last Element" + lst);
       
        System.out.println("Adding new Elements At first and Last Position");
        ((LinkedList<String>) lst).addFirst("Shree");
        ((LinkedList<String>) lst).addLast("Isha");

        Iterator<String> itr = lst.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
