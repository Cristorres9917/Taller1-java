package Ejercicio7;

import java.util.Currency;

public class Inmueble {
	protected String codigo;
    protected String ciudad;
    protected String direccion;
    protected double area;
    protected double valormetrocuadrado;
    protected double valorarriendomensual;

    public Inmueble(String codigo, String ciudad, String direccion, double area, double valormetrocuadrado, double valorarriendomensual) {
        this.codigo = codigo;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.area = area;
        this.valormetrocuadrado = valormetrocuadrado;
        this.valorarriendomensual = valorarriendomensual;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getValormetrocuadrado() {
        return valormetrocuadrado;
    }

    public void setValormetrocuadrado(double valormetrocuadrado) {
        this.valormetrocuadrado = valormetrocuadrado;
    }

    public double getValorarriendomensual() {
        return valorarriendomensual;
    }

    public void setValorarriendomensual(double valorarriendomensual) {
        this.valorarriendomensual = valorarriendomensual;
    }

    public double calcularValorVenta() {
        return area * valormetrocuadrado;
    }

    public double calcularAvaluoCatastral() {
        return calcularValorVenta() * 0.0099;
    }

    public double calcularValorVenta(double precioDolar) {
        return calcularValorVenta() / precioDolar;
    }

    public double calcularValorVenta(double precioEuro, Currency currency) {
        double valorVentaEuros = calcularValorVenta() / precioEuro;
        return currency.equals(Currency.getInstance("EUR")) ? valorVentaEuros : valorVentaEuros * precioEuro;
    }
}
