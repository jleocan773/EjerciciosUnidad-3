package org.ieslosremedios.daw1.prog.u3.abstracto;

public class Humano extends Animal{
    final static Integer numPatas = 2;
    final static Boolean mamifero = true;
    final static Boolean volador = false;
    final static String sonido = "Hola buenas tardes";

    @Override
    Integer getNumPatas() {return numPatas;}
    @Override
    Boolean esMamifero() { return mamifero;}
    @Override
    Boolean esVolador() {return volador;}
    @Override
    String hablar(){return sonido;}
}
