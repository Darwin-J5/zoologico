public class Cuidado {
    private String tipoAlimentacion;
    private double horarioAlimentacion;
    private double horarioLimpieza;

    public Cuidado(String tipoAlimentacion, double horarioAlimentacion, double horarioLimpieza) {
        this.tipoAlimentacion = tipoAlimentacion;
        this.horarioAlimentacion = horarioAlimentacion;
        this.horarioLimpieza = horarioLimpieza;
    }

    public void asignarCuidador(Cuidador cuidador, Animal animal) {
        System.out.println("Cuidador " + cuidador.nombre + " asignado al animal " + animal.getNombre());
    }
}
