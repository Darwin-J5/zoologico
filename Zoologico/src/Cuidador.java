import java.util.Date;

public class Cuidador extends Empleado {
    private String especialidad;

    public Cuidador(String nombre, String apellido, int edad, double altura, String tipoSangre, Date fechaNacimiento, String identificacion, double turno, String especialidad) {
        super(nombre, apellido, edad, altura, tipoSangre, fechaNacimiento, identificacion, turno);
        this.especialidad = especialidad;
    }

    public void atenderAnimales(Animal animal) {
        System.out.println("Atendiendo al animal " + animal.getNombre());
    }

    @Override
    public void moverse() {

    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}
