package dataStructures;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        // Mapa(key, value)
        map.put("Jose", 26);
        map.put("Daniel", 18);
        map.put("Carolina", 30);
        map.put("Samir", 28);

        System.out.println("hashMap = " + map);

        treeMap.put("Jose", 26);
        treeMap.put("Daniel", 18);
        treeMap.put("Carolina", 30);
        treeMap.put("Samir", 28);

        System.out.println("treeMap = " + treeMap);

        linkedHashMap.put("Jose", 26);
        linkedHashMap.put("Daniel", 18);
        linkedHashMap.put("Carolina", 30);
        linkedHashMap.put("Samir", 28);

        System.out.println("linkedHashMap = " + linkedHashMap);

        System.out.println("La edad de José " + map.get("Jose"));
        String nombre = "David";
        for (String key: map.keySet()) {
            /*if (!map.containsKey(nombre)){
                System.out.println("No se encontró el nombre");
            }*/

            if (key.equals(nombre)){ // string.equals(string) -> ==
                System.out.println("Se encontró el nombre "+ nombre);
                System.out.println("Su edad es: "+ map.get(key));
            }
        }

        for (Map.Entry entry: map.entrySet()) {
            System.out.println("key = " + entry.getKey() + ": value = " + entry.getValue());
        }

        Iterator<String> it = map.keySet().iterator();

        while (it.hasNext()){
            System.out.println( "key: "+ it.next());
            System.out.println("value: "+ map.get(it.next()));
        }

    }

}
