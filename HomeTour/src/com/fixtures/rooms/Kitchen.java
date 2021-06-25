package com.fixtures.rooms;
import java.util.*;
import com.fixtures.objects.*;

public class Kitchen extends Room{

	private Stove stove;
	private Fridge fridge;
	
	public Kitchen(String name, String shortDescription, String longDescription, ArrayList<String> stovetop) {
		super(name, shortDescription, longDescription);
		this.setStove(stovetop);
		this.setFridge();
	}
	
	public void setStove(ArrayList<String> stovetop) {
		this.stove = new Stove(stovetop);
	}
	
	public Stove getStove() {
		return this.stove;
	}
	
	public void setFridge() {
		this.fridge = new Fridge();
	}
	public Fridge getFridge() {
		return this.fridge;
	}

	
	@Override 
	public String objectName() {
		return stove.getName();
	}
	
	@Override
	public void interaction() {
		stove.interactWith();
	}
	
	public String objDesc() {
		return stove.getLongDescription();
	}
		
	public void objInteract() {
		stove.interactWith();
	}

}
