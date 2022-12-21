package org.ieslosremedios.daw1.prog.u3.abstracto;

public class Caracol extends Animal {
    final static Integer numPatas = 0;
    final static Boolean mamifero = false;
    final static Boolean volador = false;
    final static String sonido = "i";

    @Override
    Integer getNumPatas() {
        return numPatas;
    }
    @Override
    Boolean esMamifero(){
        return mamifero;
    }
    @Override
    Boolean esVolador() {return volador;}
    @Override
    String hablar(){return sonido;}

}