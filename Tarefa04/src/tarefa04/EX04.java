/*Elaborar um programa que efetue a apresentação do valor da conversão 
 *em real de um valor lido em dólar. O programa deve solicitar o valor
 *da cotação do dólar e também a quantidade de dólares disponível com o
 *usuário, para que seja apresentado o valor em moeda brasileira.
 */

package tarefa04;

import java.util.Scanner;

public class EX04 {
		static String conversao(float cotacao, float valor) {
			float valorConvertido = valor / cotacao;			
			return "O valor convertido, em reais, é de R$" + valorConvertido;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cotacao;
		float valorEmDolar;
		System.out.println("Bem-Vindo! Insira a cotação atual do dólar!");
		cotacao = sc.nextFloat();
		System.out.println("Agora, insira o valor que você possui em dólares!");
		valorEmDolar = sc.nextFloat();
		System.out.println("Obrigado! " + conversao(cotacao, valorEmDolar));
		sc.close();
		}

}
