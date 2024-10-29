import java.util.Date;

public abstract class Persona extends SerVivo {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected double altura;
    protected String tipoSangre;
    protected Date fechaNacimiento;

    public Persona(String nombre, String apellido, int edad, double altura, String tipoSangre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
        this.fechaNacimiento = fechaNacimiento;
    }
}
