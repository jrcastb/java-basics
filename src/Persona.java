import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Persona implements Comparable<Persona> {
    private int rollno;
    private String name;
    private int age;

    public Persona(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Persona o) {
        if(age==o.age)
            return 0;
        else if(age>o.age)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Persona Karo = new Persona(102,"Karolinaa",30);
        Persona Jose = new Persona(101,"Jose",26);
        Persona Nieves = new Persona(103,"Nieves",60);

        personas.add(Karo);
        personas.add(Jose);
        personas.add(Nieves);

        personas.forEach(persona -> System.out.println(persona.toString()));

        Collections.sort(personas);

        System.out.println(Jose.compareTo(Nieves));
        personas.forEach(persona -> System.out.println(persona.toString()));
    }
}
