package CollectionFramework;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<String> Lset = new LinkedHashSet<>();
        Lset.add("Amit");
        Lset.add("Soumya");
        Lset.add("Arohi");
        System.out.println("Elements in LinkedHashSet are: " + Lset);

        // for(String s : Lset)
        // {
        //     System.out.println(s);
        // }
    }
}
