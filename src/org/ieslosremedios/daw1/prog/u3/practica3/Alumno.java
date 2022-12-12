package org.ieslosremedios.daw1.prog.u3.practica3;

public class Alumno {
    private String nombre;
    private String apellidos;
    private Integer edad;
    private Boolean repite;
    private Integer notamedia;
    private String correoelectronico;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setRepite(Boolean repite) {
        this.repite = repite;
    }
    public void setNotamedia(Integer notamedia) {
        this.notamedia = notamedia;
    }
    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public Integer getEdad() {
        return edad;
    }
    public Boolean getRepite() {
        return repite;
    }
    public Integer getNotamedia() {
        return notamedia;
    }
    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void MostrarInfo(){
        System.out.println("Alumno: " + this.nombre + this.apellidos + " | Edad: " + this.edad);
    }

    public Alumno(){};
    public Alumno(String nombre, String apellidos, Integer edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
}
