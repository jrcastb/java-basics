package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores
     * que el usuario ingresará por consola.
     * Recordá que un número a es múltiplo de b si a es divisible por b.
     *
     * */
    public static void main(String[] args) {
        System.out.println("==================Ejercicio 2==================");

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Escriba el numero n: ");
        int n = scanner.nextInt();

        System.out.println("Escriba el numero m: ");
        int m = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.println(m*i);
        }
        scanner.close();

    }
}
