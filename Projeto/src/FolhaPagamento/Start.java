package FolhaPagamento;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<Funcionario>();

		Departamento departamento = new Departamento();

		departamento.setNome("Departamento Nome");
		departamento.setQtdFuncionarios(5);
		departamento.setRamal("Ramal: 12345");

		List<Convenio> convenios = new ArrayList<Convenio>();
		convenios.add(new Convenio(100, 0, TipoConvenio.CLUBE, "Nome teste"));
		convenios.add(new Convenio(150, 0, TipoConvenio.SAUDE, "Nome teste"));
		convenios.add(new Convenio(0, 30, TipoConvenio.FARMACIA, "Nome teste"));

		Funcionario funcionario = new Gerente();
		funcionario.setQtdHorasTrabalhadas(200);
		funcionario.setValorHora(20);
		funcionario.setDependentes(1);
		funcionario.setDataNasc("Data Nasc.");
		funcionario.setNome("Nome Gerente");
		((Gerente) funcionario).setConvenio(convenios);
		((Gerente) funcionario).setBonus(10);
		funcionarios.add(funcionario);

		Funcionario funcionario1 = new Auxiliar();
		funcionario1.setQtdHorasTrabalhadas(200);
		funcionario1.setValorHora(10);
		funcionario1.setDependentes(2);
		funcionario1.setDataNasc("Data Nasc1.");
		funcionario1.setNome("Nome Auxiliar");
		((Auxiliar) funcionario1).setConvenio(convenios);

		funcionarios.add(funcionario1);

		for (Funcionario func : funcionarios) {

			if (func instanceof Gerente) {

				System.out.println("A pessoa é um Gerente");

				StringBuffer stringBuffer = new StringBuffer();

				for (Convenio c : ((Gerente) func).getConvenio()) {
					stringBuffer.append(c.getTipo().name() + " | ");
				}

				System.out.println("Os convênios são: R$" + stringBuffer.toString());
				System.out.println("O valor do convênio é: R$" + ((Gerente) func).calcularConvenio());
				System.out.println("Qtde dependentes: R$" + ((Gerente) func).getDependentes());
				System.out.println("Valor do bônus: R$" + ((Gerente) func).calcularBonus(func.calcularSalario()));
				System.out.println("O salário é: R$" + func.calcularSalario());
				System.out.println();
				

			} else if (func instanceof Auxiliar) {
				System.out.println("A pessoa é um Auxiliar");

				StringBuffer stringBuffer = new StringBuffer();

				((Auxiliar) func).getConvenio().forEach(i -> {

					stringBuffer.append(i.getTipo().name() + " | ");
				});

				System.out.println("Os convênios são: R$" + stringBuffer.toString());				
				System.out.println("A comissão é: R$" + ((Auxiliar) func).getComissao());
				System.out.println("O valor do convenio é: R$" + ((Auxiliar) func).calcularConvenio());
				System.out.println("Qtde dependentes: R$" + ((Auxiliar) func).getDependentes());
				System.out.println("O salário é: R$" + func.calcularSalario());

			}
		}

	}

}
