package ed_lz;

/**
 * @author Laura Zorita
 * @version 1.0
 * 
 */
public class Persona_LZ {

	private int ID;
	private String Nombre;
	private double Masa;
	private double Altura;
	private int Edad;
	

	/**
	 * @param iD
	 * @param nombre
	 * @param masa
	 * @param altura
	 * @param edad
	 */
	public Persona_LZ(int iD, String nombre, double masa, double altura, int edad) {
		super();
		ID = iD;
		Nombre = nombre;
		Masa = masa;
		Altura = altura;
		Edad = edad;
	}
	/**
	 * @return Edad
	 */
	int getEdad() {
		return Edad;
	}
	void setEdad(int edad) {
		Edad = edad;
	}
	/**
	 * @return Altura
	 */
	double getAltura() {
		return Altura;
	}
	
	void setAltura(double altura) {
		Altura = altura;
	}
	/**
	 * @return Masa
	 */
	double getMasa() {
		return Masa;
	}
	void setMasa(double masa) {
		Masa = masa;
	}
	/**
	 * @return Nombre
	 */
	String getNombre() {
		return Nombre;
	}
	void setNombre(String nombre) {
		Nombre = nombre;
	}
	/**
	 * @return 	ID
	 */
	int getID() {
		return ID;
	}
	void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "Persona_LZ [ID=" + ID + ", Nombre=" + Nombre + ", Masa=" + Masa + ", Altura=" + Altura + ", Edad="
				+ Edad + "]";
	}
	

}
