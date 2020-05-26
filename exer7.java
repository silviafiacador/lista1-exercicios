import java.util.Scanner;

public class exer7 {

	public static void main(String[] args) {
		/*- Escrever um sistema que lê um valor N inteiro e positivo e que
		calcula e escreve o valor de E. 
		E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N!   */
        // 3! = 3 * 2 * 1 =6
		
		//instanciando a classe Scanner
		int num,contador=1, i, fatorial=1;
		String resultado="1  "; //esta string é só para mostrar a
		//expressão desta forma:  E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N! "
		float e=1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Informe o número: ");
		num=in.nextInt();
	
		while (contador<=num)
		{
			//criando a expressão
			//E = 1 + 1 / 1! + 1 / 2! + 1 / 3! + 1 / N! 
			resultado = resultado + "+ 1/"+contador+"!  ";
			
			
			//efetuando o cálculo
			fatorial=1;
			for (i=contador;i>1;i--) {
				//5! = 5*4*3*2
				fatorial = fatorial * i;	
		    	
			}
			//Depos de calcular o fatorial devemos dividir 1 pelo valor
			//do fatorial - cuidado pois tive que fazer uma conversão 
			//explícita (float) para forçar que o "e" se torne float
			e = e + (float) 1/fatorial;
		
			contador++;
		}
		System.out.println("Expressão: "+resultado);
		System.out.println("Valor de E:"+e);
	
	}

}
