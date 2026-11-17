package main;

public class DatosTemperaturas {
	void main() {
		String valores="11.7,3.4,23.5,18.6,22.1,30.6,11.2";
		//calcula latemperatura media
		double suma=0;
		String[] temps=valores.split("[,]");
		for(String t:temps) {
			suma+=Double.parseDouble(t);
		}
		System.out.println("Temperatura media global "+suma/temps.length);
	}
}
