package lista_ex1;

public class exer1 {

	public static void main(String[] args) {
		
		int i=0, soma=0, resto=0;
		
		for(i=1; i<=50; i++) {
			//verificar se � m�ltiplo de 3
			resto=i%3;
			if (resto==0) {   //� m�ltiplo de 3
				//verificando se � �mpar
				resto=i%2;     // % resto
				if (resto!=0) {
					//� �mpar
					soma=soma+i;
				}
			}
	}
		
		System.out.println("Soma = "+soma);
	}
	}
