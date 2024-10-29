import java.util.Date;

public class Veterinario extends Empleado {
    public Veterinario(String nombre, String apellido, int edad, double altura, String tipoSangre, Date fechaNacimiento, String identificacion, double turno) {
        super(nombre, apellido, edad, altura, tipoSangre, fechaNacimiento, identificacion, turno);
    }

    public void examinarAnimal(Animal animal) {
        System.out.println("Examinando al animal " + animal.getNombre());
    }

    public void tratarEnfermedad(Animal animal) {
        System.out.println("Tratando enfermedad de " + animal.getNombre());
    }

    public void aplicarMedicamento(Animal animal) {
        System.out.println("Aplicando medicamento a " + animal.getNombre());
    }

    public void realizarOperacion(Animal animal) {
        System.out.println("Realizando operación a " + animal.getNombre());
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
