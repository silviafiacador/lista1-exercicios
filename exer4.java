import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {
	/* Ler o nome de um aluno e as suas duas notas A e B, 
	* e ap�s calcular a m�dia ponderada entre estas notas (A tem peso 1
	*  e B tem peso 2). Verifique se a nota digitada � valida, 
	*  caso seja inv�lida, repita a leitura. Repetir este procedimento
    para uma turma composta por cinco alunos, usando o comando While. */
		
		String nome;
		float notaA=0, notaB=0, media=0;
		int numAlunos=0;
		
		Scanner entradaTexto = new Scanner (System.in);
		Scanner entradaNumero = new Scanner (System.in);
		
		while (numAlunos<5) {
			System.out.print("Nome: ");
			nome = entradaTexto.nextLine();
					
			System.out.print("Nota A: ");
			notaA = entradaNumero.nextFloat();
			System.out.print("Nota B: ");
			notaB = entradaNumero.nextFloat();
			numAlunos++;
			
			//validando se as notas est�o entre 0 e 10
			while (notaA<0 || notaA>10) {
				System.out.println("Nota inv�lida");
				System.out.print("Nota A: ");
				notaA = entradaNumero.nextFloat();	}
			
			while (notaB<0 || notaB>10)  {
				System.out.println("Nota inv�lida");
				System.out.print("Nota B: ");
				notaB = entradaNumero.nextFloat();  }
			
			
			//m�dia ponderada - dividir pela soma dos pesos = 1+2
			media = (notaA+notaB*2)/3;
			System.out.println("O aluno "+nome+" tem uma m�dia= "+media);
			System.out.println();   //pula 1 linha
			
		}

	}

}
