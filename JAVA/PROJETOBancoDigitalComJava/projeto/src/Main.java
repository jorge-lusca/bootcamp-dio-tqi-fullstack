
public class Main {

	private static final Cliente iara = null;

	public static void main(String[] args) {
		iara.setNome("Iara");
		
		ContaCorrente cc = new ContaCorrente(iara);
		ContaPoupanša poupanca = new ContaPoupanša(iara);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
	
	}

}
