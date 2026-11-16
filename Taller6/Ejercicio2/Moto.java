package Ejercicio2;

public class Moto extends vehiculo{
    protected int cilindraje;
    public Moto(String tipo,String marca,int cilindraje){
        super(tipo,marca);
        this.cilindraje = cilindraje;
    }

    public void mostrarMoto() {
        System.out.println("Vehículo: " + tipo + " | Marca: " + marca + " | cilindraje: " + cilindraje + "cc");
    }
}
