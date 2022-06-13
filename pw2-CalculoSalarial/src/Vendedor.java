
public class Vendedor extends Funcionario {
    private double valorComissao = 10;

	public void listarFuncionario() {
        Vendedor ven = new Vendedor();
        ven.setNome("Gilberto");
        ven.setCpf("12355678903");
        ven.setSalarioBase(75);
		  
		
	}


	public void calcularSalarioFinal(double salarioFinal) {
	       salarioFinal = getSalarioBase() + getValorBonificacao() + valorComissao;
	}


	public String apresentarSalario() {
		return getNome() + getSalarioBase() + getValorBonificacao()+ valorComissao + getSalarioFinal();

	}

}
