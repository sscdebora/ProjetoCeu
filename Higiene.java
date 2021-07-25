package ProjetoCeu;

public class Higiene extends Doacoes {
	
	 //Atributos\\
	private int papelHigienico;
	private int sabonete;
	private int shampoo;
	private int condicionador;
	private int absorventes;
	private int pentes;
	private int escovaDentes;
	private int cremeDental;
	
	//Construtor\\
	public Higiene(String nome, String endereco,int idade, int papelHigienico, int sabonete, int shampoo,int condicionador,
			int absorventes,int pentes,int escovaDentes,int cremeDental) {
		
		super(nome,endereco,idade);
		this.papelHigienico = papelHigienico;
		this.sabonete = sabonete;
		this.condicionador = condicionador;
		this.absorventes = absorventes;
		this.pentes = pentes;
		this.escovaDentes = escovaDentes;
		this.cremeDental= cremeDental;
	}
	//Metodos\\
	public int getPapelHigienico() {
		return papelHigienico;
	}
	public void setPapelHigienico(int papelHigienico) {
		this.papelHigienico = papelHigienico;
	}
	public int getSabonete() {
		return sabonete;
	}
	public void setSabonete(int sabonete) {
		this.sabonete = sabonete;
	}
	public int getShampoo() {
		return shampoo;
	}
	public void setShampoo(int shampoo) {
		this.shampoo = shampoo;
	}
	public int getCondicionador() {
		return condicionador;
	}
	public void setCondicionador(int condicionador) {
		this.condicionador = condicionador;
	}
	public int getAbsorventes() {
		return absorventes;
	}
	public void setAbsorventes(int absorventes) {
		this.absorventes = absorventes;
	}
	public int getPentes() {
		return pentes;
	}
	public void setPentes(int pentes) {
		this.pentes = pentes;
	}
	public int getEscovaDentes() {
		return escovaDentes;
	}
	public void setEscovaDentes(int escovaDentes) {
		this.escovaDentes = escovaDentes;
	}
	public int getCremeDental() {
		return cremeDental;
	}
	public void setCremeDental(int cremeDental) {
		this.cremeDental = cremeDental;
	}
	public void imprimirInfo() {
		System.out.println("*************Recebimento do Doador**************");
		System.out.println("Nome do Doador:"+getNome()+"\n"+"Endereco:"+getEndereco()+"\n"+"Idade do Doador:"+getIdade()+"\n"+"Papel Higienicos:"
		+papelHigienico+"\n"+"Sabonetes:"+sabonete+"\n"+"Shampoos:"+shampoo+"\n"+"Condicionadores:"+condicionador+"\n"+"Absorventes:"+absorventes+
		"\n"+"Pentes:"+pentes+"\n"+"Escovas de Dentes:"+escovaDentes+"\n"+"Cremes Dentais:"+cremeDental);
	}
	@Override
	public void intensDefeituosos() {
		System.out.println("Não aceitamos itens defeituosos e estragados, Presta Atenção!!!!");
	}
}
