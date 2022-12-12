package org.ieslosremedios.daw1.prog.u3.herencia;

public class Madre extends Abuela {

    public Madre(){}

    public void MiMadreEs(){
        System.out.println("El nombre de mi madre es " + nombre);
    }

    public void Despedida(){
        System.out.println("Adios Madre " + getNombre());
    }
}

