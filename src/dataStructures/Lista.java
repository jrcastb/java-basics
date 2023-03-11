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

        /**
         *  Palindroma -> reconocer
         *  aerea
         *  ana
         *  oso
         *  oro
         *  Responder si dada una palabra esta es palindroma o no haciendo uso de stacks
         *  Crear la función esPalindromo(String word);
         * */

        Stack<Character> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("=============INICIO DEL PROGRAMA============");
        String word = scanner.nextLine().toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        System.out.println(stack);//O(n)

        String reverseWord = "";
        while (!stack.empty()){
            reverseWord += stack.pop();
        }

        System.out.println(reverseWord);
        
        String out = "";
        out = word.equals(reverseWord) ? "La palabra es palindroma" : "La palabra no es palindroma";

        System.out.println(out);
        
        /*if (word.equals(reverseWord)){
            System.out.println("La palabra es palindroma");
        }else {
            System.out.println("La palabra no es palindroma");
        }*/



    }
}
