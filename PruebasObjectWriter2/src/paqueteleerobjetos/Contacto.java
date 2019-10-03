package paqueteleerobjetos;

import java.io.Serializable;
import java.util.ArrayList;

public class Contacto implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String nombre, email;
private ArrayList<String> hijos;
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
public ArrayList<String> getHijos() {
	return hijos;
}
public void setHijos(ArrayList<String> hijos) {
	this.hijos = hijos;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}
public Contacto(String nombre, String email, ArrayList<String> hijos) {
	super();
	this.nombre = nombre;
	this.email = email;
	this.hijos = hijos;
}
@Override
public String toString() {
	return "Contacto [nombre=" + nombre + ", email=" + email + ", hijos=" + hijos + "]";
}


}
