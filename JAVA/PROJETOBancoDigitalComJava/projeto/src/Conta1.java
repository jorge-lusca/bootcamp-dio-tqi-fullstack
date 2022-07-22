
public abstract class Conta1 implements Iconta {
	 
	 private static final int AGENCIA_PADRAO = 1;
	 private static int SEQUENCIAL = 1;
	
	 protected int agencia;
	 protected int numero;
	 protected double saldo;
	 protected Cliente cliente;

	 public Conta1(Cliente cliente) {
			this.agencia = Conta1.AGENCIA_PADRAO;
			this.numero = SEQUENCIAL++;
			this.cliente = cliente;
	}
	 
	 public void Conta11(Cliente cliente2) {
		// TODO Auto-generated constructor stub
	}

	public void Conta(Cliente cliente2) {
		// TODO Auto-generated constructor stub
	}

	@Override
		public void sacar(double valor) {
			saldo -= valor;
		}

		@Override
		public void depositar(double valor) {
			saldo += valor;
		}

		@Override
		public void transferir(double valor, Iconta contaDestino) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}

		public int getAgencia() {
			return agencia;
		}

		public int getNumero() {
			return numero;
		}

		public double getSaldo() {
			return saldo;
		}
	
	protected void imprimirinfoscomuns() {
	        System.out.println(String.format("Titular: %s", this.cliente.getNome()));	
	        System.out.println(String.format("Agencia: %d", this.agencia));
	        System.out.println(String.format("Numero: %d", this.numero));
	        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

 }
