package estructuras;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        byte opt = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            // Se ubican instrucciones que se ejecutan por lo menos una vez
            System.out.println("1. Ejecutar la opcion 1");
            System.out.println("2. Ejecutar la opcion 2");
            System.out.println("3. Ejecutar la opcion 3");
            System.out.println("4. Ejecutar la opcion 4");

            System.out.println("Escriba un numero para seleccionar la opcion que desea ejecutar: ");

            opt = scanner.nextByte();

        } while (opt <1 || opt > 4);

        switch (opt){
            case 1:
                System.out.println("Se ejecutó la opción #1");
                break;
            case 2:
                System.out.println("Se ejecutó la opción #2");
                break;
            case 3:
                System.out.println("Se ejecutó la opción #3");
                break;
            case 4:
                System.out.println("Se ejecutó la opción #4");
                break;
        }
    }
}
