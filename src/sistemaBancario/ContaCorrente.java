package sistemaBancario;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(String nome, int numero) {
		super.setTitular(nome); 
		super.setNumero(numero);
		super.setSaldo(0);
		super.setTipoConta("cc");
	}
	
	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= (super.getSaldo()-2)) {
			super.setSaldo(super.getSaldo() - valor -2);
		}
	}
	
}
