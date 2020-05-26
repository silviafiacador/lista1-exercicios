import java.util.Arrays;
import java.util.Random;


public class exer9 {
	public static void main(String[] args) {
	/* Um Departamento deseja saber quais alunos estariam cursando duas
disciplinas - X e Y. Fazer um programa que leia os números de matrícula 
(valor entre 0 e 999) dos alunos que cursam cada uma das disciplinas
(os números serão fornecidos desordenados) e emita um relatório com os 
números de matrícula dos alunos que cursam as duas disciplinas 
simultaneamente ou, se tal não ocorrer, a mensagem: Nenhum aluno cursa 
simultaneamente as disciplinas X e Y. O número de alunos por turma, 
tanto na turma X quanto na turma Y, é 60.*/
		int x[];
		int y[];
		x = new int[60];
		y = new int[60];
		
		 //instância um objeto da classe Random
        Random gerador = new Random();
         
        //atribui sequência de 60 números inteiros aleatórios entre 0 e 999
        //ao array x
        for (int i = 0; i < 60; i++) {
           x[i]=gerador.nextInt(1000);
         }
        
      //atribui sequência de 60 números inteiros aleatórios entre 0 e 999
        //ao array y
        for (int i = 0; i < 60; i++) {
           y[i]=gerador.nextInt(1000);
         }
        
        
        for (int i = 0; i < 60; i++) {
            System.out.println(x[i]);
          }
        //organiza o array
        Arrays.sort(x);
        Arrays.sort(y);
        
        System.out.println("Vetor x organizado");
        for (int i = 0; i < 60; i++) {
            System.out.println(x[i]);
          }
        System.out.println("Vetor y organizado");
        for (int i = 0; i < 60; i++) {
            System.out.println(y[i]);
          }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 60; i++) {
            for (int j=0; j<60; j++) {
            	if(x[i]==y[j]) {
            		System.out.println("Valores iguais: x="+x[i]+" y="+y[j]);
            	}
            }
          }
        
      
    }
		
		
		
	}

