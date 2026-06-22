package sistemaBancario;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(String nome, int numero) {
		super.setTitular(nome); 
		super.setNumero(numero);
		super.setSaldo(0);
	}
	
	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= (super.getSaldo()-2)) {
			super.setSaldo(valor);
		}
	}
	
}
