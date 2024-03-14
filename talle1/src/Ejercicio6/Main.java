package Ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BilleteraElectronica billetera = new BilleteraElectronica();

        Scanner scanner = new Scanner(System.in);

        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\n*** BILLETERA ELECTRÓNICA ***");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    billetera.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    billetera.retirar(retiro);
                    break;
                case 3:
                    ejecutando = false;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }

        
        scanner.close();
    }

	}


