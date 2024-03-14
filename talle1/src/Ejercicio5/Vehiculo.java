package Ejercicio5;

public class Vehiculo {
	private String marca;
    private int velocidad;

    
    public Vehiculo(String marca) {
        this.marca = marca;
        this.velocidad = 0;
    }

    
    public void acelerar(int cantidad) {
        velocidad += cantidad;
        System.out.println("El vehículo de marca " + marca + " ha acelerado a " + velocidad + " km/h.");
    }

    
    public void desacelerar(int cantidad) {
        if (velocidad - cantidad >= 0) {
            velocidad -= cantidad;
            System.out.println("El vehículo de marca " + marca + " ha desacelerado a " + velocidad + " km/h.");
        } else {
            System.out.println("El vehículo ya está detenido.");
        }
    }
}


