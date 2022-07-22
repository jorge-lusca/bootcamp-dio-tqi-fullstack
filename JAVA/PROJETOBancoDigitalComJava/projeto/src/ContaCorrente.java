
public class ContaCorrente extends Conta1 {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirinfoscomuns();
	}

	public void depositar(int i) {
		// TODO Auto-generated method stub
		
	}

	public void transferir(int i, ContaPoupança poupanca) {
		// TODO Auto-generated method stub
		
	}
	
}
