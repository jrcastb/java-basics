package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EjercicioMaps {

    /**
     * Directorio telefonico
     * Es necesario crear funciones para obtener, agregar, modificiar y eliminar. (CRUD) Create - Read - Update - Delete
     * información del directorio.
     * */
    public static void main(String[] args) {
        Map<String, Long> directory = new TreeMap<>();

        createEntry(directory, "Jose", 311164585L);
        createEntry(directory,"Javier", 12549668123L);
        createEntry(directory,"Carolina", 5789421557L);
        createEntry(directory, "Maria", 31187875415L);


        System.out.println("Agregar entradas");
        System.out.println(directory);

        System.out.println("Actualización de entrada");
        System.out.println(updateEntryByName(directory,"Jose", 311164222L ));

        System.out.println("Lectura de todas las entradas");
        readAllEntries(directory);

        System.out.println("Lectura de entrada por su llave");
        readEntryByName(directory, "Carolina");

        System.out.println("Eliminar una entrada por su llave");
        deleteEntryByName(directory, "Javier");
        System.out.println("El nuevo directorio es: "+directory);

    }

    static Map<String, Long> createEntry(Map<String, Long> directory, String name, Long phoneNumber){
        directory.put(name, phoneNumber);
        return directory;
    }

    static Map<String, Long> updateEntryByName(Map<String, Long> entry, String name, Long phoneNumber){
        if (entry.containsKey(name)){
            entry.replace(name, phoneNumber);
        }
        return entry;

    }
    static void readAllEntries(Map<String, Long> entries){
        System.out.println(entries);
    }
    static void readEntryByName(Map<String, Long> entries, String name){
        System.out.println("El número de telefono de "+ name +" es: "+  entries.get(name));
    }
    static void deleteEntryByName(Map<String, Long> entries, String name){
        if (entries.containsKey(name)){
            entries.remove(name);
            System.out.println("Se eliminó el número de teléfono de: "+ name);
        }
    }

}
