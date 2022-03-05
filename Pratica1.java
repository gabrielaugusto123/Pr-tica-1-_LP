package br.com.pratica1.git;
import java.util.Scanner;
public class Pratica1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tempG , VeloM , ValKmL , KmPercorrido , ConsuFinal ;
		
		System.out.println("Qual o tempo gasto na viajem?");
		tempG = entrada.nextInt();
		
		System.out.println("Qual foi velocidade media?");
		VeloM = entrada.nextInt();
		
		System.out.println("Qual o valor km por litro do veiculo?");
		ValKmL = entrada.nextInt();
		
		KmPercorrido = tempG * VeloM;
		
		ConsuFinal = KmPercorrido / ValKmL;
		
		System.out.println("O consumo final de combustível em litros foi de : "+ ConsuFinal);
		
	}

}
