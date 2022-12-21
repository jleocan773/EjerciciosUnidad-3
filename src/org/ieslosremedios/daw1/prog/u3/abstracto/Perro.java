package org.ieslosremedios.daw1.prog.u3.abstracto;

public class Perro extends Animal {
    final static Integer numPatas = 4;
    final static Boolean mamifero = true;
    final static Boolean volador = false;
    final static String sonido = "Woof woof";

    @Override
    Integer getNumPatas() {return numPatas;}
    @Override
    Boolean esMamifero(){return mamifero;}
    @Override
    Boolean esVolador() {return volador;}
    @Override
    String hablar(){return sonido;}
}
