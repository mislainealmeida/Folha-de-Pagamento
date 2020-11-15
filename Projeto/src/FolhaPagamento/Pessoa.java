package FolhaPagamento;

public abstract class Pessoa {
	protected String nome;
	protected String estadoCivil;
	protected int dependentes;
	protected String dataNasc;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome,String estadoCivil, int dependentes, String dataNasc) {
		this.nome=nome;
		this.estadoCivil=estadoCivil;
		this.dependentes=dependentes;
		this.dataNasc=dataNasc;
		
	}	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public abstract double calcularSalario();

}
