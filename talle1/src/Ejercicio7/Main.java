package Ejercicio7;

import java.util.Currency;

public class Main {

	public static void main(String[] args) {
		Apartamento apartamento = new Apartamento("001", "Bogotá", "Cra 10 #20-30", 80.0, 2000000.0, 1000000.0, 2, 1);
        Casa casa = new Casa("002", "Medellín", "Calle 50 #30-40", 120.0, 1500000.0, 1200000.0, 2, true);
        Finca finca = new Finca("003", "Cali", "Vereda La Esperanza", 5000.0, 1000000.0, 500000.0, 50);

        System.out.println("Información del apartamento:");
        System.out.println("Valor de venta (pesos colombianos): " + apartamento.calcularValorVenta());
        System.out.println("Avalúo catastral (pesos colombianos): " + apartamento.calcularAvaluoCatastral());
        System.out.println("Valor de venta (dólares): " + apartamento.calcularValorVenta(3800));
        System.out.println("Valor de venta (euros): " + apartamento.calcularValorVenta(4600, Currency.getInstance("EUR")));
        System.out.println();

        System.out.println("Información de la casa:");
        System.out.println("Valor de venta (pesos colombianos): " + casa.calcularValorVenta());
        System.out.println("Avalúo catastral (pesos colombianos): " + casa.calcularAvaluoCatastral());
        System.out.println("Valor de venta (dólares): " + casa.calcularValorVenta(3800));
        System.out.println("Valor de venta (euros): " + casa.calcularValorVenta(4600, Currency.getInstance("EUR")));
        System.out.println();

        System.out.println("Información de la finca:");
        System.out.println("Valor de venta (pesos colombianos): " + finca.calcularValorVenta());
        System.out.println("Avalúo catastral (pesos colombianos): " + finca.calcularAvaluoCatastral());
        System.out.println("Valor de venta (dólares): " + finca.calcularValorVenta(3800));
        System.out.println("Valor de venta (euros): " + finca.calcularValorVenta(4600, Currency.getInstance("EUR")));
    }

	}


