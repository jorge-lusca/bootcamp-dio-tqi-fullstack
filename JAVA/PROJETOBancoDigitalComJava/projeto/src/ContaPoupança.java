
public class ContaPoupan�a extends Conta1 {

	public ContaPoupan�a(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirinfoscomuns();
	}
}	