package FolhaPagamento;


public class Convenio {
	
	private double mensalidade;
	private double desconto;
	private TipoConvenio tipo;
	private String nome;
	
	public Convenio() {
		
	}

	public Convenio(double mensalidade, double desconto, TipoConvenio tipo, String nome) {
		super();
		this.mensalidade = mensalidade;
		this.desconto = desconto;
		this.tipo = tipo;
		this.nome = nome;
	}

	public double getMensalidade() {
		return mensalidade;
	}

	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public TipoConvenio getTipo() {
		return tipo;
	}

	public void setTipo(TipoConvenio tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Convenio [mensalidade=" + mensalidade + ", desconto=" + desconto + ", tipo=" + tipo + ", nome=" + nome
				+ "]";
	}
}
