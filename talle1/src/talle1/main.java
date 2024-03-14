package talle1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de pesos a convertir:");
        double cantidadPesos = leer.nextDouble();
        
        Conversor conversor = new Conversor(cantidadPesos);
        
        System.out.println(conversor);
        System.out.println("Valor en dólares: $" + conversor.convertirDolares());
        System.out.println("Valor en euros: €" + conversor.convertirEuros());
        
        leer.close();
    }
}


