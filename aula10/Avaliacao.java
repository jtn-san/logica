/**
 * 
 */
package exercicios;

import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class Avaliacao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome;
		String ossos;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.println("");
		System.out.println("Avaliação de Anatomia");
		System.out.println("");
		System.out.println("Regras: ");
		System.out.println("Sistema só aceita uma resposta, ela precisa ser exata e sem erros ortográficos, quando for quantidade, digite o número correlacionado, se for nome, digite o nome correspondente usando acentos.");
		System.out.println("");
		double resposta;
		System.out.println("1. O crânio é formado por quantos ossos?");		
		System.out.print("Digite sua resposta: ");
		resposta = teclado.nextDouble();
		System.out.println("");
		if (resposta == 8) {
			System.out.println("Sua resposta está certa.");
		} else {
			System.out.println("Sua resposta está incorreta.");
		}
		System.out.println("");
		System.out.println("2. A quantidade de ossos da face é?");		
		System.out.print("Digite sua resposta: ");
		resposta = teclado.nextDouble();
		System.out.println("");
		if (resposta == 14) {
			System.out.println("Sua resposta está certa.");
		} else {
			System.out.println("Sua resposta está incorreta.");
		}
		System.out.println("");
		System.out.println("3. Quantos dentes um adulto tem?");		
		System.out.print("Digite sua resposta: ");		
		resposta = teclado.nextDouble();
		if (resposta == 32) {
			System.out.println("A resposta está correta");
		} else {
			System.out.println("A resposta está incorreta");
		}
		System.out.println("");
		System.out.println("4. O sistema esquelético do adulto é composto de quantos ossos?");		
		System.out.print("Digite sua resposta: ");		
		resposta = teclado.nextDouble();
		if (resposta == 206) {
			System.out.println("A resposta está correta");
		} else {
			System.out.println("A resposta está incorreta");
		}
		System.out.println("");
		System.out.println("5. Quantas vértebras a coluna cervical possui?");		
		System.out.print("Digite sua resposta: ");		
		resposta = teclado.nextDouble();
		if (resposta == 7) {
			System.out.println("A resposta está correta");
		} else {
			System.out.println("A resposta está incorreta");
		}
		System.out.println("");
		System.out.println("6. Quais ossos formam 'as maças do rosto' ? ");		
		System.out.println("Digite sua resposta: ");
		ossos = teclado.next();		
		if (ossos.equals("zigomáticos")) {
			System.out.println("A resposta está correta");
		} else {
			System.out.println("A resposta está incorreta");
		}		
		teclado.close();
	}

}
