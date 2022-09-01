package ListaMatrizes;

import java.util.Scanner;

public class PrecosProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		
		final int mercado = 5;
		final int produto = 5;
		float [][] preco = new float [mercado][produto];
		
		float somaProdutoUm = 0;
		float somaProdutoDois = 0;
		float somaProdutoTres = 0;
		float somaProdutoQuatro = 0;
		float somaProdutoCinco = 0;
		float mediaProdutoUm = 0;
		float mediaProdutoDois = 0;
		float mediaProdutoTres = 0;
		float mediaProdutoQuatro = 0;
		float mediaProdutoCinco = 0;
		
		float somaMercadoUm = 0;
		float somaMercadoDois = 0;
		float somaMercadoTres = 0;
		float somaMercadoQuatro = 0;
		float somaMercadoCinco = 0;
		
		for (int x=0;x<mercado;x++) {
			for (int i=0;i<produto; i++ ) {
				System.out.println("Digite o preço do supermercado " + (x+1) + " e do produto " + (i+1));
				preco[x][i] = entrada.nextFloat();
				switch(x) {
				case 0:
					somaMercadoUm+=preco[x][i];
					break;
				case 1:
					somaMercadoDois+=preco[x][i];
					break;
				case 2:
					somaMercadoTres+=preco[x][i];
					break;
				case 3:
					somaMercadoQuatro+=preco[x][i];
					break;
				case 4:
					somaMercadoCinco+=preco[x][i];
					break;
				}
				switch (i) {
				case 0:
					somaProdutoUm+=preco[x][i];
					break;
				case 1:
					somaProdutoDois+=preco[x][i];
					break;
				case 2:
					somaProdutoTres+=preco[x][i];
					break;
				case 3:
					somaProdutoQuatro+=preco[x][i];
					break;
				case 4:
					somaProdutoCinco+=preco[x][i];
					break;
				}
			}
		}
		
	
		
		for (int x=0;x<mercado;x++) {
			for (int i=0;i<produto; i++ ) {
				System.out.println(preco[x][i]);
				
			}
		}
		
		mediaProdutoUm = somaProdutoUm/mercado;
		mediaProdutoDois = somaProdutoDois/mercado;
		mediaProdutoTres = somaProdutoTres/mercado;
		mediaProdutoQuatro = somaProdutoQuatro/mercado;
		mediaProdutoCinco = somaProdutoCinco/mercado;
		
		System.out.println("A media de preço do produto um é " + mediaProdutoUm);
		System.out.println("A media de preço do produto dois é " + mediaProdutoDois);
		System.out.println("A media de preço do produto tres é " + mediaProdutoTres);
		System.out.println("A media de preço do produto quatro é " + mediaProdutoQuatro);
		System.out.println("A media de preço do produto cinco é " + mediaProdutoCinco);
		
		System.out.println("A soma de preço do mercado um é " + somaMercadoUm);
		System.out.println("A soma de preço do mercado dois é " + somaMercadoDois);
		System.out.println("A soma de preço do mercado tres é " + somaMercadoTres);
		System.out.println("A soma de preço do mercado quatro é " + somaMercadoQuatro);
		System.out.println("A soma de preço do mercado cinco é " + somaMercadoCinco);
		
		

	}

}
