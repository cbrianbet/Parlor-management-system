package com.board.model;

public class Insident {
	private Cow cow;
	private Desease d;
	private boolean attended;
	
	public Insident(Cow cow, Desease d, boolean attended) {
		super();
		this.cow = cow;
		this.d = d;
		this.attended = attended;
	}
	
	public void setCow(Cow c) {
		cow = c;
	}
	
	public void setDesease(Desease d){
		this.d = d;
	}
	
	public void setAttended(boolean attended) {
		this.attended = attended;
	}

	public Cow getCow() {
		return cow;
	}

	public Desease getD() {
		return d;
	}

	public boolean isAttended() {
		return attended;
	}
	
	
}
