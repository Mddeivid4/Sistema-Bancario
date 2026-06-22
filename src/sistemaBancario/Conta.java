package sistemaBancario;

public abstract class Conta {
	
	private int numero;
	private double saldo;
	private String titular;
	
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
		this.saldo += saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void depositar(double valor) throws Exception{
		if (valor > 0) {
			saldo += valor;
		}
	}
	
	public void sacar(double valor) {}
	
	public double transferir(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
		}
		return valor;
	}
	
}
