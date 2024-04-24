/* Elaborar um programa que efetue a leitura de três valores
* (A, B e C) e apresente como resultado final a soma dos quadrados dos três valores lidos.
*/
package tarefa04;

import java.util.Scanner;

public class EX06 {
	static String somaQuad(float a, float b, float c) {
		double soma = (double) (a*a) + (b*b) + (c*c);
		return "O resultado da soma dos quadrados dos valores inseridos é: " + soma;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a;
		float b;
		float c;
		
		System.out.println("Bem-Vindo! Por favor insira o valor de A");
		a = sc.nextFloat();
		System.out.println("Agora, insira o valor de B");
		b = sc.nextFloat();
		System.out.println("Por último, insira o valor de C");
		c = sc.nextFloat();
		System.out.println("Obrigado! " + somaQuad(a,b,c));
		
		
		sc.close();
	}

}
