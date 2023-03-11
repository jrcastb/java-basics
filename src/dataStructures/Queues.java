package dataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Queues {
    // FIFO -> First in First out
    public static void main(String[] args) {
        /**
         * PriorityQueue
         * */
        /*Queue<String> nombres = new PriorityQueue<>();

        nombres.offer("Jose");
        nombres.offer("Ricardo");
        nombres.offer("Carolina");
        nombres.offer("Kevin");
        nombres.offer("Andres");

        Queue<Integer> numeros = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            numeros.offer((int)(Math.random() * 100) + 1);
        }

        System.out.println(nombres);
        System.out.println(numeros);

        System.out.println(nombres.peek());
        System.out.println(numeros.peek());

        System.out.println(numeros.remove());
        System.out.println(nombres.remove());*/

        /**
         * BlockingQueue
         * */
        /*ArrayBlockingQueue<String> bQueue = new ArrayBlockingQueue<>(5);
        try{
            bQueue.add("Jose");
            bQueue.add("Ricardo");
            bQueue.add("Daniel");
            bQueue.add("Carlos");
            bQueue.add("Carolina");
            bQueue.add("Fernando");
        } catch (IllegalStateException illegalStateException){
            System.out.printf("Error: está intentando agregar otro elemento cuando la cola está llena. " +
                    "La cola tiene una capacidad de: %d elementos\n", bQueue.size());
        }
        System.out.println(bQueue);*/
        
        /**
         * Deque -> ArrayDeque
         * Queue principio FIFO
         * Stack principio LIFO
         * Deque tienen los dos principios LIFO y FIFO
         * */

        ArrayDeque<String> deque = new ArrayDeque<>();
        
        deque.offer("Jose");
        deque.offer("Ricardo");
        deque.offer("Valentina");
        deque.offer("Mariana");

        System.out.println("deque = " + deque);

        System.out.println(deque.removeFirst());

        System.out.println("deque = " + deque);

        System.out.println(deque.removeLast());

        for (String nombres:
             deque) {
            System.out.println(deque.remove());
        }
        System.out.println(deque);
        
    }
}
