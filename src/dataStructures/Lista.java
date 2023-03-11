package dataStructures;

import java.util.*;

public class Lista {

    //ArrayList
    //Vector -> Stack(Pila)
    //LinkedList

    public static void main(String[] args) {

        //ArrayList
        List<String> names = new ArrayList<>();
        names.add("Jose");
        names.add("Julian");
        names.add("Carlos");
        names.add("Carolina");

        System.out.println(names.get(1));
        System.out.println(names.size());
        System.out.println(names.contains("Carlos"));

        for (String name: names) {
            System.out.println("name = " + name);
        }

        //Vector

        List<String> vector = new Vector<>();

        vector.add("Ricardo");
        vector.add("Julian");
        vector.add("Felipe");

        Iterator<String> iterator = vector.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.offer("Jose");
        linkedList.offer("Daniel");
        System.out.println(linkedList.offer("Raul"));

        //Stack o pilas

        // LIFO Last In First Out ultimo en entrar, primero en salir
        Stack<String> pila = new Stack<>();
        System.out.println(pila);
        pila.push("Jose");
        pila.push("Ricardo");
        pila.push("Daniela");
        pila.push("Ramiro");
        System.out.println(pila);
        System.out.println(pila.peek());
        System.out.println(pila.firstElement());

    }
}
