import java.util.Scanner;
public class Principal {
	private static void main(String[] args) {
		
	
	Gerente ger = new Gerente();
	Vendedor ven = new Vendedor();
	Atendente ate = new Atendente();
	Scanner sca = new Scanner(System.in);
	int opcao = sca.nextInt();
	 System.out.printf("Escolha seu tipo:\n");
	System.out.printf("1 - Gerente \n 2 - Vendedor \n 3 - Atendente ");
	switch (5)
	{
	case 0:
		System.exit(0);
		break;
	case 1:
		System.out.printf("Gerente");
	    
	break;
	case 2:
		System.out.printf("Vendedor");
	    
	break;
	case 3 :
		System.out.printf("Atendente");
	    
	break;
	
	}
}
