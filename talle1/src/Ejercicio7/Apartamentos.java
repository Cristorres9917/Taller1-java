package Ejercicio7;

class Apartamento extends Inmueble {
    private int numHabitaciones;
    private int numBanos;

    public Apartamento(String codigo, String ciudad, String direccion, double area, double valormetrocuadrado, double valorarriendomensual, int numHabitaciones, int numBanos) {
        super(codigo, ciudad, direccion, area, valormetrocuadrado, valorarriendomensual);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }
}
