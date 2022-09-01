package ListaMatrizes;

import java.util.Scanner;

public class OlimpiadasIFC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		int atleta = 0;
		
		System.out.println("Digite o numero de atletas: ");
		atleta = entrada.nextInt();
		
		final int SALT = 5;
		float [][] mat = new float[atleta][SALT];
		float [] atletaMed = new float [atleta];
		float soma = 0;
		float media = 0;
		
		for (int x=0; x<atleta;x++) {
			for (int i=0; i<SALT;i++) {
				System.out.println("Digite a medida do salto "+(i+1)+" do atleta "+x+": ");
				mat [x][i] = entrada.nextFloat();
				soma =soma+mat [x][i];
			}
			media = soma/SALT;
			atletaMed [x] = media;
			media = 0;
		}
		
		System.out.println("A média de cada atleta foi: ");
		for (int x=0;x<atleta;x++) {
			System.out.println(atletaMed[x] + "m para o atleta " + (x+1));
		}
	}

}
