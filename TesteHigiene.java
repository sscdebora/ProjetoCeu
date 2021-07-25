package ProjetoCeu;

public class TesteHigiene {

	public static void main(String[] args) {

		   Higiene [] lista = new Higiene[5];
			
			System.out.println("*****************Doações******************************");
			
			lista[0] = new Higiene("Jaqueline","Rua Zeca, 95",24,4,2,2,1,3,3,2,4);
			//Dados recebidos do Doador = Idade,Agasalho,Camita,Calça,Tenis,Cueca,Calcinha,Meia
			lista[1] = new Higiene("Fernanda","Rua das Flores,22",28,7,10,10,3,5,5,3,4);
			lista[2] = new Higiene("Janaina","Rua da Maria, 100",21,12,8,7,6,9,12,15,4);
			lista[3] = new Higiene("Debora","Avenidade Duque de Caxias, 2",22,2,3,7,6,5,10,15,4);
			lista[4] = new Higiene("Guilherme","Rua das Arvores, 91",22,21,7,28,9,18,6,3,4);
			
			for(Higiene roda:lista) {
				
		        roda.imprimirInfo();//Aqui será exibido as informações do Doador
		        roda.intensDefeituosos();//Nesta parte, ele irá imprimir uma mensagem ao Doador
		}
	}
}
