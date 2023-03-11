package estructuras;

import java.util.*;

public class TryCatch {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("El indice agregado esta por fuera de los limites.");
            System.out.println("El array tiene solo "+ (numbers.length-1) + " indices");
        } finally {
            System.out.println("Entró al finally");
        }
        int numero = 5;
        System.out.println(numbers);


    }
}

