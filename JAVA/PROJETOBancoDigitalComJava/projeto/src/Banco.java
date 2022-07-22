import java.util.List;

public class Banco {
	
	private String nome;
	private List<Conta1> contas;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Conta1> getContas(){
		return contas;
	}
	
	public void setContas(List<Conta1> contas) {
		this.contas = contas;
	}

}
