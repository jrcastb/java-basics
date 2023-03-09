package ejercicios;

import java.util.Scanner;

import static ejercicios.Ejercicio3.esPrimo;

public class Ejercicio4 {
    /**
     * Desarrollar un programa para mostrar por consola los primeros n números primos, siendo n
     * un valor que el usuario ingresará por consola.
     *
     * */
    public static void main(String[] args) {
        //

        System.out.println("==================Ejercicio 4==================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero n: ");
        int n = scanner.nextInt();

        int cont = 0;
        int i = 1;

        while (cont < n){
            if (esPrimo(i)){
                cont++;
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}
