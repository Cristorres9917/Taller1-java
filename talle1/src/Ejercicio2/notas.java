package Ejercicio2;

public class notas {
	    private String documento;
	    private String asignatura;
	    private double nota60;
	    private double nota40;

	    public notas(String documento, String asignatura, double nota60, double nota40) {
	        this.documento = documento;
	        this.asignatura = asignatura;
	        this.nota60 = nota60;
	        this.nota40 = nota40;
	    }

	    
	    public void setDocumento(String documento) {
	        this.documento = documento;
	    }

	    public void setAsignatura(String asignatura) {
	        this.asignatura = asignatura;
	    }

	    public void setNota60(double nota60) {
	        this.nota60 = nota60;
	    }

	    public void setNota40(double nota40) {
	        this.nota40 = nota40;
	    }

	    
	    public String getDocumento() {
	        return documento;
	    }

	    public String getAsignatura() {
	        return asignatura;
	    }

	    public double getNota60() {
	        return nota60;
	    }

	    public double getNota40() {
	        return nota40;
	    }

	  
	    public double calcularNotaFinal() {
	        return nota60 * 0.6 + nota40 * 0.4;
	    }

	    
	    public boolean aprobo() {
	        return calcularNotaFinal() >= 3.0;
	    }

	    @Override
	    public String toString() {
	        return "Documento: " + documento + ", Asignatura: " 
	        		+ asignatura + ", Nota60: " + nota60
	        		+ ", Nota40: "+ nota40;
	}
}