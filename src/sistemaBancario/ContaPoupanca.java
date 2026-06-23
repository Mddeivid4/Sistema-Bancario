package sistemaBancario;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca (String nome, int numero) {
		super.setTitular(nome);
		super.setNumero(numero);
		super.setSaldo(0);
		super.setTipoConta("cp");
	}
	
	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= super.getSaldo()) {
			super.setSaldo(super.getSaldo() - valor);
		}
	}
}
