package ejercicios;

public class Golosina implements Comparable<Golosina> {
	private String nombre;
	private double peso;
	
	public Golosina(String nombre, double peso) {
		this.nombre = nombre;
		this.peso = peso;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return String.format("Nombre: %s Peso: %.2f", this.getNombre(), this.getPeso());
	}
	
	public int compareTo(Golosina g) {
		return this.nombre.compareTo(g.getNombre());
	}
	
}
