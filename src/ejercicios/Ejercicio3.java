package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Desarrollar un programa para informar si un número n es primo o no, siendo n un
     * valor que el usuario ingresará por consola.
     * Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
     *
     * */

    public static boolean esPrimo(int n){
        boolean div = false;
        for (int i = 2; i < n && !div; i++) {
            if (n%i == 0){
                div = true;
            }
        }

        return !div;
    }
    public static void main(String[] args) {
        System.out.println("==================Ejercicio 3==================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero n: ");
        int n = scanner.nextInt();

        System.out.println(n + ", es primo: "+ esPrimo(n));

        scanner.close();


    }
}
