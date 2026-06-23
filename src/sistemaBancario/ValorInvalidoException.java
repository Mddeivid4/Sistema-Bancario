package sistemaBancario;

public class ValorInvalidoException extends Exception{
	
	double num;
	
	public ValorInvalidoException(double num) {
		super();
		this.num = num;
	}
	
	@Override
	public String toString() {
		if(num <= 0) {
			return "Valor invalido, valor tem que ser maior que zero.";
		}
		return null;
	}
}
