public class Empleado {
        private String nombre;
        private String apellidos;
        private String dni;
        private Direccion direccion;

        public String getNombre() {
                return nombre;
        }
        public void setNombre(String nombre) {
                this.nombre = nombre;
        }
        public String getApellidos() {
                return apellidos;
        }
        public void setApellidos(String apellidos) {
                this.apellidos = apellidos;
        }
        public String getDni() {
                return dni;
        }
        public void setDni(String dni) {
                this.dni = dni;
        }
        public void despedir() {
                System.out.println("Se va a despedir a " + nombre + " que vive en " + direccion.getCalle());
        }
}

class Guia extends Empleado {
        private String experiencia;
        private String fecha_inicio_contrato;
        private String fecha_fin_contrato;

        public String getExperiencia() {
                return experiencia;
        }
        public void setExperiencia(String experiencia) {
                this.experiencia = experiencia;
        }
        public String getFecha_inicio_contrato() {return fecha_inicio_contrato;
        }
        public void setFecha_inicio_contrato(String fecha_inicio_contrato) {
                this.fecha_inicio_contrato = fecha_inicio_contrato;
        }
        public String getFecha_fin_contrato() {
                return fecha_fin_contrato;
        }
        public void setFecha_fin_contrato(String fecha_fin_contrato) {
                this.fecha_fin_contrato = fecha_fin_contrato;
        }
        public void sancionar(){
                System.out.println("Se va a sancionar a: " + getNombre());
        }
}

class Recepcionista extends Empleado {
        private String idiomas;
        private String antiguedad;

        public String getIdiomas() {
                return idiomas;
        }
        public void setIdiomas(String idiomas) {
                this.idiomas = idiomas;
        }
        public String getAntiguedad() {
                return antiguedad;
        }
        public void setAntiguedad(String antiguedad) {
                this.antiguedad = antiguedad;
        }
}

class Direccion {
        private String calle;
        private String ciudad;
        private String provincia;
        private String codigopostal;

        private String pais;
        public String getCalle() {
                return calle;
        }
        public void setCalle(String calle) {
                this.calle = calle;}

        public String getCiudad() {
                return ciudad;
        }
        public void setCiudad(String ciudad) {
                this.ciudad = ciudad;}

        public String getProvincia() {
                return provincia;
        }
        public void setProvincia(String provincia) {
                this.provincia = provincia;}

        public String getCodigopostal() {
                return codigopostal;
        }
        public void setCodigopostal(String codigopostal) {
                this.codigopostal = codigopostal;}

        public String getPais() {
                return pais;
        }
        public void setPais(String pais) {
                this.pais = pais;}
}

