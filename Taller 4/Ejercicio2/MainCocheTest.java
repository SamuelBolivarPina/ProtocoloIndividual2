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

        // 3. Probar el método acelerar con un incremento válido
        miCoche.acelerar(25.5);

        // 4. Probar el método acelerar con un incremento inválido (negativo o cero)
        miCoche.acelerar(-10.0);

        // 5. Mostrar la velocidad final
        System.out.println("--- ESTADO FINAL ---");
        System.out.println("Velocidad Máxima Actualizada: " + miCoche.getVelocidadMaxima() + " km/h");
    }
}