package org.ieslosremedios.daw1.prog.u3.herencia;

public class Animal {
    String nombre;
     String familia = "Canis familiaris"; //Campo creado para el constructor con dos parámetros
    public Animal (){}
    public Animal (String nombre, String familia){ //Constructor con dos parámetros
        this.nombre = nombre;
        this.familia = familia;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void ladrarnombre(){
        System.out.print("¡Guau! me llamo " + getNombre());
    }
}
