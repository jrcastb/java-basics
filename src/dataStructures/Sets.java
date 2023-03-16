package dataStructures;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> hashSet2 = new LinkedHashSet<>();
        //Set<Integer> linkedHashSet = new LinkedHashSet<>();

        /*while (hashSet.size() <= 10){
            int random = (int) (Math.random() * 100) +1;
            hashSet.add(random);
            linkedHashSet.add(random);
            treeSet.add(random);
        }

        System.out.println("Salida de hashSet");
        System.out.println(hashSet);
        System.out.println("Salida de linkedHashSet");
        System.out.println(linkedHashSet);
        System.out.println("Salida de treeSet");
        System.out.println(treeSet);*/
        
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);

        System.out.println("hashSet = " + hashSet);
        
        hashSet2.add(20);
        hashSet2.add(30);
        hashSet2.add(40);
        hashSet2.add(50);

        System.out.println("hashSet2 = " + hashSet2);

        Set<Integer> union = new TreeSet<>();
        
        union.addAll(hashSet);
        union.addAll(hashSet2);

        System.out.println("union = " + union);

        Set<Integer> intersection = new TreeSet<>();
        
        intersection.addAll(hashSet);
        intersection.retainAll(hashSet2);

        System.out.println("intersection = " + intersection);

    }
}
