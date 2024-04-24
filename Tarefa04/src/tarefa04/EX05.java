/*Elaborar um programa que efetue a apresentação do valor da conversão
 * em dólar de um valor lido em real. O programa deve solicitar o valor
 * da cotação do dólar e também a quantidade de reais disponível com o usuário,
 * para que seja apresentado o valor em moeda americana.
 */
package tarefa04;

import java.util.Scanner;

public class EX05 {
		static String conversao(float cotacao, float valor) {
			float valorConvertido = valor * cotacao;			
			return "O valor convertido, em dólares, é de $" + valorConvertido;
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float cotacao;
		float valorEmReal;
		System.out.println("Bem-Vindo! Insira a cotação atual do dólar!");
		cotacao = sc.nextFloat();
		System.out.println("Agora, insira o valor que você possui em reais!");
		valorEmReal = sc.nextFloat();
		System.out.println("Obrigado! " + conversao(cotacao, valorEmReal));
		sc.close();
		}

}