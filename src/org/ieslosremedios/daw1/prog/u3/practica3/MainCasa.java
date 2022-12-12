package org.ieslosremedios.daw1.prog.u3.practica3;

public class MainCasa {
    public static void main(String[] args) {

    Casa casa1 = new Casa();
    char char1='a';


    casa1.setPrecio(500);
    casa1.setCalificacionenergia(char1);
    casa1.setReferenciacatastral("1919727");

    casa1.CalcularIVA();
    casa1.IVAReducido();
    casa1.MostrarInfo();

    }
}
