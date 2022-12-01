public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado();
        e1.setNombre("Paco");
        e1.setApellidos(" Chacón");
        e1.setDni(" 13946664A");
        System.out.println(e1.getNombre() + e1.getApellidos() + e1.getDni());

        Guia g1 = new Guia();
        g1.setNombre("Mario");
        g1.setApellidos(" Gutierrez");
        g1.setDni(" 90273403J");
        g1.setExperiencia(" Poca Experiencia");
        g1.setFecha_inicio_contrato(" 11/01/2022");
        g1.setFecha_fin_contrato(" 11/01/2023");
        System.out.println(g1.getNombre() + g1.getApellidos() + g1.getDni() + g1.getExperiencia() + g1.getFecha_inicio_contrato() + g1.getFecha_fin_contrato());

    }
}