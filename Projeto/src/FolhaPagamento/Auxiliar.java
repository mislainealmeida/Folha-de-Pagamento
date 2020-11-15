package FolhaPagamento;

import java.util.List;



public class Auxiliar extends Funcionario{
	
	protected List<Convenio> convenio;
	protected double comissao;
	
	public Auxiliar() {
	}
	
	public Auxiliar(List<Convenio> convenio, double comissao) {
		super();		
		this.convenio = convenio;
		this.comissao= comissao;
	}
	
	
	public List<Convenio> getConvenio() {
		return convenio;
	}
	public void setConvenio(List<Convenio> convenio) {
		this.convenio = convenio;
	}
	
	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	@Override
	public double calcularSalario() {
		double valorSalario = getQtdHorasTrabalhadas()*getValorHora(); 
		double valorDescontos = this.calcularConvenio();
		
		return (valorSalario- valorDescontos) + this.comissao;
		
	}


	public double calcularConvenio() {
		double valorConvenio = 0.0;

		 for (Convenio convenio : convenio) {
				valorConvenio += convenio.getMensalidade() * (this.getDependentes() + 1) ;
		}
		
		return valorConvenio;
		
	}
	


}
