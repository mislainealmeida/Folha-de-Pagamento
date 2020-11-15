package FolhaPagamento;

public class Funcionario extends Pessoa{
	

	protected String departamento; 
	protected double qtdHorasTrabalhadas;
	protected double valorHora;
	
	public Funcionario() {}
	
	public Funcionario(String departamento,	double qtdHorasTrabalhadas, double valorHora) {
		super();
		this.departamento = departamento;
		this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
		this.valorHora = valorHora;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public double getQtdHorasTrabalhadas() {
		return qtdHorasTrabalhadas;
	}
	public void setQtdHorasTrabalhadas(double qtdHorasTrabalhadas) {
		this.qtdHorasTrabalhadas = qtdHorasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	

	public double calcularSalario() {
		
		return this.qtdHorasTrabalhadas * this.valorHora;
		
	}
}
