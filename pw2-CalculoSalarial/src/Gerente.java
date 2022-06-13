
public class Gerente extends Funcionario{
    private double gratificacao = 10;

	public void listarFuncionario() {
          Gerente ger = new Gerente();
          ger.setNome("Roberto");
          ger.setCpf("12345678903");
		  ger.setSalarioBase(100);
		  
	
	}


	public void calcularSalarioFinal(double salarioFinal) {
		
       salarioFinal = getSalarioBase() + getValorBonificacao() + gratificacao;
		
	}


	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao()+ gratificacao + getSalarioFinal();
	} 

}
