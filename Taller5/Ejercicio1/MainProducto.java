public class MainProducto {
    public static void main(String[] args) {
        // Al estar en el mismo paquete, podemos instanciar y acceder directamente
        // a los atributos y métodos de paquete sin necesidad de get/set.
        Producto p1 = new Producto("Galletas artesanales", 4500.0, 25);

        p1.mostrarInfo(); // Acceso exitoso al método de paquete

        // Modificación directa permitida por estar en el mismo paquete
        p1.stock = 30;
        System.out.println("Nuevo stock actualizado: " + p1.stock);
    }
}
