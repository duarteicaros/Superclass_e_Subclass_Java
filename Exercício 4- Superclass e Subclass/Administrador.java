/*Implemente a classe Administrador como subclasse da classe pessoa. 
 *Um determinado administrador tem como atributos da classe Pessoa 
 *e também os atributos próprios como ajudaDeCusto 
 *(ajudas referentes a viagens, estadias).*/

package HerancaInterface;

public class Administrador extends Pessoa {
	
	private double estadia;
	private double alimentacao;
	private double viagem;
	
	public Administrador(String nome, String endereco, String telefone, double estadia,double alimentacao, double viagem)
	{
		super(nome, endereco,telefone);
		this.estadia = estadia;
		this.alimentacao = alimentacao;
		this.viagem = viagem;
	}
	
	public Administrador()
	{
		
	}

	public double getEstadia() {
		return estadia;
	}

	public void setEstadia(double estadia) {
		this.estadia = estadia;
	}

	public double getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(double alimentacao) {
		this.alimentacao = alimentacao;
	}

	public double getViagem() {
		return viagem;
	}

	public void setViagem(double viagem) {
		this.viagem = viagem;
	}
	
	public String ajudaDeCusto()
	{
		double ajudaC;
		
		ajudaC = estadia + alimentacao + viagem;
		
		return " O valor total da ajuda de custo\n a ser devolvida é de: "
				+ "\n  ;*********;"+
				"\n  |R$"+ajudaC+" |"+
				"\n  '*********'";			
	}
	
	

}
