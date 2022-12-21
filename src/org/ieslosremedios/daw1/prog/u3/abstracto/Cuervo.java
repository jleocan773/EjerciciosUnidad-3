package org.ieslosremedios.daw1.prog.u3.abstracto;

import org.w3c.dom.ls.LSOutput;

public class Cuervo extends Animal{
    final static Integer numPatas = 2;
    final static Boolean mamifero = false;
    final static Boolean volador = true;
    final static String sonido = "CAW CAW";

    @Override
    Integer getNumPatas() {return numPatas;}
    @Override
    Boolean esMamifero(){return mamifero;}
    @Override
    Boolean esVolador() {return volador;}
    @Override
    String hablar() {return sonido;}
}
