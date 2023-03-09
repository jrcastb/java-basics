package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    /**
    * Desarrollar un programa para mostrar los primeros n números pares, siendo n un valor que
    * el usuario ingresará por consola.
    * Recordá que un número es par cuando es divisible por 2.
    * */
    public static void main(String[] args) {
        System.out.println("==================Ejercicio 1==================");
        System.out.println("Escriba el numero: ");
        Scanner scanner = new Scanner(System.in);
        //Clase nombre  = new Objeto()

        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(2*i);
        }
        scanner.close();

    }
}
