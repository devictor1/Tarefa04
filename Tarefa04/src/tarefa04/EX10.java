/*Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C).
 * Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos
 * votos válidos para cada candidato. Deve ser criado um programa de computador que efetue
 * a leitura da quantidade de votos válidos para cada candidato, além de efetuar também a
 * leitura da quantidade de votos nulos e votos em branco. Ao final o programa deve apresentar
 * o número total de eleitores, considerando votos válidos, nulos e em branco; o percentual
 * correspondente de votos válidos em relação à quantidade de eleitores; o percentual correspondente
 * de votos válidos do candidato A em relação à quantidade de eleitores; o percentual correspondente
 * de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente
 * de votos válidos do candidato C em relação à quantidade de eleitores; o percentual correspondente
 * de votos nulos em relação à quantidade de eleitores; e por último o percentual correspondente de
 * votos em branco em relação à quantidade de eleitores.
 */

package tarefa04;

import java.util.Scanner;

public class EX10 {
	public static void eleicao(int a, int b, int c, int nu, int br) {
		float totalVotos = a + b + c + nu + br;
		float votosValidos = a + b + c;
		float percentualVV = 100 * votosValidos / totalVotos;
		float percentualVA = 100 * a / totalVotos;
		float percentualVB = 100 * b / totalVotos;
		float percentualVC = 100 * c / totalVotos;
		float percentualNU = 100 * nu / totalVotos;
		float percentualBR = 100 * br / totalVotos;
		
		System.out.println("O número total de eleitores é " + totalVotos);
		System.out.println("O percentual de votos válidos é de " + percentualVV + " %");
		System.out.println("O percentual de votos no candidato A é de " + percentualVA + " %");
		System.out.println("O percentual de votos no candidato B é de " + percentualVB + " %");
		System.out.println("O percentual de votos no candidato C é de " + percentualVC + " %");
		System.out.println("O percentual de votos nulos é de " + percentualNU + " %");
		System.out.println("O percentual de votos brancos é de " + percentualBR + " %");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int nu;
		int br;
		
		System.out.println("Bem-vindo! Insira abaixo a quantidade de votos no Candidato A!");
		a = sc.nextInt();
		System.out.println("Agora, insira a quantidade de votos no Candidato B!");
		b = sc.nextInt();
		System.out.println("Abaixo, coloque a quantidade de votos no Candidato C");
		c = sc.nextInt();
		System.out.println("Por favor agora insira a quantidade de votos nulos");
		nu = sc.nextInt();
		System.out.println("Por último, quantos votos brancos foram computados?");
		br = sc.nextInt();
		System.out.println("Veja abaixo os resultados da eleição!");
		eleicao(a, b, c, nu, br);
		
		sc.close();
	}

}
