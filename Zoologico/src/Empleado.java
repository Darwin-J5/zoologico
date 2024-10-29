import java.util.Date;

public abstract class Empleado extends Persona {
    protected String identificacion;
    protected double turno;

    public Empleado(String nombre, String apellido, int edad, double altura, String tipoSangre, Date fechaNacimiento, String identificacion, double turno) {
        super(nombre, apellido, edad, altura, tipoSangre, fechaNacimiento);
        this.identificacion = identificacion;
        this.turno = turno;
    }
}
