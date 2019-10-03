package paqueteleerobjetos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ClasePrincipal {
static String ruta="D:\\contactos.dat";
	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream(ruta , true);
			ObjectOutputStream out = new ObjectOutputStream(fos);
			ArrayList<String> lista_hijos=new ArrayList<>();
			lista_hijos.add("Manuel");
			lista_hijos.add("Ana");
			Contacto c1=new Contacto("Pepe", "pepe@mail.com",lista_hijos);
			out.writeObject(c1);
			
			ArrayList<String> lista_hijos2=new ArrayList<>();
			lista_hijos.add("Teresa");
			lista_hijos.add("Jose");
			Contacto c2=new Contacto("Pepe", "pepe@mail.com",lista_hijos);
			out.writeObject(c2);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obtenerContactos();
		
	}
	
	public static ArrayList<Contacto> obtenerContactos()
	{
		ArrayList<Contacto> agenda=new ArrayList<>();
		FileInputStream fi;
		try {
			fi = new FileInputStream(ruta);
			ObjectInputStream input=new ObjectInputStream(fi);
			//Podemos usar EOF o .available() para ver el final del fichero.
			while(fi.available()>0)
			{
				Contacto c=(Contacto) input.readObject();
				System.out.println(c);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return agenda;
	}

}
