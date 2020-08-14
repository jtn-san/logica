/**
 * 
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Jonathan
 */
public class PDV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double total, desconto, totalDesconto, valorPago, troco;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("PDV");
		System.out.print("Valor total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();
		totalDesconto = total - (desconto * total) / 100;
		System.out.println("Total com Desconto: " + totalDesconto);
		System.out.print("Valor pago em dinheiro: " );
		valorPago = teclado.nextDouble();
		troco = valorPago - totalDesconto;
		System.out.println("Troco: R$ " + formatador.format(troco));
		teclado.close();
	}

}
