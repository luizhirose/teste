package br.com.metasix;

import javax.swing.JOptionPane;

public class Teste1 {

	//Verifica��o para saber se o padr�o do texto � camel case
	public static Boolean verificarCamelCase(String texto) {
		
		for (int i = 1; i < texto.length(); i++) {			
			
			if(texto.charAt(i)==' ') {					
				return true;
			}					
		}			
		
		return false;
	}
	
	public static void main(String[] args) {
	
		//Recebe texto digitado
		String textoEntrada = JOptionPane.showInputDialog("Digite um texto");
		
		//Inicializa a variavel de saida
		String textoSaida=Character.toString(textoEntrada.charAt(0)).toLowerCase();				
		
		//Verifica se o padrao do texto � camel case
		if(verificarCamelCase(textoEntrada)) {
			for (int i = 1; i < textoEntrada.length(); i++) {		
				
				//Quando o digito � um espa�o, n�o pode ser transferido para o texto de sa�da
				if(textoEntrada.charAt(i)!=' ') {		
					
					//Verifica se o d�gito anterior foi espa�o, para ent�o deixar em letra mai�scula ou N�o.
					if(textoEntrada.charAt(i-1)==' ')
						textoSaida = textoSaida+ Character.toString(textoEntrada.charAt(i)).toUpperCase();
					else
						textoSaida = textoSaida+ Character.toString(textoEntrada.charAt(i));
				}					
			}						
		}
		//Transforma textos no padr�o camel case em texto comum
		else {
			textoSaida=Character.toString(textoEntrada.charAt(0)).toUpperCase();

			for (int i = 1; i < textoEntrada.length(); i++) {
				
				if(Character.isUpperCase(textoEntrada.charAt(i))) {				
					textoSaida = textoSaida+" "+Character.toString(textoEntrada.charAt(i)).toLowerCase();						
				}
				else
					textoSaida = textoSaida+ Character.toString(textoEntrada.charAt(i));					
			}			
		}
				
		JOptionPane.showMessageDialog(null, textoSaida);
	}

}
