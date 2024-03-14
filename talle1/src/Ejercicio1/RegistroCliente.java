package Ejercicio1;

public class RegistroCliente {
	// 1. definir atributos
			String Nombre;
			String Apellido;
			int edad;
			int id;
			
			//2. Definir el Cliente
			RegistroCliente(String Nombre, String Apellido, int edad, int id) {
				this.Nombre = Nombre;
				this.Apellido = Apellido;
				this.edad = edad;
				this.id = id;
			}
			
			//3. metodos SET
			public void setNombre(String Nombre) {
				this.Nombre = Nombre;
			}
			
			public void setApellido(String Apellido) {
				this.Apellido = Apellido;
			}
			
			public void setedad(int edad) {
				this.edad = edad;
			}
			
			public void setid(int id) {
				this.id = id;
			}
			
			//Definir los metodos getter
			public String getNombre() {
				return this.Nombre;
			}
			
			public String getApellido() {
				return this.Apellido;
			}
			
			public int getedad() {
				return this.edad;
			}
			
			public int getid() {
				return this.id;
			}
			
			//agregar otros metodos
			public void registrarCliente() {
				System.out.println("El cliente se registro exitosamente");
			}
			
			public void consultarCliente() {
				System.out.println("El cliente se consulto exitosamente");
			}
			
			public void actualizarCliente() {
				System.out.println("El cliente se actualizo exitosamente");
			}
			
			public void cambiarEstadoCliente() {
				System.out.println("El cliente se cambio de estado exitosamente");
			}
			
			
			@Override
			public String toString() {
				return " Nombre:"+this.Nombre +
						" Apellido:"+this.Apellido +
						" edad:"+this.edad +
						" id:"+this.id;
			}

}
