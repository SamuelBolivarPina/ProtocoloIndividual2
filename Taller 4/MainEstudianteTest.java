public class MainEstudianteTest {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA DE CLASE ESTUDIANTE ---");

        // 1. Crear una instancia de Estudiante usando el constructor
        Estudiante estudiante1 = new Estudiante("Samuel", 18, 4.6);

        // 2. Acceder a las propiedades usando los métodos getters
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Nota Promedio: " + estudiante1.getNotaPromedio());

        System.out.println("-----------------------------------");
    }
}