package sistemaBancario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int login;
		int op;
		String tipoConta;
		
		login = 0;
		op = 0;
		
		while(login != 3) {
			System.out.println("1 - Entrar na Conta");
			System.out.println("2 - Criar Conta");
			System.out.println("3 - Fechar");
			login = sc.nextInt();
			
			switch (login) {
			case 1:
				while (op != 5) {
					System.out.println("1 - Depositar");
					System.out.println("2 - Sacar");
					System.out.println("3 - transferir");
					System.out.println("4 - Ver Saldo");
					System.out.println("5 - Sair");
					op = sc.nextInt();
					
					switch (op) {
					case 1:
						break;
					case 2:
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						op = 5;
						break;
					default:
						System.out.println("Opção invalida");
						System.out.println();
						break;
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
					break;
				case "cp":
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
