import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		/* Elaborar um programa que efetue a leitura sucessiva de valores
		num�ricos e apresente no final o total do somat�rio, a m�dia e o
		total de valores lidos. O programa deve fazer as leituras dos 
		valores enquanto o usu�rio estiver fornecendo valores positivos.
		Ou seja, o programa deve parar quando o usu�rio
		fornecer um valor negativo. Flag*/
		
		int numero=0, totalLidos=0, soma=0;
		float media=0;
		
		Scanner entrada = new Scanner(System.in);
		
			
		System.out.print("Digite um n�mero qualquer ou "
				+ "um n�mero negativo para encerrar!");
		while (numero>=0) {   //n�mero � positivo
			numero=entrada.nextInt();
			//se o n�mero for negativo ele n�o deve ser somado
			if (numero>=0) {
				totalLidos++;
				soma=soma+numero;}
			
			System.out.print("Digite um n�mero qualquer ou "
					+ "um n�mero negativo para encerrar!");
		}
		//calculando a m�dia e exibindo os resultados
		System.out.println();
		System.out.println("Resultados");
		System.out.println();
		System.out.println("Total de n�meros digitados= "+totalLidos);
		System.out.println("Soma de todos os n�meros= "+soma);
		if (totalLidos>0) {
			media = soma/totalLidos;
			System.out.println("M�dia= "+media); }
	
}

}
