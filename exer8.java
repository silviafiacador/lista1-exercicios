import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class exer8 {

	public static void main(String[] args) {
		/* - A prefeitura de uma cidade fez uma pesquisa entre 20 de seus
habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A
prefeitura deseja saber:
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00.  */
		
		//vari�veis de mem�ria
		float somaFilho=0, contaPessoas=0,filho;
		float somaSalario=0,porcentagemSalario;
		
		float mediaSalario, mediaFilho, salario;
		float maiorSalario=0,pessoasSalario100=0;

		Locale local = new Locale("pt","BR");
		NumberFormat formato= NumberFormat.getCurrencyInstance(local);
		Scanner entrada = new Scanner(System.in);
		while (contaPessoas<20) 
		{
			System.out.print("Informe o seu sal�rio: ");
			salario=entrada.nextFloat();
			System.out.print("Informe o n� de filhos: ");
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
		System.out.println("M�dia de sal�rio: "+formato.format(mediaSalario));
		System.out.println("M�dia de filhos: "+ mediaFilho);
		System.out.println("Maior sal�rio: "+formato.format(maiorSalario));
		System.out.println("% pessoas com sal�rio < 100: "
		+porcentagemSalario+"%");
		System.out.println("Total pessoas"+contaPessoas);
		System.out.println("Total filhos"+somaFilho);
		
		
	}

}
