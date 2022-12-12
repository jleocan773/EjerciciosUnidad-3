package org.ieslosremedios.daw1.prog.u3.herencia;

public class Hija extends Madre {

    public Hija(){}
    public void Presentar(String animalfavorito) { //Sobrecarga 1 porque existe un método con el mismo nombre pero aquí añadimos parámetros cuando el original no los tiene
        System.out.println("Hola me llamo " + nombre + " y mi animal favorito es el " + animalfavorito);
    }

    public void Presentar(String animalfavorito, Integer edad){ //Sobrecarga 2 porque existe un método con el mismo nombre pero aquí añadimos parámetros cuando el original no los tiene
        System.out.println("Hola me llamo " + nombre + ", mi animal favorito es el " + animalfavorito + " y tengo " + edad + " años.");
    }

    @Override
    public void Presentar(){ //Sobrescritura 1 porque existe un método con el mismo nombre y sin parámetros (idéntico)
        System.out.println("Soy " + getNombre());
    }
    @Override
    public void AnimalFavorito(){ //Sobrescritura 2 porque existe un método con el mismo nombre y sin parámetros (idéntico)
        System.out.println("El animal que más me gusta es el " + getAnimalfavorito());
    }

}
