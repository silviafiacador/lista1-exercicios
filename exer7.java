import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		/*- Escrever um sistema que l� um valor N inteiro e positivo e que
		calcula e escreve o valor de E. 
		E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!   */
        // 3! = 3 * 2 * 1 =6
		
		//instanciando a classe Scanner
		int num,contador=1, i, fatorial=1;
		String resultado="1  "; //esta string � s� para mostrar a
		//express�o desta forma:  E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N! "
		float e=1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o n�mero: ");
		num=in.nextInt();
	
		while (contador<=num)
		{
			//criando a express�o
			//E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N! 
			resultado = resultado + "+ 1/"+contador+"!  ";
			
			
			//efetuando o c�lculo
			fatorial=1;
			for (i=contador;i>1;i--) {
				//5! = 5*4*3*2
				fatorial = fatorial * i;	
		    	
			}
			//Depos de calcular o fatorial devemos dividir 1 pelo valor
			//do fatorial - cuidado pois tive que fazer uma convers�o 
			//expl�cita (float) para for�ar que o "e" se torne float
			e = e + (float) 1/fatorial;
		
			contador++;
		}
		System.out.println("Express�o: "+resultado);
		System.out.println("Valor de E:"+e);
	
	}

}
