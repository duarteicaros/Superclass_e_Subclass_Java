package HerancaInterface;

import java.util.Scanner;

public class TesteAdministrador extends Pessoa {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		String nome, endereco, telefone;
		double estadia, viagem, alimentacao;

		Administrador adm = new Administrador("Icaro Duarte", "Rua Maria Mesquita, nº198", "(11)94526-1234", 750, 346,1568);
		Administrador adm1 = new Administrador("Jair da Silva", "Rua Alencar, nº80", "(11)94526-8561", 850, 230, 985);
		Administrador adm2 = new Administrador();
		Administrador adm3 = new Administrador();
		Administrador adm4 = new Administrador();

		adm2.setNome("Wellingthon Pereira");
		adm2.setEndereco("Rua Sebastião Freitas");
		adm2.setTelefone("(11)95624-8631");
		adm2.setEstadia(520.0);
		adm2.setAlimentacao(86.0);
		adm2.setViagem(600.0);

		adm3.setNome("Jorge");
		adm3.setEndereco("Av. Faria Lima");
		adm3.setTelefone("(11)98654-8563");
		adm3.setEstadia(560.0);
		adm3.setAlimentacao(220.0);
		adm3.setViagem(800.0);

		// SIMULAÇÃO DO USUÁRIO ENTRANDO COM OS DADOS UMA UNICA VEZ//
		System.out.printf("Informe o nome do administrador: ");
		nome = leia.nextLine();
		adm4.setNome(nome);

		System.out.printf("Informe o seu endereço: ");
		endereco = leia.nextLine();
		adm4.setEndereco(endereco);

		System.out.printf("Informe o telefone: ");
		telefone = leia.nextLine();
		adm4.setTelefone(telefone);

		System.out.printf("Informe o custo da estadia: R$");
		estadia = leia.nextDouble();
		adm4.setEstadia(estadia);

		System.out.printf("Informe o custo da alimentação: R$");
		alimentacao = leia.nextDouble();
		adm4.setAlimentacao(alimentacao);

		System.out.printf("Informe o custo de passagem: R$");
		viagem = leia.nextDouble();
		adm4.setViagem(viagem);

		/*-------------------FIM DA SIMULAÇÃO----------------------*/

		// administrador //

		System.out.println("=========================================");
		System.out.println(" ___________________________________ ");
		System.out.println("|\t  ADMINISTRADOR             |");
		System.out.println("|___________________________________|");

		System.out.println("\n|NOME: " + adm.getNome());
		System.out.println("|ENDERÇO: " + adm.getEndereco());
		System.out.println("|TELEFONE: " + adm.getTelefone());
		System.out.println("\n;*****************************;" + "\n|  VALORES GASTOS NA VIAGEM   |"
				+ "\n'*****************************'");
		System.out.println("   ALIMENTAÇÃO: R$" + adm.getAlimentacao());
		System.out.println("   ESTADIA: R$" + adm.getEstadia());
		System.out.println("   TRANSPORTE: R$" + adm.getViagem());
		System.out.println("\n\n" + adm.ajudaDeCusto());
		System.out.println("=========================================");

		// administrador 1//
		System.out.println(" ___________________________________ ");
		System.out.println("|\t  ADMINISTRADOR             |");
		System.out.println("|___________________________________|");

		System.out.println("\n|NOME: " + adm1.getNome());
		System.out.println("|ENDERÇO: " + adm1.getEndereco());
		System.out.println("\n;*****************************;" + "\n|  VALORES GASTOS NA VIAGEM   |"
				+ "\n'*****************************'");
		System.out.println("   ALIMENTAÇÃO: R$" + adm1.getAlimentacao());
		System.out.println("   ESTADIA: R$" + adm1.getEstadia());
		System.out.println("   TRANSPORTE: R$" + adm1.getViagem());
		System.out.println("\n\n" + adm1.ajudaDeCusto());
		System.out.println("=========================================");

		// administrador 2//
		System.out.println(" ___________________________________ ");
		System.out.println("|\t  ADMINISTRADOR             |");
		System.out.println("|___________________________________|");

		System.out.println("\n|NOME: " + adm2.getNome());
		System.out.println("|TELEFONE: " + adm2.getTelefone());
		System.out.println("\n;*****************************;" + "\n|  VALORES GASTOS NA VIAGEM   |"
				+ "\n'*****************************'");
		System.out.println("   ALIMENTAÇÃO: R$" + adm2.getAlimentacao());
		System.out.println("   ESTADIA: R$" + adm2.getEstadia());
		System.out.println("   TRANSPORTE: R$" + adm2.getViagem());
		System.out.println("\n\n" + adm2.ajudaDeCusto());
		System.out.println("=========================================");

		// administrador 3//
		System.out.println(" ___________________________________ ");
		System.out.println("|\t  ADMINISTRADOR             |");
		System.out.println("|___________________________________|");

		System.out.println("\n|NOME: " + adm3.getNome());
		System.out.println("|ENDERÇO: " + adm3.getEndereco());
		System.out.println("\n;*****************************;" + "\n|  VALORES GASTOS NA VIAGEM   |"
				+ "\n'*****************************'");
		System.out.println("   ALIMENTAÇÃO: R$" + adm3.getAlimentacao());
		System.out.println("   ESTADIA: R$" + adm3.getEstadia());
		System.out.println("   TRANSPORTE: R$" + adm3.getViagem());
		System.out.println("\n\n" + adm3.ajudaDeCusto());
		System.out.println("=========================================");

		// administrador 4//
		System.out.println(" ___________________________________ ");
		System.out.println("|\t  ADMINISTRADOR             |");
		System.out.println("|___________________________________|");

		System.out.println("\n|NOME: " + adm4.getNome());
		System.out.println("|ENDERÇO: " + adm4.getEndereco());
		System.out.println("|TELEFONE: " + adm4.getTelefone());
		System.out.println("\n;*****************************;" + "\n|  VALORES GASTOS NA VIAGEM   |"
				+ "\n'*****************************'");
		System.out.println("   ALIMENTAÇÃO: R$" + adm4.getAlimentacao());
		System.out.println("   ESTADIA: R$" + adm4.getEstadia());
		System.out.println("   TRANSPORTE: R$" + adm4.getViagem());
		System.out.println("\n\n" + adm4.ajudaDeCusto());
		System.out.println("=========================================");
	}

}
