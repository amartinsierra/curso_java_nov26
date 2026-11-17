package main;

public class ComprobarEmails {
	
	void main() {
		String emails="prueba@gmail.com|test@gmailboot.com|gmail@hotmail.com|this@mymail.es";
		final String DOMINIO="gmail";
		//comprobar cuantas direcciones forman parte del dominio indicado
		int ocurrencias=0;
		for(String e:emails.split("[|]")) {
			if(comprobarEmail(e,DOMINIO)) {
				ocurrencias++;
			}
		}
		System.out.println("Dominio gmail: "+ocurrencias);

	}
	
	static boolean comprobarEmail(String email,String dominio) {
		int pos1=email.indexOf("@");
		int pos2=email.lastIndexOf("."); //empieza la búsqueda por el final
		String proveedor=email.substring(pos1+1,pos2);
		return proveedor.equals(dominio);
	}
}
