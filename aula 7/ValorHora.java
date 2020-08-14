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
public class ValorHora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double remuneracao, custo, hora;
		int cargaHoraria;
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.println("Cálculo do valor da hora de serviço");
		System.out.print("Remuneração mensal pretendida");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional");
		custo = teclado.nextDouble();
		System.out.println("Carga horária mensal de trabalho: ");
		cargaHoraria = teclado.nextInt();
		System.out.println("");
		hora = (remuneracao + (0.3 * remuneracao) + custo + (0.2 * remuneracao)) / cargaHoraria;
		System.out.println("");
		System.out.println("Valor da hora: " + formatador.format(hora));
		teclado.close();

	}

}
