package programaSoma;

import java.util.Scanner;

// Um programa que recebe 3 entradas do usu�rio, soma e informa a m�dia dos n�meros.

public class ProgramaSoma {

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		MetodosEVariaveis metodos = new MetodosEVariaveis();

// Pede ao usu�rio 3 n�meros.
		
		System.out.println("Digite o primeiro n�mero inteiro: ");
		int primeiroNumero = scanner.nextInt();

		System.out.println("Digite o segundo n�mero inteiro: ");
		int segundoNumero = scanner.nextInt();

		System.out.println("Digite o terceiro n�mero inteiro: ");
		int terceiroNumero = scanner.nextInt();

		metodos.setNumeros(primeiroNumero, segundoNumero, terceiroNumero);

// Chama os m�todos da classe MetodosEVariaveis.
		
		int soma = metodos.soma();
		double media = metodos.media();

// Imprime a soma e m�dia ao final.
		
		System.out.println("A SOMA dos tr�s n�meros inteiros foi: " + soma);
		System.out.println("A M�DIA dos tr�s n�meros inteiros foi: " + media);

		scanner.close();
	}
}
