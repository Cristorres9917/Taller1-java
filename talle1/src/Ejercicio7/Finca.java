package Ejercicio7;

class Finca extends Inmueble {
    private int numHectareas;

    public Finca(String codigo, String ciudad, String direccion, double area, double valormetrocuadrado, double valorarriendomensual, int numHectareas) {
        super(codigo, ciudad, direccion, area, valormetrocuadrado, valorarriendomensual);
        this.numHectareas = numHectareas;
    }

    public int getNumHectareas() {
        return numHectareas;
    }

    public void setNumHectareas(int numHectareas) {
        this.numHectareas = numHectareas;
    }
}

