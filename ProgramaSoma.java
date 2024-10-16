package programaSoma;

import java.util.Scanner;

// Um programa que recebe 3 entradas do usuário, soma e informa a média dos números.

public class ProgramaSoma {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		MetodosEVariaveis metodos = new MetodosEVariaveis();

// Pede ao usuário 3 números.
		
		System.out.println("Digite o primeiro número inteiro: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Digite o segundo número inteiro: ");
		int segundoNumero = scanner.nextInt();

		System.out.println("Digite o terceiro número inteiro: ");
		int terceiroNumero = scanner.nextInt();

		metodos.setNumeros(primeiroNumero, segundoNumero, terceiroNumero);

// Chama os métodos da classe MetodosEVariaveis.
		
		int soma = metodos.soma();
		double media = metodos.media();

// Imprime a soma e média ao final.
		
		System.out.println("A SOMA dos três números inteiros foi: " + soma);
		System.out.println("A MÉDIA dos três números inteiros foi: " + media);

		scanner.close();
	}
}
