/**
 * 
 */
package exercicios;

import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class CalculadoraMedia {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome;
		double nota1,nota2,media;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a nota1: ");
		nota1 = teclado.nextDouble(); 
		System.out.print("Digite a nota2: ");		
		nota2 = teclado.nextDouble(); 
		media = (nota1 + nota2) / 2;
		System.out.println("");
		System.out.println("============");		
		System.out.println("== C�lculo da m�dia ==");
		System.out.println("============");
		System.out.println("");
		System.out.println("Nome: " + nome);
		System.out.println("M�dia: " + media);
		if (media <5) {
			System.out.println("REPROVADO");
		} else if (media >= 2 && media < 5){
			System.out.println("RECUPERA��O");
		} else {
			System.out.println("APROVADO");
		}		
		teclado.close();
	}
}
