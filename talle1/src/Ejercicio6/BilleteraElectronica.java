package Ejercicio6;

public class BilleteraElectronica {
	private double capital;

    
    public BilleteraElectronica() {
        this.capital = 0.0;
    }

    
    public void depositar(double cantidad) {
        capital += cantidad;
        System.out.println("Se han depositado " + cantidad + " unidades. Capital actual: " + capital);
    }

    
    public void retirar(double cantidad) {
        if (cantidad > capital) {
            System.out.println("No se puede retirar más dinero del que hay en la billetera.");
        } else {
            capital -= cantidad;
            System.out.println("Se han retirado " + cantidad + " unidades. Capital actual: " + capital);
        }
    }
}
