package ListaMatrizes;

import java.lang.ProcessHandle.Info;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Loteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		final int TAM = 6;
		int cartela = 0;
		int acerto = 0;
		
		System.out.println("Quantas cartelas você deseja preencher? ");
		cartela = entrada.nextInt();
		
		int [][] mat = new int [cartela][TAM];
		int [] cartelaSorteada = {5 , 12 , 26 , 34 ,49,51 ,58};
		ArrayList<Integer> ordenar = new ArrayList();
		
		for (int x=0; x<cartela;x++) {
			for (int i=0; i<TAM;i++) {
				mat [x][i] = (int) (1+(Math.random()*59));
			}
		}
	
		
		for (int x=0; x<cartela;x++) {
			ordenar.clear();
			System.out.println("");
			for (int i=0; i<TAM;i++) {
				for (int j=0;j<cartelaSorteada.length;j++) {
					if (mat [x][i]==cartelaSorteada[j]) {
						acerto+=1;
					}
				}
					
				
			ordenar.add(mat [x][i]);
				
			}
			Collections.sort(ordenar);
			System.out.println(ordenar);
			System.out.println(acerto + " Acertos");
		}

	}

}
