package collections;

import java.util.ArrayList;
import java.util.Scanner;

/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
 *  O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá 
 *  adicioná-las individualmente no ArrayList. Em seguida, faça o que se pede:
	Mostre na tela todas as cores que foram adicionadas. 
	Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.*/

public class ExList {

	public static void main(String[] args) {

		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner(System.in);

		for (int cor = 1; cor <= 2; cor++) {
			System.out.printf("Digite sua %dº cor: ", cor);
			cores.add(leia.nextLine());
		}

		System.out.println("Cores que foram adicionadas: ");
		for (String i : cores) {
			System.out.println(i);
		}
		
		cores.sort(null);
		System.out.println("Cores em ordem crescente: ");
		for(String i : cores) {
			System.out.println(i);
		}
		
	}

}
