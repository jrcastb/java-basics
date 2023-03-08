import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hola José");
        char x = 'c';
        int edad = 26;
        int numeroNegativo = -2;
        short numShort = 50;
        float numFloat = 15.6f;
        long numLong = 25;
        double numDouble = 55.5;
        boolean bool = false;
        final int CEL_JOSE = 311;
        var n = 10;

        //Scanner scanner = new Scanner(System.in);
        //String nombre = scanner.nextLine();

        //System.out.println("nombre = " + nombre);

        Character y = 'c';
        Integer age = 16;
        Short numS = 50;
        Float flotante = 10f;
        Long longNum = 20L;
        Double doubleNum = 55.5;
        Boolean booln = true;
        int dia = 1;

        /*Double.parseDouble(age.toString());

        String greeting = "Hola, soy José y tengo: ";

        System.out.println(greeting instanceof String);

        System.out.println(greeting + edad);*/

        /*
        * OPERADORES DE ASIGNACION Y ARITMETICOS
        *  Asignacion       ->      =
        *  Suma             ->      +
        *  Resta            ->      -
        *  Multiplicación   ->      *
        *  División         ->      /
        *  Modulo           ->      %
        *
        * OPERADORES UNARIOS
        * incremento                ++
        * decremento                --
        *                           +i
        *                           -i
        * negacion                  !(x == y)
        *
        * OPERADORES LOGICOS
        * AND       &&
        * OR        ||
        * NOT        !
        * XOR        ^
        * Ternario   ?:
        * instanceof
        * */
        
        int edadJose = 26;
        int edadJuan = 18;

        boolean edadBool = edadJose == edadJuan;
        boolean and = true && true; //false - true
        boolean or = true || true;
        boolean xor = false ^ false;
        System.out.println("xor = " + xor);
        suma(edad, n);

        

        /*
        * ESTRUCTURAS DE CONTROL
        *       FOR
        *       FOREACH
        *       IF ELSE
        *       WHILE
        *       SWITCH CASE
        *       TRY CATCH
        *       DO WHILE
        * */

        if (edadJose == edadJuan){
            System.out.println("La edad es igual");
        } else if (edadJose != edadJuan) {
            System.out.println("La edad es diferente");
        } else {
            System.out.println("No se conocen las edades");
        }

        System.out.println("=============ESCRIBA EL DIA DE LA SEMANA===============");

        /*Scanner sc = new Scanner(System.in);
        int diaDeSemana = sc.nextInt();

        switch (diaDeSemana){
            case 1,7:{
                System.out.println("Hoy es Lunes");
                break;
            }
            case 2:{
                System.out.println("Hoy es Martes");
                break;
            }
            case 3:{
                System.out.println("Hoy es Miercoles");
                break;
            }
            case 4:{
                System.out.println("Hoy es Jueves");
                break;
            }
            case 5:{
                System.out.println("Hoy es Viernes");
                break;
            }
            case 6:{
                System.out.println("Hoy es Sábado");
                break;
            }
            default:{
                System.out.println("Hoy es Domingo");
                break;
            }
        }*/

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8}; // 0 = 1, 1 = 2, 2 = 3, 3 = 4, 4 = 5
        String[] nombres = {"José", "Juan", "Daniela", "Edwin"}; // 0 = "Jose", 1 = "Juan", 2 = "Daniela", 3 = "Edwin"

        //System.out.println(numeros.length);

        /*for (int i = numeros.length-1; i >= 0; i--) {  // i = 0 - i es menor que 8?
            System.out.println(numeros[i]);  //numeros[0] = 1 -> i++
        }*/
        //i = 1 -> i es menor que 8?
        //numeros[1] = 2 -> i++

        /*for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }

        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // FOR COMÚN
        for (int i = 0; i < matrix.length; i++) {
            //System.out.println(Arrays.toString(matrix[i]));
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //FOREACH
        for (int[] ints : matrix) {
            //System.out.println(Arrays.toString(matrix[i]));
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }*/

        //WHILE
        /*int numWhile = 1;
        while (numWhile <= 100){ // nunca va a ser true
            System.out.println("numWhile = " + numWhile);
            numWhile+=2;
        }*/

        // Encontrar el factorial de un numero

        System.out.println("========EJERCICIO FACTORIAL========");
        System.out.println("Escribe el número: ");

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt(); //Numero de veces que vamos a multiplicar el mismo numero
        int i = 1;
        factorial(i, numero);

    }

    public static void factorial(int i,int numero){
        int fact = 1; 
        while (i <= numero){
            fact *= i;
            i++;
        }
        System.out.println("El factorial de = " + numero + " es: " + fact);
    }
    public static void suma(int a, int b){
        int result = a + b;
        System.out.println("result = " + result);
    }


}