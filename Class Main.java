import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Digite o tipo do logradouro: ");
		String tipoLogr = ent.nextLine();
		
		System.out.println("Digite o nome do logradouro: ");
		String nomeLogr = ent.nextLine();
		
		System.out.println("Digite o número do lagradouro: ");
		int numLogr = ent.nextInt();
		
		System.out.println("Digite o apartamento: ");
		int apt = ent.nextInt();
		
		System.out.println("Digite o complemento: ");
		String compl = ent.nextLine();
		
		Endereco ende = new Endereco(tipoLogr, nomeLogr, numLogr, apt, compl);
		ende.exibirDados();
		ent.close();
		
		
		
		System.out.println("Digite o nome do Cliente: ");
		String nome = ent.nextLine();
		
		System.out.println("Digite o CPF do cliente: ");
		int cpf = ent.nextInt();
		
		Cliente cli = new Cliente(nome, cpf);
		cli.exibirDados();
		ent.close();	
		
		
		
		System.out.println("Digite o número da conta: ");
		int num = ent.nextInt();
		
		System.out.println("Digite o saldo da conta: ");
		float saldo = ent.nextFloat();
		
		Conta con = new Conta(num, saldo);
		
		System.out.println("Quanto deseja depositar? ");
		float val = ent.nextFloat();
		con.sacar(val);
		con.exibirDados();
		System.out.println("Quanto deseja sacar? ");
		con.depositar(val);
		con.exibirDados();
		ent.close();
	}

}
