// Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da diferença do primeiro valor pelo segundo.

package tarefa04;

import java.util.Scanner;

public class EX03 {
	static String resultado(int a, int b) {
		float div = (float) a / b;
		double quad = div * div;
		return "O quadrado da diferença do primeiro valor pelo segundo é: " + quad;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("Bem-vindo! Insira abaixo o primeiro valor!");
		a = sc.nextInt();
		System.out.println("Agora, insira o segundo valor");
		b = sc.nextInt();
		System.out.println("Obrigado! " + resultado(a,b));
		sc.close();
	}

}
