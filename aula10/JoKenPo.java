/**
 * 
 */
package exercicios;

import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class JoKenPo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("                 JoKenPo              ");
		System.out.println("Jogador");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");		
		int opcao;
		System.out.println("Digite sua opção: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Jogador escolheu: Pedra");
			break;
		case 2:
			System.out.println("Jogador escolheu:. Papel");
			break;
		case 3:
			System.out.println("Jogador escolheu: Tesoura");
			break;
		case 4:
			System.out.println("Inválido");
			break;
		}
		System.out.println("");		
		System.out.println("COMPUTADOR");	
		int jokenpo = (int) (Math.random() * 3 + 1);
		switch (jokenpo) {
		case 1:
			System.out.println("Computador escolheu: Pedra");
			break;
		case 2:
			System.out.println("Computador escolheu: Papel");
			break;
		case 3:
			System.out.println("Computador escolheu: Tesoura");
			break;
		}
		System.out.println("                 resultado              ");
		System.out.print("Jogador escolheu: " + opcao + " Computador escolheu: " + jokenpo);
		System.out.println("");
		if (opcao == jokenpo) {
				System.out.println("     EMPATE");
			} else if (opcao ==1 && jokenpo ==3 ) {
				System.out.println("     Jogador Ganhou");
			}  else if (opcao == 2 && jokenpo ==1 ) {
				System.out.println("     Jogador Ganhou");
			} else if (opcao ==3 && jokenpo ==2 ) {
				System.out.println("     Jogador Ganhou");
			}else {
				System.out.println("     Computador Ganhou");
			}
		teclado.close();
	}
}
