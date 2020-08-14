/**
 * 
 */
package exercicios;

import java.util.Scanner;

/**
 * @author Jonathan
 *
 */
public class Porcentagem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x,y,valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Regra de 3");
		System.out.println("x% * y = valor");
		System.out.print("Digite o Valor da porcetagem x: ");
		x = teclado.nextDouble();
		System.out.println("Digite o Valor que gostaria de descobrir a % y: ");
		y = teclado.nextDouble();
		valor = (x*y) / 100;
		System.out.println("");
		System.out.println("Resultado = " + valor);
		teclado.close();
		
	}

}
