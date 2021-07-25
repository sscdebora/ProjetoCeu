package ProjetoCeu;

public class TesteComidas {

	public static void main(String[] args) {
		
        Comidas [] lista = new Comidas[5];
		
		System.out.println("********************Doações******************************");
		
		lista[0] = new Comidas("Jaqueline","Rua Zeca, 95",24,4,2,2,1,3,3,2);
		//Dados recebidos do Doador = Idade,Agasalho,Camita,Calça,Tenis,Cueca,Calcinha,Meia
		lista[1] = new Comidas("Fernanda","Rua das Flores,22",28,3,4,5,6,8,9,4);
		lista[2] = new Comidas("Janaina","Rua da Maria, 100",21,7,8,23,4,1,5,9);
		lista[3] = new Comidas("Debora","Avenidade Duque de Caxias, 2",22,5,6,22,3,44,4,5);
		lista[4] = new Comidas("Guilherme","Rua das Arvores, 91",22,1,2,3,4,5,6,6);
		
		for(Comidas roda:lista) {
			
	        roda.imprimirInfo();//Aqui será exibido as informações do Doador
	        roda.intensDefeituosos();//Nesta parte, ele irá imprimir uma mensagem ao Doador
	  }
		
   }
}
		
		/*int tipoDoacao;
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> armazem = new ArrayList();
		
		do {
			System.out.println("********************Tipo de Doações******************************");
			System.out.println("\n(1) Roupas,Comidas,Higiene: "+"\n"+"(2) Doações Recebidas: "+"\n"+"(0) Encerrar o programa ");
			System.out.println("\n---------------------------------");
			System.out.println("\n\tDigite sua opção: ");
			System.out.println("\n---------------------------------");
			tipoDoacao = leia.nextInt();
			
			switch(tipoDoacao) {
			case 1:
				leia.nextLine();
				System.out.println("\nInsira sua Doação: ");
				String produto = leia.nextLine();
				armazem.add(produto);
				break;
			case 2:
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(armazem);
				break;
				default:
					System.out.println("\nFinalizou o programa, volte sempre!!!");
			}
		}
		while(tipoDoacao != 0);*/
	


		
