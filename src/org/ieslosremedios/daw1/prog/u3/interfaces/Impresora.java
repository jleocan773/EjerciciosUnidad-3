package org.ieslosremedios.daw1.prog.u3.interfaces;

public class Impresora implements Imprimible {
    String pagina;
    Impresora(){
        pagina = Imprimible.pagina;
    }

    @Override
    public void Imprimir() {
        System.out.println(pagina);
    }

}

