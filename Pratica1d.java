package br.com.pratica1.git;

import java.util.Scanner;

import java.util.Random;

public class Pratica1d {
	
	public static void main(String[] args) {
		
	Scanner entrada = new Scanner (System.in);
	Random gerador = new Random();
	
	int num ;
	
	double Cpf, DtaVoo , HoraVoo , numVoo ;
	
	 System.out.println("1 - Cadastrar Passageiro\r\n"
	 		+ "2 -Check in\r\n"
	 		+ "3 - Cancelar Voo\r\n"
	 		+ "4 - Sair");   
	 
	 System.out.println("Escolha um numero");
	 
	 num = entrada.nextInt();
	for (int i = 0; i < 1; i++) { 
	 switch (num) {
	 
	 case 1:
     System.out.println("insira por gentileza: CPF, Data do voo e a Hora do voo");
     
     Cpf = entrada.nextDouble();
     
     DtaVoo = entrada.nextDouble();
     
     HoraVoo = entrada.nextDouble();
     
    	 
         System.out.println("Cadastro Efetuado com Sucesso, o numero do seu voo é : "+ gerador.nextInt(999));
      
	 
	 break;
	 
	 case 2:
     System.out.println("insira por gentileza: CPF, Numero do voo");
     
	 Cpf = entrada.nextDouble();
	 
	 numVoo = entrada.nextDouble();
	 
	 System.out.println("Check in realizado com sucesso.");
	 
	 break;
	 
	 case 3:
		 System.out.println("insira por gentileza: CPF, Numero do voo");
		 
		 Cpf = entrada.nextDouble();
		 
		 numVoo = entrada.nextDouble();
		 
		 System.out.println("Voo Cancelado com sucesso.");
		 
	 break;
	 
	 case 4:
		 
	 System.out.println("Sair");
	 
	 break;
	 
	 default:
		 
	 System.out.println("Número inválido");
	  }
	 }
}
}
