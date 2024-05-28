package conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) throws Exception {
		// TODO:Conhecer e importar a classe Scanner

		// Exibir as mensagens para o nosso usuário

		// Obter pela scanner os valores digitados no terminal

		// Exibir a mensagem conta criada

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Por favor, digite o seu nome: ");
		String nomeCliente = scanner.nextLine();

		System.out.println("Nome completo: " + nomeCliente);

		System.out.println("Por favor, digite o número da sua agência(dessa forma 000-0): ");
		String agencia = scanner.next();

		System.out.println("Por favor, digite o número da sua conta: ");
		int conta = scanner.nextInt();

		System.out.println("Por favor, qual o valor do seu saldo?: ");
		double saldo = scanner.nextDouble();

		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia + ", conta " + conta + " e seu saldo\n" + saldo + " já está disponível para saque.");
	}
}
