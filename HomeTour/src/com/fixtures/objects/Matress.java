package com.fixtures.objects;

import com.fixtures.Fixture;

public class Matress extends Fixture implements Interactive {
	private boolean dirty;
	private String color;
	
	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	public Matress() {
		super();
	}

	public Matress(String name, String shortDescription, String longDescription, String color) {
		super(name, shortDescription, longDescription);
		super.setName("Matress");
		
		this.color = color;
		
		if (isDirty())
		{
			super.setShortDescription("A dirty matress that looks possibly " + color + " and that takes up the small expensive room");
		} else {
			super.setShortDescription("A " + color +  " matress that takes up the small expensive room");
		}
	}

	@Override
	public void interactWith() {
		if (isDirty())
		{
			System.out.println("You laydown on the dirty mattress, close your eyes and gently fall a sleep.");
		} else {
			System.out.println("You laydown on the mattress, close your eyes and gently fall a sleep.");
		}
	}
}
