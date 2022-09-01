package ListaMatrizes;

import java.util.Scanner;

public class NALunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int nAluno = 0;
		final int COL = 2;
		float somaNotas = 0;
		float media = 0;
		
		System.out.println("Digite a quantidade de alunos: ");
		nAluno = entrada.nextInt();
		
		float [][] mat = new float [nAluno][2];
		String [] aluno = new String [nAluno];
		
		for (int x=0;x<nAluno;x++) {
			for (int i=0;i<=COL;i++) {
				if (i==0) {
					System.out.println("Digite o nome do aluno: ");
					aluno [x] = (String) entrada.next();
				}
				else {
					System.out.println("Digite a nota " + i +" do aluno " + aluno[x] + ": ");
					mat [x][i-1] = entrada.nextInt();
					somaNotas+=mat [x][i-1];
				}
			}
		}
		
		media = somaNotas/(nAluno*COL);
			
			for (int x=0;x<nAluno;x++) {
				System.out.println("");
				for (int i=0;i<=COL;i++) {
					if (i==0) {
						System.out.print(aluno[x] + "|");
					}
					else {
						System.out.print(mat [x][i-1] +"|");
					}
				}
			}
			System.out.println("");
			System.out.println("A media entre os alunos é: " + media);
			System.out.println("A media de cada aluno é ");
			
			for (int x=0;x<nAluno;x++) {
				System.out.println("");
				for (int i=0;i<COL;i++) {
					if (i==0) {
						System.out.print(aluno[x] + "|");
						
					}
					else {
						System.out.print((mat [x][i]+mat [x][i-1])/COL);
					}
				}
			}
			
			System.out.println("");
			System.out.println("Os alunos que estão acima da média da turma são ");
			
			for (int x=0;x<nAluno;x++) {
				System.out.println("");
				for (int i=0;i<COL;i++) {
					if (i==1) {
						if (((mat [x][i]+mat [x][i-1])/COL)>=media){
							System.out.print(aluno[x] + "|");
						
					}
				}
			}
			}
			
			System.out.println("");
			System.out.println("Os alunos que estão ABAIXO da média da turma são ");
			
			for (int x=0;x<nAluno;x++) {
				System.out.println("");
				for (int i=0;i<COL;i++) {
					if (i==1) {
						if (((mat [x][i]+mat [x][i-1])/COL)<media){
							System.out.print(aluno[x] + "|");
						}
					}
				}
			}
	}

}
