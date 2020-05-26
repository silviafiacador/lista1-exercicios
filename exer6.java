import java.util.Scanner;

public class exer6 {

	public static void main(String[] args) {
/*6- Uma empresa desenvolveu uma
pesquisa para saber as caracter�sticas psicol�gicas dos indiv�duos de uma
regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, sexo
(1-feminino / 2-masculino), e as op��es (1, se a pessoa era calma; 2, se a
pessoa era nervosa e 3, se a pessoa era agressiva). Pede- se para elaborar
um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
� o n�mero de pessoas calmas;
� o n�mero de mulheres nervosas;
� o n�mero de homens agressivos;
� o n�mero de pessoas nervosas com mais de 40
anos;
� o n�mero de pessoas calmas com menos de 18
anos.*/

		//criar reposit�rio github
		//clonar
		//acionar perspectiva git
		int idade, sexo, tipo, numPessoas=0;
		int totalCalma=0, totalMulherNervosa=0, totalHomemAgressivo=0;
		int totalPessoaNervosaMaior40=0, totalPessoaCalmaMenor18=0;
		
		//instanciando a classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		while (numPessoas<10) 
		{
			//recebendo informa��es do usu�rio
			System.out.print("Sua idade: ");
			idade = entrada.nextInt();
			System.out.print("Sexo 1-fem 2-masc: ");
			sexo = entrada.nextInt();
			System.out.print("Voc� � 1-calmo, 2-nervoso, 3-agressivo: ");
			tipo= entrada.nextInt();
			
			//processando as informa��es
			numPessoas++;
			if (tipo==1) {
				totalCalma++;}
			
			if (tipo==2 && sexo==1)
				totalMulherNervosa++;
			
			if (tipo==3 && sexo==2)
				totalHomemAgressivo++;
			
			if (tipo==2 && idade>40)
				totalPessoaNervosaMaior40++;
			
			if (tipo==1 && idade<18)
				totalPessoaCalmaMenor18++;
					
		}
		// imprimindo os totais
		System.out.println("");
		System.out.print("Total pessoas calmas: ");
		System.out.println(totalCalma);
		System.out.print("Total mulheres nervosas: ");
		System.out.println(totalMulherNervosa);
		System.out.print("Total homens agressivos: ");
		System.out.println(totalHomemAgressivo);
		System.out.print("Total pessoas nervosas com mais de 40 anos: ");
		System.out.println(totalPessoaNervosaMaior40);
		System.out.print("Total pessoas calmas com menos de 18 anos: ");
		System.out.println(totalPessoaCalmaMenor18);
}

}
