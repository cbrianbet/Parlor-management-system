package com.board.model;

public class Desease {
	String name;
	Personel enteredBy;
	public Desease(String name, Personel enteredBy) {
		super();
		this.name = name;
		this.enteredBy = enteredBy;
	}
	public String getName() {
		return name;
	}
	public Personel getEnteredBy() {
		return enteredBy;
	}
	
}