package br.com.metasix;

import java.util.ArrayList;
import java.util.List;

public class Caracteristica {
	private String nome;
	private List<Animal> animais;
	
		
	public Caracteristica(String nome, List<Animal> animais) {
		super();
		this.nome = nome;
		this.animais = animais;
	}
	
	public Caracteristica(String nome) {
		super();
		this.nome = nome;
		this.animais = new ArrayList<Animal>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Animal> getAnimais() {
		return animais;
	}
	public void setAnimais(List<Animal> animais) {
		this.animais = animais;
	}
	
}
