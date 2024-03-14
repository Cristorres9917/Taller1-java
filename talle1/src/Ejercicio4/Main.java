package Ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura circulo = new Circulo(5);
        Figura cuadrado = new Cuadrado(4);
        Figura rectangulo = new Rectangulo(3, 6);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
        System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    }

	}


