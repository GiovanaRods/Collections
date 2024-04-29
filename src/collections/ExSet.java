package collections;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ExSet {

	public static void main(String[] args) {
		/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer.
		 *  O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores inteiros não 
		 *  repetidos e adicione-os individualmente na Collection Set.
		 *  */
		
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite 10 numeros inteiros não repetidos: ");
			numeros.add(leia.nextInt());
		}
		
		Iterator<Integer> iNumeros = numeros.iterator();

		while (iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
