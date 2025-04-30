package ed_lz;

/**
 * @author Laura Zorita
 * @version 1.0
 */
public class LZ_GravedadPlaneta {
	
	
	private int ID;
	private String Nombre;
	private double GravedadPlaneta;
	
	/**
	 * @param iD
	 * @param nombre
	 * @param gravedadPlaneta
	 */
	public LZ_GravedadPlaneta(int iD, String nombre, double gravedadPlaneta) {
		super();
		ID = iD;
		Nombre = nombre;
		GravedadPlaneta = gravedadPlaneta;
	}
	/**
	 * @return GravedadPlaneta
	 */
	double getGravedadPlaneta() {
		return GravedadPlaneta;
	}
	void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
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
	 * @return ID
	 */
	int getID() {
		return ID;
	}
	void setID(int iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "LZ_GravedadPlaneta [ID=" + ID + ", Nombre=" + Nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
	}
	
}
