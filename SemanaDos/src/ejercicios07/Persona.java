package ejercicios07;

public abstract class Persona {
	private String codPersona;
	private String nombre;
	private int edad;
	private String telContacto;
	
	public Persona(String codPersona, String nombre, int edad, String telContacto) {
		super();
		this.codPersona = codPersona;
		this.nombre = nombre;
		this.edad = edad;
		this.telContacto = telContacto;
	}
	
	public Persona() {
		super();
	}

	public String getCodPersona() {
		return codPersona;
	}
	
	public void setCodPersona(String codPersona) {
		this.codPersona = codPersona;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getTelContacto() {
		return telContacto;
	}
	
	public void setTelContacto(String telContacto) {
		this.telContacto = telContacto;
	}
	
	@Override
	public String toString() {
		return "Persona [codPersona=" + codPersona + ", nombre=" + nombre + ", edad=" + edad + ", telContacto="
				+ telContacto + "]";
	}

	public abstract void mostrar();
	

}
