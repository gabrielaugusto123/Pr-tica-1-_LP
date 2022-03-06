package br.com.pratica1.git;
import java.util.Scanner;
public class Pratica1b {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int  anoFab ;
		 System.out.println("Placa do carro: ");
		 String placa = entrada.nextLine();
		 
		 System.out.println("Ano de fabricação do carro: ");
		 anoFab = entrada.nextInt();
		 
		 if (anoFab<2010) 
			 System.out.println("Carro Velho, placa: "+placa);
		 
		 else if (anoFab>=2011 && anoFab>=2021) 
			 System.out.println("Carro Semi novo, placa:"+placa);
		 
		 else if (anoFab==2022) 
			 System.out.println("Carro novo, placa: "+ placa );
		 
}
}