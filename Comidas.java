package ProjetoCeu;

public class Comidas extends Doacoes{
	
	 //Atributos\\
	private int arroz;
	private int feijao;
	private int oleo;
	private int farinha;
	private int leite;
	private int sal;
	private int acucar;
	
	//Construtor\\
	public Comidas(String nome,String endereco, int idade,int arroz, int feijao, int oleo, int farinha, int leite, int sal, int acucar) {
		
		super(nome,endereco,idade);//Atribuindo parametros
		this.arroz = arroz;
		this.feijao = feijao;
		this.oleo = oleo;
		this.farinha = farinha;
		this.leite = leite;
		this.sal = sal;
		this.acucar = acucar;
	}
	//Metodos\\
	public int getArroz() {
		return arroz;
	}
	public void setArroz(int arroz) {
		this.arroz = arroz;
	}
	public int getFeijao() {
		return feijao;
	}
	public void setFeijao(int feijao) {
		this.feijao = feijao;
	}
	public int getOleo() {
		return oleo;
	}
	public void setOleo(int oleo) {
		this.oleo = oleo;
	}
	public int getFarinha() {
		return farinha;
	}
	public void setFarinha(int farinha) {
		this.farinha = farinha;
	}
	public int getLeite() {
		return leite;
	}
	public void setLeite(int leite) {
		this.leite = leite;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getAcucar() {
		return acucar;
	}
	public void setAcucar(int acucar) {
		this.acucar = acucar;
	}
	public void imprimirInfo() {
		System.out.println("*******************Recebimento de Doações****************");
		System.out.println("Nome do Doador:"+getNome()+"\n"+"Endereco:"+getEndereco()+"\n"+"Idade do Doador:"+getIdade()+"\n"+
		  "Arroz: "+arroz+"\n"+"Feijões: "+feijao+"\n"+"Oleos:"+oleo+"\n"+"Farinhas: "+farinha+"\n"+"Leites: "+leite+"\n"+"Sal: "+sal+
		  "\n"+"Açucares: "+acucar);
	}
	@Override
	public void intensDefeituosos() {
		System.out.println("Não aceitamos itens defeituosos e estragados, Presta Atenção!!!!");
	}
}
