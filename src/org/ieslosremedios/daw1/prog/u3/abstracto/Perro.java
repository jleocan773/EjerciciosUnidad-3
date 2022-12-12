package org.ieslosremedios.daw1.prog.u3.abstracto;

public class Perro extends Animal {
    final static Integer numPatas = 4;
    final static Boolean mamifero = true;
    @Override
    Integer getNumPatas() {
        return numPatas;
    }
    Boolean esMamifero(){
        return mamifero;
    }
}
