package ed_lz;

public class LZ_GravedadPlaneta {
	
	
	private int ID;
	private String Nombre;
	private double GravedadPlaneta;
	
	public LZ_GravedadPlaneta(int iD, String nombre, double gravedadPlaneta) {
		super();
		ID = iD;
		Nombre = nombre;
		GravedadPlaneta = gravedadPlaneta;
	}
	double getGravedadPlaneta() {
		return GravedadPlaneta;
	}
	void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
	}
	String getNombre() {
		return Nombre;
	}
	void setNombre(String nombre) {
		Nombre = nombre;
	}
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
