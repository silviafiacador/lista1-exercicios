package lista_ex2;

public class exer2 {

	public static void main(String[] args) {
		/*2) Escreva um sistema estruturado que gere os 
		números de 1000 a 1999 e escreva somente os números 
		que são divisíveis por 11 OU cujo resto é 5.  */
		
		int num;
		for (num=1000; num<=1999;num++) 
		{
			//divisíveis por 11 OU cujo resto é 5
			if (num%11==0 || num%11==5) {
				System.out.println(num + " - ");
			}
		}

	}

}
