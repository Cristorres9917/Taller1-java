package talle1;

public class Conversor {
	private double cantidadPesos;

    // Constructor
    public Conversor(double cantidadPesos) {
        this.cantidadPesos = cantidadPesos;
    }

    // Métodos getter y setter
    public double getCantidadPesos() {
        return cantidadPesos;
    }

    public void setCantidadPesos(double cantidadPesos) {
        this.cantidadPesos = cantidadPesos;
    }

    // Método para convertir pesos a dólares
    public double convertirDolares() {
        // Suponiendo que 1 dólar equivale a 2000 pesos (solo como ejemplo)
        return cantidadPesos / 2000.0;
    }

 // Método para convertir pesos a euros
    public double convertirEuros() {
        // Suponiendo que 1 euro equivale a 2500 pesos (solo como ejemplo)
        return cantidadPesos / 2500.0;
    }

    // Método toString para sobrescribir
    @Override
    public String toString() {
        return "Cantidad de pesos: " + cantidadPesos;
        }


}


