package br.com.pratica1.git;
import java.util.Scanner;
public class Pratica1c {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
	      
		int vogal = 0;
		
        System.out.println("Digite uma frase: ");            
        String frase = entrada.nextLine();
        
        frase = frase.toLowerCase();
        for(int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(c == 32) continue;
            if(c == 97 | c == 101 | c == 105 | c == 111 | c == 117){
                vogal++;
                continue;
            }
        }
        System.out.println("Na frase \"" + frase + "\" temos: " + vogal + " vogais.");
}
}