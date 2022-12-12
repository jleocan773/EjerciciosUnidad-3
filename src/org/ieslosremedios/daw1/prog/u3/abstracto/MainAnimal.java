package org.ieslosremedios.daw1.prog.u3.abstracto;

public class MainAnimal {
    public static void main(String[]args){
        Animal a = new Perro();
        System.out.println("-----------------------------------------");
        System.out.println("Número de patas: " + a.getNumPatas());
        System.out.println("¿Es mamífero?: " + a.esMamifero());
        System.out.println("-----------------------------------------");
        Animal b = new Humano();
        System.out.println("Número de patas: " + b.getNumPatas());
        System.out.println("¿Es mamífero?: " + b.esMamifero());
        System.out.println("-----------------------------------------");
        Animal c = new Caracol();
        System.out.println("Número de patas: " + c.getNumPatas());
        System.out.println("¿Es mamífero?: " + c.esMamifero());
        System.out.println("-----------------------------------------");
    }
}
