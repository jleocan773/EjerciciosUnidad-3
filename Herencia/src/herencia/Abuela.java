package org.ieslosremedios.daw1.prog.u3.herencia;

public class Abuela {
     String nombre;
     Integer edad;
     String animalfavorito;

    public Abuela(){} //Constructor sin parámetros
    public Abuela(String nombre, Integer edad){}; //Constructor con parámetros

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public Integer getEdad() {
        return edad;
    }

    public void setAnimalfavorito(String animalfavorito) {
        this.animalfavorito = animalfavorito;
    }
    public String getAnimalfavorito() {
        return animalfavorito;
    }

    public void Presentar(){
        System.out.println("Mi Abuela " + getNombre() + " tiene " + getEdad());
    }
    public void Despedida(){
        System.out.println("Adios Abuela " + getNombre());
    }
    public void AnimalFavorito(){
        System.out.println("Su animal favorito es: " + getAnimalfavorito());
    }
}
