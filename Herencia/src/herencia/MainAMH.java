package org.ieslosremedios.daw1.prog.u3.herencia;

public class MainAMH {
    public static void main(String[] args) {
    Abuela abuela1 = new Abuela();

    abuela1.setNombre("Ana");
    abuela1.setEdad(81);
    abuela1.setAnimalfavorito("Perro");

    abuela1.Presentar();
    abuela1.Despedida();
    System.out.println("-----------------------");


    Madre madre1 = new Madre();

    madre1.setNombre("Guadalupe");
    madre1.setEdad(50);
    madre1.setAnimalfavorito("Jirafa");

    madre1.MiMadreEs();
    madre1.Despedida();
    System.out.println("-----------------------");

    Hija hija1 = new Hija();

    hija1.setNombre("Valeria");
    hija1.setEdad(18);
    hija1.setAnimalfavorito("Gato");

    hija1.Presentar();
    hija1.Presentar(hija1.getAnimalfavorito(), hija1.getEdad());

    }
}
