package main;

import entidades.Perro;
import entidades.Persona;

public class Main {

    public static void main(String[] args) {

        Persona p1 = new Persona();
        p1.setNombre("Javier");
        
        Persona p2 = new Persona();
        p2.setNombre("Sebastian");
        
        Perro perro1 = new Perro();
        perro1.setNombre("Chiquito");
        
        Perro perro2 = new Perro();
        perro2.setNombre("Pepa");
        
        p1.setPerro(perro1);
        p2.setPerro(perro2);
        
        System.out.println(p1);
        System.out.println(p2);

    }

}
