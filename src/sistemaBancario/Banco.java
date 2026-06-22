package sistemaBancario;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List<Conta> contas = new ArrayList<>();
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public void buscarConta() {}

}
