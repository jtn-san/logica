package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class Temperatura {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome = "F° para C°";
		double f,media;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.print("Digite o Fahrenheit: ");
		f = teclado.nextDouble();
		media = (f - 32)*5 / 9;		
		System.out.println("");
		System.out.println("Conversão: " + nome);
		System.out.println("Grau Celsius = " + formatador.format(media) + " C°");
		teclado.close();
	}

}
