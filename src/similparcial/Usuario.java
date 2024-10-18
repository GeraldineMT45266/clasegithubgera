package similparcial;
import java.util.ArrayList;

//hola
public class Usuario {
	private String nombre;
	private String email;
	private String clave;
	private Membresia membresia;
	private ArrayList <Perfil> perfiles= new ArrayList<>();

}

 public Usuario (String nombre, String email, String clave, Membresia membresia) {
	 
	 this.nombre= nombre;
	 this.email=email;
	 this.clave=clave;
	 this.membresia=membresia;
	  
 }

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getClave() {
	return clave;
}

public void setClave(String clave) {
	this.clave = clave;
}

public Membresia getMembresia() {
	return membresia;
}

public void setMembresia(Membresia membresia) {
	this.membresia = membresia;
}

public ArrayList<Perfil> getPerfiles() {
	return perfiles;
}

public void setPerfiles(ArrayList<Perfil> perfiles) {
	this.perfiles = perfiles;
}
 
 
 
