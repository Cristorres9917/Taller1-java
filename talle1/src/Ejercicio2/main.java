package Ejercicio2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		notas Notas1 = new notas("1234", "Java", 4.5, 3.0);
        notas Notas2 = new notas("9876", "Html", 1.0, 4.0);

        System.out.println("Notas 1:");
        System.out.println(Notas1);
        System.out.println("Nota Final: " + Notas1.calcularNotaFinal());
        System.out.println("¿Aprobó?: " + (Notas1.aprobo() ? "Sí" : "No"));

        System.out.println("\nNotas 2:");
        System.out.println(Notas2);
        System.out.println("Nota Final: " + Notas2.calcularNotaFinal());
        System.out.println("¿Aprobó?: " + (Notas2.aprobo() ? "Sí" : "No"));

        
	}

}
