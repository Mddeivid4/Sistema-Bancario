package sistemaBancario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Banco bc = new Banco();
		Conta cont = new Conta();
		
		int login;
		int op;
		String tipoConta;
		String nome;
		
		login = 0;
		op = 0;
		
		while(login != 3) {
			System.out.println("1 - Entrar na Conta");
			System.out.println("2 - Criar Conta");
			System.out.println("3 - Fechar");
			login = sc.nextInt();
			
			switch (login) {
			case 1:
				System.out.println("Digite o numero da conta:");
				int numeroConta = sc.nextInt();
				Conta contaAtual = bc.buscarConta(numeroConta);
				tipoConta= cont.getTipoConta();
				
				if (contaAtual != null) {
					while (op != 5) {
						
						
						System.out.println("olá, " + contaAtual.getTitular());
						System.out.println();
						System.out.println("1 - Depositar");
						System.out.println("2 - Sacar");
						System.out.println("3 - transferir");
						System.out.println("4 - Ver Saldo");
						System.out.println("5 - Sair");
						op = sc.nextInt();
						switch (op) {
						case 1:
								try{
									System.out.println("Digite o valor do deposito:");
									contaAtual.depositar(sc.nextDouble());
								}catch(ValorInvalidoException e) {
									e.getMessage();
								}
							break;
						case 2:
								try{
									System.out.println("Digite o valor do saque:");
									contaAtual.sacar(sc.nextDouble());
								}catch(ValorInvalidoException e) {
									e.getMessage();
								}
							break;
						case 3:
							System.out.println("digite o valor da transferencia:");
							double valor = sc.nextDouble();
							System.out.println("Digite o numero da conta:");
							Conta destino = bc.buscarConta(sc.nextInt());
							
							if(destino != null) {
								try {
									contaAtual.transferir(destino,valor);
								} catch (Exception e) {
									e.getMessage();
								}
							}
							break;
						case 4:
								System.out.println("R$" + contaAtual.getSaldo());
							break;
						case 5:
							login = 0;
							break;
						default:
							System.out.println("Opção invalida");
							System.out.println();
							break;
						}
					}
				}
				op = 0;
				break;	
			case 2:
				System.out.println("Escolha o tipo de Conta");
				System.out.println("cc - Conta Corrente");
				System.out.println("cp - Conta poupança");
				tipoConta = sc.next();
				tipoConta.toLowerCase();
				tipoConta.trim();
				
				switch(tipoConta) {
				case "cc": 
					System.out.println("Digite seu nome:");
					nome = sc.next();
					System.out.println("Digite o numero da sua conta:");
					Conta cc = new ContaCorrente(nome,sc.nextInt());
					bc.adicionarConta(cc);
					
					
					break;
				case "cp":
					System.out.println("Digite seu nome:");
					nome = sc.next();
					System.out.println("Digite o numero da sua conta:");
					Conta cp = new ContaPoupanca(nome,sc.nextInt());
					bc.adicionarConta(cp);
					
					break;
				default:
					System.out.println("Opção invalida");
					System.out.println();
					break;
				}
				tipoConta = "";
				break;	
			case 3:
				login = 3;
				break;
			default:
				System.out.println("Opção invalida");
				System.out.println();
				break;
			}
		}
		sc.close();
	}
}
