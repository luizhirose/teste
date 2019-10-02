package br.com.metasix;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;




public class Teste2 {
	
	public static Boolean interrompeLoop = false;
	
	public static void cadastra(Caracteristica car, String nomeAnimal) {
		String novoAnimal;
		String novaCaracteristica;	
		
		novoAnimal=JOptionPane.showInputDialog("Qual animal você pensou?");
		
		novaCaracteristica=JOptionPane.showInputDialog("Um (a) "+novoAnimal+"_____mas um(a) "+nomeAnimal+" não.");
		
		car.getAnimais().add( new Animal(novoAnimal, new ArrayList<Caracteristica>(List.of(new Caracteristica(novaCaracteristica)))));									
	}
	
	public static void pergunta(Animal animal) {
	
		int animalPensou = 0;
		
		if(interrompeLoop) return;
		
		for (Caracteristica caracteristica : animal.getCaracteristicas()) {
			
			if(interrompeLoop) return;
			
			if(!animal.getNome().equalsIgnoreCase("macaco")){
				animalPensou = JOptionPane.showConfirmDialog(null, "O animal que você pensou "+caracteristica.getNome()+" ?", null, JOptionPane.YES_NO_OPTION);
			}
			
			if(animalPensou == 0) {
												
				for (Animal an : caracteristica.getAnimais()) {									
					
					pergunta(an);
						
				}
				
				if(interrompeLoop) return;
				
				if(JOptionPane.showConfirmDialog(null, "O animal que você pensou é "+animal.getNome()+" ?", null, JOptionPane.YES_NO_OPTION)==0) {
				
					JOptionPane.showConfirmDialog(null, "Eu venci!", null, JOptionPane.OK_CANCEL_OPTION);								

				}
				else {
					cadastra(caracteristica, animal.getNome());					
				}
				
				interrompeLoop = true;
			}				
		}								
	}						

	public static void main(String[] args) {
	
		Animal animalTubarao = new Animal("Tubarão", new ArrayList<Caracteristica>(List.of(new Caracteristica("vive na água"))));					
		Animal animalMacaco = new Animal("Macaco", new ArrayList<Caracteristica>(List.of(new Caracteristica(""))));							
		
		while (JOptionPane.showConfirmDialog(null, "Pense num animal.", null, JOptionPane.OK_CANCEL_OPTION)==0) {
			interrompeLoop = false;
			
			pergunta(animalTubarao);
			
			if(!interrompeLoop) {
				pergunta(animalMacaco);
			}
			
		}
							
	}

}
