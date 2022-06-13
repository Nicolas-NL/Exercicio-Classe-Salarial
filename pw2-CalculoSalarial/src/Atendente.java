
public class Atendente extends Funcionario {
    private double adicionalNoturno = 20;
	
	public void listarFuncionario() {
		Atendente ate = new Atendente();
        ate.setNome("Adalberto");
        ate.setCpf("12348678903");
		ate.setSalarioBase(100);
		
	}

	
	public void calcularSalarioFinal(double salarioFinal) {
	       salarioFinal = getSalarioBase() + getValorBonificacao() + adicionalNoturno;
			
	}

	
	public String apresentarSalario() {
		
		return  getNome() + getSalarioBase() + getValorBonificacao()+ adicionalNoturno + getSalarioFinal();
	}

}
