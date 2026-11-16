public class MainProducto {
    public static void main(String[] args) {
        System.out.println("--- PRUEBA EJERCICIO 1: CLASE PRODUCTO ---");

        // 1. Crear una instancia de Producto usando el constructor
        Taller5.Producto producto1 = new Taller5.Producto("Laptop Gamer", 3500000.0, 4);

        // 2. Verificar el acceso directo a las propiedades (por tener acceso de paquete/default)
        System.out.println("Acceso directo a los atributos:");
        System.out.println("Nombre: " + producto1.nombre);
        System.out.println("Precio: $" + producto1.precio);
        System.out.println("Stock: " + producto1.stock);

        System.out.println("Ejecutando el método mostrarInfo():");

        // 3. Llamar al método mostrarInfo() para verificar su funcionamiento
        producto1.mostrarInfo();
    }
}
