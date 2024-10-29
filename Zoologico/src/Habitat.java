import java.util.ArrayList;
import java.util.List;

public class Habitat {
    private String nombre;
    private String tipo;
    private double tamaño;
    private String ubicacion;
    private List<Animal> animalList = new ArrayList<>();

    public Habitat(String nombre, String tipo, double tamaño, String ubicacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamaño = tamaño;
        this.ubicacion = ubicacion;
    }

    public void agregarAnimal(Animal animal) {
        animalList.add(animal);
        System.out.println("Animal " + animal.getNombre() + " añadido al hábitat " + nombre);
    }

    public void removerAnimal(Animal animal) {
        animalList.remove(animal);
        System.out.println("Animal " + animal.getNombre() + " removido del hábitat " + nombre);
    }
}
