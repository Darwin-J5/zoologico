import java.util.ArrayList;
import java.util.List;

public class Animal extends SerVivo {
    private String especie;
    private String nombre;
    private int edad;
    private float peso;
    private List<Caracteristica> caracteristicaList = new ArrayList<>();
    private List<String> historialSalud = new ArrayList<>();

    public Animal(String especie, String nombre, int edad, float peso) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void registrarSalud(String registro) {
        historialSalud.add(registro);
        System.out.println("Registro de salud añadido para " + nombre);
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " se está moviendo.");
    }

    @Override
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }
}
