package org.ieslosremedios.daw1.prog.u3.interfaces;

public class TestImpresora {
    public static void main(String[] args) {
        Imprimible impresora1 = new Impresora();
        impresora1.Imprimir();
        System.out.println(Imprimible.pagina);
    }
}
