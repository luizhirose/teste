package br.com.metasix;

import javax.swing.JOptionPane;

public class Teste1 {

	//Verificação para saber se o padrão do texto é camel case
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
		
		//Verifica se o padrao do texto é camel case
		if(verificarCamelCase(textoEntrada)) {
			for (int i = 1; i < textoEntrada.length(); i++) {		
				
				//Quando o digito é um espaço, não pode ser transferido para o texto de saída
				if(textoEntrada.charAt(i)!=' ') {		
					
					//Verifica se o dígito anterior foi espaço, para então deixar em letra maiúscula ou Não.
					if(textoEntrada.charAt(i-1)==' ')
						textoSaida = textoSaida+ Character.toString(textoEntrada.charAt(i)).toUpperCase();
					else
						textoSaida = textoSaida+ Character.toString(textoEntrada.charAt(i));
				}					
			}						
		}
		//Transforma textos no padrão camel case em texto comum
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
