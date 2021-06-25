package com.fixtures.rooms;
import java.util.*;
import com.fixtures.objects.*;

public class Kitchen extends Room{

	private Interactive stove;
	private Interactive fridge;
	
	public Kitchen(String name, String shortDescription, String longDescription, ArrayList<String> stovetop) {
		super(name, shortDescription, longDescription);
		this.setStove(stovetop);
		this.setFridge();
		ArrayList<Interactive> interact = new ArrayList<Interactive>();
		interact.add(this.stove);
		interact.add(this.fridge);
		this.setInteractive(interact);
		
	}
	
	public void setStove(ArrayList<String> stovetop) {
		this.stove = new Stove(stovetop);
	}
	
	public Interactive getStove() {
		return this.stove;
	}
	
	public void setFridge() {
		this.fridge = new Fridge();
	}
	public Interactive getFridge() {
		return this.fridge;
	}
}
