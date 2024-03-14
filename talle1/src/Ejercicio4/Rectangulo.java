package Ejercicio4;

public class Rectangulo extends Figura {
	private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (base + altura);
    }

}
