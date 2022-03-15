package br.com.pratica1.git;
import java.util.Scanner;
public class Pratica1c {
	public static void main(String[] args) {

		
		
				Scanner entrada = new Scanner (System.in);
			      
			    int cnt=0;
				String vogais= "";
				
		        System.out.println("Digite uma frase: ");            
		        String frase = entrada.nextLine();
		        
		        frase = frase.toLowerCase();
		        for(int i = 0; i < frase.length(); i++){
		            char c = frase.charAt(i);
		            
		            if(c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u'){
		               
		               vogais= vogais+Character.toString(c);
		               
		            }
		        }
		        if(vogais.contains("a"))
		        	cnt++;
		        if(vogais.contains("e"))
		        	cnt++;
		        if(vogais.contains("i"))
		        	cnt++;
		        if(vogais.contains("o"))
		        	cnt++;
		        if(vogais.contains("u"))
	        	cnt++;
		        System.out.println("Na frase \"" + frase + "\" temos: " + cnt  + " vogais.");
		}
		}
