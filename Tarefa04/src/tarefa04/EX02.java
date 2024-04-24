/*Elaborar um programa que calcule e apresente o volume
 * de uma caixa retangular, por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.
 */
package tarefa04;

import java.util.Scanner;

public class EX02 {
	static String volumeRetangulo (float c, float l, float h, String m) {
		double volume = c*l*h;
		return "O volume do seu retângulo é de: " + volume + m;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c;
		float l;
		float h;
		String m;
		
		System.out.println("Bem vindo! Insira abaixo o comprimento do seu retângulo");
		c = sc.nextFloat();
		System.out.println("Agora, insira abaixo a largura do seu retângulo");
		l = sc.nextFloat();
		System.out.println("Abaixo, insira a altura do seu retângulo");
		h = sc.nextFloat();
		System.out.println("Por último, esses valores estão em qual unidade de medida?");
		m = sc.next();
		System.out.println("Obrigado! " + volumeRetangulo(c, l, h, m));
		sc.close();
	}

}
