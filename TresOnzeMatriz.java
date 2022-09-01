package ListaMatrizes;

import java.util.Scanner;

public class TresOnzeMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int lado = 0;
		System.out.println("Você deseja uma matriz de quantos lados? ");
		lado = entrada.nextInt();
		
		final int LIN = lado;
		final int COL = lado;
		int [] [] mat = new int [LIN][COL];
		int soma = 0;
		float media = 0;
		int maior = 0;
		int menor = 0;
		int somaPar = 0;
		int somaImpar = 0;
		int somaPrincipal = 0;
		int somaSecundaria = 0;
		
		for (int x=0;x<LIN;x++) {
			for (int i=0;i<COL;i++) {
				while (mat[x][i]>11 || mat[x][i]<3) {
					System.out.println("Por favor, digite o valor entre 3 e 11 para a linha "+(x+1)+" e coluna "+(i+1));
					mat [x][i] = entrada.nextInt();
					
				}
				soma+=mat[x][i];
				if ((x+i)==(lado-1)) {
					somaSecundaria+=mat[x][i];
				}
				if (x==i) {
					somaPrincipal+=mat[x][i];
				}
				if (mat[x][i]%2==0) {
					somaPar+=mat[x][i];
				}
				else {
					somaImpar+=mat[x][i];
				}
				if (x==0 && i==0) {
					maior = mat[x][i];
					menor = mat[x][i];			
				}
				else {
					if (mat[x][i]>maior){
						maior=mat[x][i];
					}
					if (mat[x][i]<menor) {
						menor = mat[x][i];
					}
				}
			}
			
		}
		
		media = (float)soma/(LIN*COL);
		
		for (int x=0;x<LIN;x++) {
			for (int i=0;i<COL;i++) {
				System.out.print(mat[x][i]+ "|");
			}
			System.out.println("");
		}
		
		System.out.println("A soma dos elementos vale: "+soma);
		System.out.println("A media dos elementos vale: "+media);
		System.out.println("O menor valor entre os elementos vale: "+menor);
		System.out.println("A maior valor entre os elementos vale: "+maior);
		System.out.println("A soma dos elementos pares vale: "+somaPar);
		System.out.println("A soma dos elementos ímpares vale: "+somaImpar);
		System.out.println("A soma dos elementos da diagonal principal vale: "+somaPrincipal);
		System.out.println("A soma dos elementos da diagonal secundária vale: "+somaSecundaria);

	}

}
