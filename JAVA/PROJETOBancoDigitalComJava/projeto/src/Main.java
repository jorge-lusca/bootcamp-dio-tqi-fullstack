
public class Main {

	private static final Cliente iara = null;

	public static void main(String[] args) {
		iara.setNome("Iara");
		
		ContaCorrente cc = new ContaCorrente(iara);
		ContaPoupan�a poupanca = new ContaPoupan�a(iara);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
	
	}

}
