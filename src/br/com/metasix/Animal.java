package br.com.metasix;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	private String nome;
	private List<Caracteristica> caracteristicas;
	

	public Animal(String nome, List<Caracteristica> caracteristicas) {
		super();
		this.nome = nome;
		this.caracteristicas = caracteristicas;
	}
	
	public Animal(String nome) {
		super();
		this.nome = nome;
		this.caracteristicas = new ArrayList<Caracteristica>();
	}	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}
	
	public Caracteristica getCaracteristicas(int index) {
		return caracteristicas.get(index);
	}
	
	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	
	
}
