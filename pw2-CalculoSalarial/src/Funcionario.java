
public abstract class Funcionario {
   private String nome;
   private String cpf;
   public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public double getSalarioBase() {
	return salarioBase;
}

public void setSalarioBase(double salarioBase) {
	this.salarioBase = salarioBase;
}

public double getSalarioFinal() {
	return salarioFinal;
}

public void setSalarioFinal(double salarioFinal) {
	this.salarioFinal = salarioFinal;
}

public double getValorBonificacao() {
	return valorBonificacao;
}

public void setValorBonificacao(double valorBonificacao) {
	this.valorBonificacao = valorBonificacao;
}

private double salarioBase;
   private double salarioFinal;
   private double valorBonificacao;
   public abstract void  listarFuncionario();
   
   public abstract void  calcularSalarioFinal(double salarioFinal);

   public abstract String apresentarSalario();
   
   private void cadastrarFuncionario(String Nome, String cpf , double salarioBase){

	   salarioFinal = 0;
	   valorBonificacao = 0;
}

   private void calcularBonificacao() {
       valorBonificacao = 	salarioFinal * 0.05;
   }

}
