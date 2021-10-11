package teste.palidromo;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String palavra;
		String palindromo = "";

		System.out.println("Digite uma palavra: ");
		palavra = ler.nextLine();

		for (int i = palavra.length() - 1; i >= 0; i--) {
			palindromo = palindromo + palavra.charAt(i);
		}

		if (palindromo.equals(palavra)) {
			System.out.print(palindromo + " é um palíndromo!");

		} else {
			System.out.print(palavra + " não é um palíndromo!");
		}

	}

}
