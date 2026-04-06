package xinyminutes;

import java.util.ArrayList;
import java.util.Iterator;
import java.security.*;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		IO.println("World");
		
		byte fooByte = 127;
		short fooShort = 300;
		int fooInt = 10;
		long fooLong = 100000000L;
		float fooFloat = 234.5f;
		double fooDouble = 204.124;
		boolean istrue = true;
		char fooChar = 'A';
		final int MINHA_CONSTANTE = 25;
		String fooString = "classe string";
		
        //O tamanho do array precisa ser determinado na sua declaração
		int [] intArray = new int[10];
		int [] y = {100, 200, 300};
		
		int j = 10;
		
		if(j == 10) {
			System.out.println("eu serei imprimido");
		}else if ( j < 10){
			System.out.println("quase");
		}else {
			System.out.println("não");
		}
		
		int i = 0;
		while(i <= 100) {
			System.out.println(i);
			i++;
		}
		
		int fooDoWhile = 0;
		do {
			fooDoWhile++;
		} while (fooDoWhile < 50);
		
		System.out.println(fooDoWhile);
		
		int [] fooFor = {10,20,30,40,50,60,70};
		for(int element : fooFor) {
			IO.println(element);
		}
		
        int mes = 3;
        String mesString;
        switch (mes){
            case 1:
                    mesString = "Janeiro";
                    break;
            case 2:
                    mesString = "Fevereiro";
                    break;
            case 3:
                    mesString = "Março";
                    break;
            default:
                    mesString = "Algum outro mês";
                    break;
        }
        System.out.println("Resultado do Switch: " + mesString);
        
        
        // Condição de forma abreviada.
        // Você pode usar o operador '?' para atribuições rápidas ou decisões lógicas.
        // Lê-se "Se (declaração) é verdadeira, use <primeiro valor>
        // caso contrário, use <segundo valor>".
        int foo = 5;
        String bar = (foo < 10) ? "A" : "B";
        System.out.println(bar); //Imprime A, pois a condição é verdadeira.
        String nig = "123";
        Integer.parseInt(nig); 
	}

}
