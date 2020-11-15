package FolhaPagamento;

import java.util.ArrayList;
import java.util.List;


public class Gerente extends Funcionario{
	 
	protected double bonus;
	public List<Convenio> convenio = new ArrayList<>();
	
	public Gerente() {
	}
	
	public Gerente(double bonus, List<Convenio> convenio) {
		super();
		this.bonus = bonus;
		this.convenio = convenio;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public List<Convenio> getConvenio() {
		return convenio;
	}
	public void setConvenio(List<Convenio> convenio) {
		this.convenio = convenio;
	}

	@Override
	public double calcularSalario() {
		double valorSalario = getQtdHorasTrabalhadas()*getValorHora(); 
		double valorBonus= this.calcularBonus(valorSalario); 
		double valorDescontos = this.calcularConvenio();
		
		return (valorSalario + valorBonus) - valorDescontos;
		
	}

	public double calcularBonus(double salario) {
		double baseCalculoBonus = this.bonus/100;
		return salario * baseCalculoBonus;
		
	}
	public double calcularConvenio() {
		double valorConvenio = 0.0;

		 for (Convenio convenio : convenio) {
				valorConvenio += convenio.getMensalidade() * (this.getDependentes() + 1) ;
		}
		
		return valorConvenio;
		
	}
	

	
	
	

}
