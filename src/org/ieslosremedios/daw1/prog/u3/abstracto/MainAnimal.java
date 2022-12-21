package org.ieslosremedios.daw1.prog.u3.abstracto;

public class MainAnimal {
    public static void main(String[]args){
        Animal a = new Perro();
        System.out.println("-----------------------------------------");
        System.out.println("Perro");
        System.out.println("Número de patas: " + a.getNumPatas());
        System.out.println("¿Es mamífero?: " + a.esMamifero());
        System.out.println("¿Es volador?: " + a.esVolador());
        a.dormir();
        System.out.println("El perro hace: " + a.hablar());
        System.out.println("-----------------------------------------");

        Animal b = new Humano();
        System.out.println("Humano");
        System.out.println("Número de patas: " + b.getNumPatas());
        System.out.println("¿Es mamífero?: " + b.esMamifero());
        System.out.println("¿Es volador?: " + b.esVolador());
        b.dormir();
        System.out.println("El humano hace: " + b.hablar());
        System.out.println("-----------------------------------------");

        Animal c = new Caracol();
        System.out.println("Caracol");
        System.out.println("Número de patas: " + c.getNumPatas());
        System.out.println("¿Es mamífero?: " + c.esMamifero());
        System.out.println("¿Es volador?: " + c.esVolador());
        System.out.println("El caracol hace: " + c.hablar());
        c.dormir();
        System.out.println("-----------------------------------------");

        Animal d = new Cuervo();
        System.out.println("Cuervo");
        System.out.println("Número de patas: " + d.getNumPatas());
        System.out.println("¿Es mamífero?: " + d.esMamifero());
        System.out.println("¿Es volador?: " + d.esVolador());
        System.out.println("El cuervo hace: " + d.hablar());
        d.dormir();
        System.out.println("-----------------------------------------");
    }
}
