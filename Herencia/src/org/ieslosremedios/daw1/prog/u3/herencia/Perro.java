package org.ieslosremedios.daw1.prog.u3.herencia;

public class Perro extends Animal{
    private String raza;

    public Perro (String raza){ //Constructor con un parámetro
        this.raza = raza;
    }

    public Perro (String raza, String nombre){ //Constructor con dos parámetros
        this.raza = raza;
        super.nombre = nombre;
        super.familia = familia;
    }

    public Perro (String raza, String nombre, String familia){
        this.raza = raza;
        super.nombre = nombre;
        super.familia = familia;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void presentacion(){
        System.out.println("El nombre de mi perro es " + getNombre() + " y su raza es " + getRaza());
    }
    public void ImprimePorPartes(){
        ladrarnombre();
        System.out.printf(" y soy de raza " + this.raza);
    }
}
