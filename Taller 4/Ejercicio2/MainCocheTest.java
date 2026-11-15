package Ejercicio2;

public class MainCocheTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE CLASE COCHE ---");

        // 1. Crear una instancia de Coche usando el constructor
        Coche miCoche = new Coche("Chevrolet", "Onix", 180.0);

        // 2. Acceder a las propiedades usando los getters
        System.out.println("Marca: " + miCoche.getMarca());
        System.out.println("Modelo: " + miCoche.getModelo());
        System.out.println("Velocidad Máxima Inicial: " + miCoche.getVelocidadMaxima() + " km/h");

        System.out.println("-----------------------------------");
    }
}