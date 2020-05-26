import java.util.Scanner;

public class exer5 {

	public static void main(String[] args) {
		/* Elaborar um programa que efetue a leitura sucessiva de valores
		numéricos e apresente no final o total do somatório, a média e o
		total de valores lidos. O programa deve fazer as leituras dos 
		valores enquanto o usuário estiver fornecendo valores positivos.
		Ou seja, o programa deve parar quando o usuário
		fornecer um valor negativo. Flag*/
		
		int numero=0, totalLidos=0, soma=0;
		float media=0;
		
		Scanner entrada = new Scanner(System.in);
		
			
		System.out.print("Digite um número qualquer ou "
				+ "um número negativo para encerrar!");
		while (numero>=0) {   //número é positivo
			numero=entrada.nextInt();
			//se o número for negativo ele não deve ser somado
			if (numero>=0) {
				totalLidos++;
				soma=soma+numero;}
			
			System.out.print("Digite um número qualquer ou "
					+ "um número negativo para encerrar!");
		}
		//calculando a média e exibindo os resultados
		System.out.println();
		System.out.println("Resultados");
		System.out.println();
		System.out.println("Total de números digitados= "+totalLidos);
		System.out.println("Soma de todos os números= "+soma);
		if (totalLidos>0) {
			media = soma/totalLidos;
			System.out.println("Média= "+media); }
	
}

}
