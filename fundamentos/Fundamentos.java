/**
 * 
 */
package fundamentos;

/**
 * @author Jonathan
 *
 */
public class Fundamentos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Aula um - Fundamentos e Váriáveis");
		String nome = "Jonathan";
		int idade = 27;
		char sexo = 'M';
		double temperatura = 26.7;
		boolean arCondicionado = false;
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Sexo: " + sexo);
		System.out.println("Temperatura: " + temperatura);
		System.out.println("Ar Condicionado: " + arCondicionado);
		System.out.println(" <--> ");
		System.out.println("Aula dois - Operadores Aritméticos / Atribuições");
		double i = 10;
		System.out.println("i = " + i);
		System.out.println("i = " + i + " + 5 | i = " + (i + 5));
		System.out.println("i = " + i + " - 5 | i = " + (i - 5));
		System.out.println("i = " + i + " * 5 | i = " + (i * 5));
		System.out.println("i = " + i + " / 5 | i = " + (i / 5));
		System.out.println("i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i +=5        | = " + (i += 5));
		System.out.println("i -=5        | = " + (i -= 5));
		System.out.println("i *=5        | = " + (i *= 5));
		System.out.println("i /=5        | = " + (i /= 5));
		i++;
		System.out.println("i++          | i = " + i);
		i--;
		System.out.println("i--          | i = " + i);
		System.out.println(" <--> ");
		System.out.println("Aula três - Estruturas condicionais if else switch");
		System.out.println("Uso do 'if'");
		if (sexo == 'M') {
			System.out.println("Alistamento militar obrigatório");
		}
		System.out.println("");
		System.out.println("Uso do 'if - else'");
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Uso do 'else - if'");
		if (idade < 16) {
			System.out.println("PROIBIDO VOTA");
		} else if (idade >= 18 && idade <= 70) {
			System.out.println("VOTO OBRIGATÓRIO");
		} else {
			System.out.println("VOTO FACULTATIVO");
		}
		System.out.println("");
		System.out.println("Uso do 'switch case'");
		System.out.println("1. Cadastro de clientes");
		System.out.println("2. Cadastro de usuários");
		System.out.println("3. Relatórios");
		int opcao = 1;
		switch (opcao) {
		case 1:
			System.out.println("CLIENTE");
			break;
		case 2:
			System.out.println("USUÁRIOS");
			break;
		case 3:
			System.out.println("RELATÓRIOS");
			break;
		default:
			System.out.println("Opção inválida");
			break;
		}
		System.out.println(" <--> ");
		System.out.println("Aula quatro - Laços de repetições - for - while");
		System.out.println("");
		System.out.println("Uso do 'for'");
		for (int j = 10; j > 0; j--) {
			System.out.println(j);
		}
		System.out.println("");
		System.out.println("Tabuada");
		for (int tabuada = 0; tabuada <= 10; tabuada++) {
			System.out.println("");
			for (int valor = 0; valor <= 10; valor++) {
				System.out.println(tabuada + " x " + valor + " = " + (tabuada * valor));
			}
		}
		System.out.println("");
		System.out.println("Uso do 'while'");	
		int contador = 1;
		while (contador <= 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("");
		System.out.println("Uso do 'do while'");
		char novoJogo;
		do {
			System.out.println("Deseja jogar novamente (s/n)?");
			novoJogo = 'n';
		} while (novoJogo == 's');
			System.out.println("GAME OVER");
}
}
