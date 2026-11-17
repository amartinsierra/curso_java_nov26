package main;

import java.util.Scanner;

public class ComprobarProducto {
	
	void main() {
		String pedidos="leche,pan,agua,leche,vino,cerveza,pan,vino,pan";
		//solicita la introducción de un producto, y se nos indicará
		//el número de veces que aparece en el pedido. Si no está
		//ese producto en el pedido, se indica con un mensaje
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce producto: ");
		String producto=sc.nextLine();
		if(!comprobarProducto(producto,pedidos)) {
			System.out.println("Ese producto no está en el pedido");
		}else {		
			System.out.println("El total de veces que aparece "+producto+" en el pedido es "+contarApariciones(producto,pedidos));
		}
	}
	
	boolean comprobarProducto(String pr,String ped) {
		return ped.indexOf(pr)!=-1;
	}
	int contarApariciones(String pr, String ped) {
		String[] datos=ped.split(",");
		int contador=0;
		for(String prod:datos) {
			if(prod.equals(pr)) {
				contador++;
			}
		}
		return contador;
	}
}
