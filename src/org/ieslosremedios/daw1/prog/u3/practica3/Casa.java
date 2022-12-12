package org.ieslosremedios.daw1.prog.u3.practica3;

public class Casa {
    private Integer precio;
    private Character calificacionenergia;
    private String referenciacatastral;
    static final Integer iva = 21;
    static final Integer ivareducido = 16;

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
    public Integer getPrecio() {
        return precio;
    }

    public void setCalificacionenergia(Character calificacionenergia) {
        this.calificacionenergia = calificacionenergia;
    }
    public Character getCalificacionenergia() {
        return calificacionenergia;
    }

    public void setReferenciacatastral(String referenciacatastral) {
        this.referenciacatastral = referenciacatastral;
    }
    public String getReferenciacatastral() {
        return referenciacatastral;
    }

    public void CalcularIVA(){
        System.out.println("El precio con el IVA incluido sería: " + (precio * iva / 100 + precio));
    }

    public void IVAReducido(){
        System.out.println("El precio con el IVA reducido incluido sería: " + (precio * ivareducido / 100 + precio));
    }
    void MostrarInfo(){
        System.out.println("Referencia Catastral: " + this.referenciacatastral + " | Precio sin IVA: " + this.precio + " | Precio con IVA: " + (precio * iva / 100 + precio) + " | Precio con IVA reducido: " + (precio * ivareducido / 100 + precio));
    }
}
