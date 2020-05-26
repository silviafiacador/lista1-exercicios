import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		// N1 (4,6) e N2(4,6)
		//     linha, coluna

		int i, j ;  //i controla a linha e j controla a coluna
		int n1[][], n2[][], m1[][], m2[][];
		
		n1 =new int[4][6];
		n2 =new int[4][6];
		m1 =new int[4][6];
		m2 =new int[4][6];
		
	    Scanner entrada = new Scanner(System.in);
		for (i=0; i<4;i++) {
			for(j=0; j<6;j++) {
				System.out.print("Posição: "+i+","+j+"=");
				n1[i][j]=entrada.nextInt();
			}	
		}
		for (i=0; i<4;i++) {
			for(j=0; j<6;j++) {
				System.out.print("Posição: "+i+","+j+"=");
				n2[i][j]=entrada.nextInt();
				m1[i][j]=n1[i][j]+n2[i][j]; 
				m2[i][j]=n1[i][j]-n2[i][j]; 
			}	
		}
		//imprimindo as matrizes		
		for (i=0; i<4;i++) {
			for(j=0; j<6;j++) {
				System.out.print("n1["+i+","+j+"]=" +n1[i][j]+"   "+
			"n2["+i+","+j+"]=" +n2[i][j]+"   "+
			"m1["+i+","+j+"]=" +m1[i][j]+"   "+
			"m2["+i+","+j+"]=" +m2[i][j]);
			System.out.println();
		}
			System.out.println();
	}
	}
}
