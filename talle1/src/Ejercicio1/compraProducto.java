package Ejercicio1;

public class compraProducto {
	// 1. definir atributos
				String Nombre;
				int codigo;
				float precio;
				
				//2. Definir el Cliente
				compraProducto(String Nombre, int codigo, float precio) {
					this.Nombre = Nombre;
					this.codigo = codigo;
					this.precio = precio;
				}
				
				//3. metodos SET
				public void setNombre(String Nombre) {
					this.Nombre = Nombre;
				}
				
				public void setcodigo(int codigo) {
					this.codigo = codigo;
				}
				
				public void setprecio(float precio) {
					this.precio = precio;
				}
				
				//Definir los metodos getter
				public String getNombre() {
					return this.Nombre;
				}
				
				public int getcodigo() {
					return this.codigo;
				}
				
				public float getprecio() {
					return this.precio;
				}
				
				//agregar otros metodos
				public void registrarproducto() {
					System.out.println("el producto se registro exitosamente");
				}
				
				public void consultarproducto() {
					System.out.println("el producto se consulto exitosamente");
				}
				
				public void actualizarproducto() {
					System.out.println("El producto se actualizo exitosamente");
				}
				
				public void cambiarEstadoproducto() {
					System.out.println("El producto se cambio de estado exitosamente");
				}
				
				
				@Override
				public String toString() {
					return " Nombre:"+this.Nombre +
							" codigo:"+this.codigo +
							" precio:"+this.precio;
				}


}
