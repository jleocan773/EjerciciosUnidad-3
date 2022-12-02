package org.ieslosremedios.daw1.prog.u3.herencia;

public class B extends A {
    String c1 = "Amarillo";
    String c3 = "Verde";

    public void imprimirC1(){
        System.out.println(this.c1);
        System.out.println(c1);
        System.out.println(super.c1);
    }
    B(String c1){
        this.c1 = c1;
    }
}
