package org.ieslosremedios.daw1.prog.u3.abstracto;

public class Humano extends Animal{
    final static Integer numPatas = 2;
    final static Boolean mamifero = true;
    @Override
    Integer getNumPatas() {
        return numPatas;
    }
    Boolean esMamifero(){
        return this.mamifero;
    }
}
