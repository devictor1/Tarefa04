/* Ler o valor correspondente ao salário mensal
 * (variável SM) de um trabalhador e também o valor
 * do percentual de reajuste (variável PR) a ser atribuído.
 * Apresentar o valor do novo salário (variável NS).
 */


package tarefa04;

import java.util.Scanner;

public class EX09 {
	static float nS (float sm, float pr) {
		return sm + (sm * (pr / 100));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float sm;
		float pr;
		
		System.out.println("Seja bem-vindo! Digite abaixo o seu Salário Mensal!");
		sm = sc.nextFloat();
		System.out.println("Obrigado! Agora, digite o Percentual de Reajuste da sua ocupação atual");
		pr = sc.nextFloat();
		System.out.println("Perfeito! Seu Novo Salário é de " + nS(sm, pr) + " Reais!");
		
		
		
		
		sc.close();
	}

}
