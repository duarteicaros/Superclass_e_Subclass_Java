/*Cria uma Classe Pessoa, contendo os atributos encapsulados, 
 * com seus respectivos seletores (getters) e modificadores (setters), 
 * e ainda o construtor padrão e pelo menos mais duas opções de construtores 
 * conforme sua percepção. 
 * 
 * Atributos: String nome; String endereço; String telefone; */

package HerancaInterface;

public class Pessoa {
	//ATRIBUTOS//
	private String nome;
	private String endereco;
	private String telefone;
	//PRIMEIRO CONSTRUTOR CONTENDO TODOS OS PARAMETROS//
	public Pessoa(String nome, String endereco, String telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	//SEGUNDO CONSTRUTOR CONTENDO APENAS 2 PARAMETROS//
	public Pessoa(String nome, String telefone)
	{
		this.nome = nome;
		this.telefone = telefone;
	}
	//TERCEIRO CONSTRUTOR VAZIO//
	public Pessoa()
	{
		
	}
	//GETTERS E SETTERS// -GET imprime o valor - SET pega o valor//
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
