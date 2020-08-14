/**
 * 
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class CalcularImc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double altura,peso,seuimc;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Cálculo do IMC");
		System.out.print("Digite a altura (ex. 1,60): ");
		altura = teclado.nextDouble(); 
		System.out.print("Digite a peso (ex. 60): ");		
		peso = teclado.nextDouble(); 
		seuimc = peso / (altura*altura);
		System.out.println("");
		System.out.print("Seu IMC: " + formatador.format(seuimc));
		if (seuimc < 18.5) {
			System.out.println(" ABAIXO DO PESO");
		} else if (seuimc >= 18.6 && seuimc < 24.9) {
			System.out.println(" PESO NORMAL");
		} else if (seuimc >= 25.0 && seuimc < 29.9) {
			System.out.println(" ACIMA DO PESO");
		} else if (seuimc >= 30.0 && seuimc < 39.9) {
			System.out.println(" OBESIDADE");
		} else {
			System.out.println(" OBESIDADE GRAVE");
		}
		teclado.close();
		
	}

}
