package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * Desarrollar un programa para mostrar por consola los primeros n números naturales que
     * tienen al menos m dígitos d, siendo n, m y d valores que el usuario ingresará por consola.
     * Por ejemplo: si el usuario ingresa n=5, m=2 y d=3, el programa deberá mostrar por consola
     * los primeros 5 números naturales que tienen, al menos, 2 dígitos 3. En este caso la salida
     * será: 33, 133, 233, 303, 313
     * */

    public static int charCount(String s, char c){
        int i = 0;
        int cont = 0;
        while (i < s.length()){
            if (s.charAt(i) == c){
                cont++;
            }
            i++;
        }
        return cont;
    }
    public static boolean isTrue(int i, int m, int d){
        return charCount(Integer.toString(i),(char)(d+'0')) == m;
    }
    public static void main(String[] args) {
        System.out.println("==================Ejercicio 5==================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero n: ");
        int n = scanner.nextInt();

        System.out.println("Escriba el numero m: ");
        int m = scanner.nextInt();

        System.out.println("Escriba el numero d: ");
        int d = scanner.nextInt();

        int i = 0;
        int cont = 0;

        while (cont < n){
            if (isTrue(i, m, d)){
                cont++;
                System.out.println(i);
            }
            i++;
        }
        scanner.close();
    }
}
