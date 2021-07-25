package ProjetoCeu;

public class TesteRoupas{

	public static void main(String[] args) {
		
		Roupas [] lista = new Roupas[5];
		
		System.out.println("********************Doações*******************");
		
		lista[0] = new Roupas("Jaqueline","Rua Zeca, 95",24,4,2,2,1,3,3,2);
		//Dados recebidos do Doador = Idade,Agasalho,Camita,Calça,Tenis,Cueca,Calcinha,Meia
		lista[1] = new Roupas("Fernanda","Rua das Flores,22",28,7,10,10,3,5,5,3);
		lista[2] = new Roupas("Janaina","Rua da Maria, 100",21,12,8,7,6,9,12,15);
		lista[3] = new Roupas("Debora","Avenidade Duque de Caxias, 2",22,2,3,7,6,5,10,15);
		lista[4] = new Roupas("Guilherme","Rua das Arvores, 91",22,21,7,28,9,18,6,3);
		
		for(Roupas roda:lista) {
			
	        roda.imprimirInfo();//Aqui será exibido as informações do Doador
	        roda.intensDefeituosos();//Nesta parte, ele irá imprimir uma mensagem ao Doador
		}
	
	}

}
