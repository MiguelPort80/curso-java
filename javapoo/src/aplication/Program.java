package aplication;

import entities.Bicicleta;

public class Program {

	public static void main(String[] args) {
		System.out.println("Classes e Metodos");
		
		Bicicleta monark = new Bicicleta(10, 80, 3443, "Monark");
		System.out.println(monark);
		monark.aumentarVelocidade(10);
	}

}
