/* Elaborar um programa que efetue a leitura de três valores
* (A, B e C) e apresente como resultado final o quadrado da soma dos três valores lidos.
*/
package tarefa04;

import java.util.Scanner;

public class EX07 {
	static double quadSoma(float a, float b, float c) {
		float soma = a+b+c;
		return soma*soma;
		
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
		System.out.println("Obrigado! O resultado do quadrado da soma dos valores lidos é: " + quadSoma(a,b,c));
		
		
		sc.close();
	}

}
