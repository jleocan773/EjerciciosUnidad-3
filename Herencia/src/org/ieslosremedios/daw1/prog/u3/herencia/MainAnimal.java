package org.ieslosremedios.daw1.prog.u3.herencia;

public class MainAnimal {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Podenco");
        Perro perro2 = new Perro("Husky", "Rocket");
        Perro perro3 = new Perro("Dálmata", "Ciento", "Canis familiaris");


        perro1.setNombre("Toby"); //Tras crear el constructor de 1 parámetro ya no hace falta esto
        perro1.setRaza("Podenco"); //Tras crear el constructor de 1 parámetro ya no hace falta esto

        System.out.println("Mi perro se llama " + perro1.getNombre() + " y es de raza " + perro1.getRaza());
        perro1.presentacion();
        perro1.ladrarnombre();
        System.out.println(); //No sé como hacer que el método de arriba deje una línea en blanco después de su
                              // ejecución, pero que no lo haga abajo, así que uso un println.
        perro1.ImprimePorPartes();

        System.out.println();
        System.out.println("-------------------------------------------------------------");

        System.out.println("Mi perro se llama " + perro2.getNombre() + " y es de raza " + perro2.getRaza());
        perro2.presentacion();
        perro2.ladrarnombre();
        System.out.println();
        perro2.ImprimePorPartes();

        System.out.println();
        System.out.println("-------------------------------------------------------------");

        System.out.println("Mi perro se llama " + perro3.getNombre() + " y es de raza " + perro3.getRaza());
        System.out.println("Los perros son de la familia: " + perro3.familia);
        perro3.presentacion();
        perro3.ladrarnombre();
        System.out.println();
        perro3.ImprimePorPartes();

    }
}
