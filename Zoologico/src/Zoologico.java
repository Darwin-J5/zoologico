import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private String direccion;
    private List<Empleado> empleadoList = new ArrayList<>();
    private List<Animal> animalList = new ArrayList<>();

    public Zoologico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public void registrarAnimal(Animal animal) {
        animalList.add(animal);
        System.out.println("Animal " + animal.getNombre() + " registrado en el zoológico.");
    }

    public void asignarEmpleado(Empleado empleado) {
        empleadoList.add(empleado);
        System.out.println("Empleado " + empleado.nombre + " asignado al zoológico.");
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Zoologico zoo = new Zoologico("Zoológico Central", "Avenida Safari 123");

        Veterinario vet = new Veterinario("Carlos", "Pérez", 45, 1.75, "O+", new java.util.Date(), "VET001", 8);
        Cuidador cuidador = new Cuidador("Luis", "Gómez", 30, 1.80, "A-", new java.util.Date(), "CUID001", 6, "Mamíferos");

        Animal leon = new Animal("León", "León", 5, 200.5f);
        zoo.registrarAnimal(leon);
        zoo.asignarEmpleado(vet);
        zoo.asignarEmpleado(cuidador);

        Habitat sabana = new Habitat("Sabana", "Desierto", 1500, "Zona Norte");
        sabana.agregarAnimal(leon);

        Cuidado cuidadoLeon = new Cuidado("Carnívoro", 12.30, 18.00);
        cuidadoLeon.asignarCuidador(cuidador, leon);

        leon.registrarSalud("Revisión general: saludable");
        vet.examinarAnimal(leon);
    }
}
