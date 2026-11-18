package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class EscrituraFichero {
	void main() {
		String dir="datos.txt";
		PrintStream out=null;
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream(dir,true);
			out=new PrintStream(fos);
			out.println("linea 1");
			out.println("linea 2");
			
		}
		catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			if(out!=null) {
				out.close();
			}
			if(fos!=null) {
				try {
					fos.close();
				}
				catch(IOException ex) {
					ex.printStackTrace();
				}
			}
		}
		
	}
}
