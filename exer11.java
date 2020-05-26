import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		/*11- Escrever um sistema que lê uma matriz M(5,5) e cria 2 vetores
SL(5) e SC(5) que contenham, respectivamente, as somas das
linhas e das colunas de M. Escrever a matriz e os vetores criados.
*/
	int m[][];
	int sl[];
	int sc[];
	int i, j;
	
	//dando os tamanhos aos vetores e matriz M
	m = new int[5][5];
	sl = new int[5];
	sc = new int[5];
	
	Scanner in =new Scanner(System.in);
	
	for (i=0;i<5;i++) {
		for (j=0;j<5;j++) {
			m[i][j]= in.nextInt();
			sl[i] =sl[i]+m[i][j];
			sc[j]=sc[j]+m[i][j];
		}
	}
	System.out.println("Imprimindo soma linhas");
	System.out.println();
	for (i=0;i<5;i++) {
		System.out.println("Soma linha "+i +" = "+sl[i]);
	}
	System.out.println("Imprimindo soma colunas");
	System.out.println();
	for (i=0;i<5;i++) {
		System.out.println("Soma coluna "+i +" = "+sc[i]);
	}
	
	

	}

}
