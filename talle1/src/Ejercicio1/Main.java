package Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("RegistroCliente");
		
		//instanciar la clase 
		
		String Nombre = "";
		String Apellido = "";
		int edad;
		int id;
		
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el Nombre");
		Nombre = leer.next();
		
		System.out.println("Ingrese el Apellido");
		Apellido = leer.next();

		System.out.println("Ingrese el edad");
		edad = leer.nextInt();
		
		System.out.println("Ingrese la id");
		id = leer.nextInt();
		
		RegistroCliente RegistroCLiente1 = new RegistroCliente (Nombre, Apellido, edad, id);
		
		System.out.println(RegistroCLiente1);
		
		//llamar metodos de la clase RegistroCliente
		RegistroCLiente1.registrarCliente();
		RegistroCLiente1.consultarCliente();
		RegistroCLiente1.actualizarCliente();
		RegistroCLiente1.cambiarEstadoCliente();
		
		leer.close();
	}

	}


