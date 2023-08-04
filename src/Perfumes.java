
public class Perfumes {

	// Declaracion de atributos
	String nombre;
	String marca;
	String olor;
	int ml;

	// SOBRECARGA DE METODOS
	// CONSTRUCTOR VACIO
	public Perfumes() {
	}

	// CONSTRUCTOR CON PARAMETROS
	public Perfumes(String nombre, String marca, String olor, int ml) {
		this.nombre = nombre;
		this.marca = marca;
		this.olor = olor;
		this.ml = ml;
	}

	// TOSTRING --> CONVIERTE CUALQUIER OBJETO EN CADENA
	@Override
	public String toString() {
		return "Perfumes [nombre=" + nombre + ", marca=" + marca + ", olor=" + olor + ", ml=" + ml + "]\n";
	}

	//ENCAPSULAMIENTO
	public String getNombre() {
		return nombre; //FUNCION
	}

	public void setNombre(String nombre) {
		this.nombre = nombre; //PROCEDIMIENTO
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getOlor() {
		return olor;
	}

	public void setOlor(String olor) {
		this.olor = olor;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

}
