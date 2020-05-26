import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class exer8 {

	public static void main(String[] args) {
		/* - A prefeitura de uma cidade fez uma pesquisa entre 20 de seus
habitantes, coletando dados sobre o salário e número de filhos. A
prefeitura deseja saber:
a) média do salário da população;
b) média do número de filhos;
c) maior salário;
d) percentual de pessoas com salário até R$100,00.  */
		
		//variáveis de memória
		float somaFilho=0, contaPessoas=0,filho;
		float somaSalario=0,porcentagemSalario;
		
		float mediaSalario, mediaFilho, salario;
		float maiorSalario=0,pessoasSalario100=0;

		Locale local = new Locale("pt","BR");
		NumberFormat formato= NumberFormat.getCurrencyInstance(local);
		Scanner entrada = new Scanner(System.in);
		while (contaPessoas<20) 
		{
			System.out.print("Informe o seu salário: ");
			salario=entrada.nextFloat();
			System.out.print("Informe o nº de filhos: ");
			filho=entrada.nextInt();
			
			contaPessoas++;
			somaFilho=somaFilho + filho;
			somaSalario= somaSalario + salario;
			
			if (salario>maiorSalario) 
				maiorSalario = salario;
			
			if (salario<=100)
				pessoasSalario100++;
				
			
		}
		entrada.close();
		mediaSalario = somaSalario/contaPessoas;
		mediaFilho= somaFilho/contaPessoas;
		porcentagemSalario = pessoasSalario100/contaPessoas*100;
		//imprimindo resultados
		System.out.println ("R e s u l t a d o s");
		System.out.println();
		System.out.println("Média de salário: "+formato.format(mediaSalario));
		System.out.println("Média de filhos: "+ mediaFilho);
		System.out.println("Maior salário: "+formato.format(maiorSalario));
		System.out.println("% pessoas com salário < 100: "
		+porcentagemSalario+"%");
		System.out.println("Total pessoas"+contaPessoas);
		System.out.println("Total filhos"+somaFilho);
		
		
	}

}
