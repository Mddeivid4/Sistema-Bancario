package sistemaBancario;

public class Conta {
	
	private int numero;
	private double saldo;
	private String titular;
	private String tipoConta;
	
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(double valor) throws ValorInvalidoException{
		if (valor > 0) {
			saldo += valor;
		}
		else if(valor <= 0) {
			throw new ValorInvalidoException(valor);
		}
	}

	public void sacar(double valor) throws ValorInvalidoException{}
	
	public double transferir(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
		return valor;
	}
	
	public void transferir(Conta destino, double valor) throws ValorInvalidoException {
		this.sacar(valor);
		destino.depositar(valor);
		
	}
}
