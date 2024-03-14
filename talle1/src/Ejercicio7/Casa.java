package Ejercicio7;

class Casa extends Inmueble {
    private int numPisos;
    private boolean jardin;

    public Casa(String codigo, String ciudad, String direccion, double area, double valormetrocuadrado, double valorarriendomensual, int numPisos, boolean jardin) {
        super(codigo, ciudad, direccion, area, valormetrocuadrado, valorarriendomensual);
        this.numPisos = numPisos;
        this.jardin = jardin;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }
}
