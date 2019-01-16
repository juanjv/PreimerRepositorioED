package refactorizacion;

import java.util.Scanner;

import javadoc.Circulo;

public class UsoCirculo {
	
	static Scanner sc; // declaramos aqui el Scanner

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		// Solicitar datos del primer circulo
		Circulo circulo1 = solicitarDatosCirculo(1);//(1) hace referencia al primer dato a solicitar
		
		// Solicitar datos del segundo circulo
		Circulo circulo2 = solicitarDatosCirculo(2);
		
		//moverCirculoMayor(circulo1, circulo2);// mueva el de radio más grande  al mismo centro que el del radio más pequeño
		 compararCirculos(circulo1, circulo2);// Compara circulos
		
		
     sc.close();
	}

	private static void compararCirculos(Circulo circulo1, Circulo circulo2) {
		//comparamos radios, las circuferencias y coordenadas del centro
		if (circulo1.getradio() > circulo2.getradio()) {
			System.out.println("el circulo con mayor radio es "  + circulo1);
		} else {
			System.out.println("El circuilo con mayor radio es es " + circulo2);
		}
		
		if (circulo1.getCircunferencia() > circulo2.getCircunferencia()) {
			System.out.println("el circulo con mayor circunferencia es "  + circulo1);
		} else {
			System.out.println("El circuilo con mayor circunferencia es es " + circulo2);
		}
		
		
	}

	private static Circulo solicitarDatosCirculo(int i) {
		System.out.println("Introduce la coordenada x del centro del circulo " + i);
		String sX = sc.nextLine();
		double x = Double.parseDouble(sX);
		
		System.out.println("Introduce la coordenada y del centro del circulo " + i);
		String sY = sc.nextLine();
		double y = Double.parseDouble(sY);
		
		System.out.println("Introduce el Radio del del circulo " + i);
		String sRadio = sc.nextLine();
		double radio = Double.parseDouble(sRadio);
		
		Circulo circulo = new Circulo(x, y , radio);
		
		return circulo;
	}

}
