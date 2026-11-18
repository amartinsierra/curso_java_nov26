package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
//try con recursos
public class EscrituraFicheroLimpio {
	void main() {
		String dir="datos.txt";		
		try(FileOutputStream fos=new FileOutputStream(dir,true);
				PrintStream out=new PrintStream(fos);) {
			out.println("linea 1");
			out.println("linea 2");
			
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}
}
