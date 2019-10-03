package paqueteleerobjetos;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class EscribeObjetosAppend extends ObjectOutputStream{

	public EscribeObjetosAppend(OutputStream out) throws IOException {
		super(out);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		// TODO Auto-generated method stub
		//super.writeStreamHeader();
		reset();
	}

}
