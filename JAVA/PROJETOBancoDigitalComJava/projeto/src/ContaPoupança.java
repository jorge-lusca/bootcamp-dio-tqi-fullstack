
public class ContaPoupança extends Conta1 {

	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirinfoscomuns();
	}
}	