package Ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Vehiculo miVehiculo = new Vehiculo("Toyota");
        Scanner scanner = new Scanner(System.in);
        
        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\n¿Qué acción desea realizar?");
            System.out.println("1. Acelerar");
            System.out.println("2. Desacelerar");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad de km/h para acelerar:");
                    int cantidadAcelerar = scanner.nextInt();
                    miVehiculo.acelerar(cantidadAcelerar);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de km/h para desacelerar:");
                    int cantidadDesacelerar = scanner.nextInt();
                    miVehiculo.desacelerar(cantidadDesacelerar);
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


