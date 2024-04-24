/*Ler quatro números inteiros e apresentar o resultado da adição e multiplicação,
 * baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se
 * forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B,
 * A com C e A com D. Depois B com C, B com D e por fim C com D. Perceba que será
 * necessário efetuar seis operações de adição e seis operações de multiplicação e
 * apresentar doze resultados de saída.
 */

package tarefa04;

import java.util.Scanner;

public class EX01 {
	static String soma(int a, int b, int c, int d) {
		String somas = "Os resultados a seguir são referentes às somas entre: A e B: " + (a+b) + " / A e C: " + (a+c) +
				" / A e D: " + (a+d) + " / B e C: " + (b+c) + " / B e D: " + (b+d) + " / C e D: " + (c+d);
		return somas;
		}
	static String multiplicacao(int a, int b, int c, int d) {
		String multi = "Os resultados a seguir são referentes às multiplicações entre: A e B: " + a*b + " / A e C: " + a*c +
				" / A e D: " + a*d + " / B e C: " + b*c + " / B e D: " + b*d + " / C e D: " + c*d;
		return multi;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		System.out.println("Seja bem-vindo!");
		System.out.println("Por favor digite o valor de A");
		a = sc.nextInt();
		System.out.println("Agora, insira o valor de B");
		b = sc.nextInt();
		System.out.println("Agora, o valor de C");
		c = sc.nextInt();
		System.out.println("E por último, o valor de D");
		d = sc.nextInt();
		System.out.println("Obrigado! Abaixo estão os resultados:");
		System.out.println(soma(a,b,c,d));
		System.out.println(multiplicacao(a,b,c,d));
		sc.close();
	}

}
