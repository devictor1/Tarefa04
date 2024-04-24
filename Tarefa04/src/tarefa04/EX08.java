/*Elaborar um programa de computador que efetue a
 * leitura de quatro valores inteiros (variáveis A, B, C e D).
 * Ao final o programa deve apresentar o resultado do produto
 * (variável P) do primeiro com o terceiro valor e o resultado
 * da soma (variável S) do segundo com o quarto valor.
*/
package tarefa04;

import java.util.Scanner;

public class EX08 {
	int a;
	int b;
	int c;
	int d;
	int s;
	float p;	
		public EX08 (int a, int b, int c, int d) {
			p = a*c;
			s = b+d;
			System.out.println("O resultado do produto do primeiro com o terceiro valor é de " + p + 
					" e o resultado da soma do segundo com o quarto valor é de " + s);
		}
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		int d;
		Scanner sc = new Scanner(System.in);
		System.out.println("Seja bem-vindo! Digite os quatro valores inteiros desejados, com um espaço entre cada.");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		EX08 ex08 = new EX08(a,b,c,d);
		sc.close();
		
	}

}
