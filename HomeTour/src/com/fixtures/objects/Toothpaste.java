package com.fixtures.objects;

import com.fixtures.Fixture;

public class Toothpaste extends Fixture implements Interactive {

	private boolean isToothpasteEmpty;

	public Toothpaste() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Toothpaste(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);

	}

	@Override
	public void interactWith() {

		if (isToothpasteEmpty() == false) {
			System.out.println("You used the rest of the toothpaste");
			this.setLongDescription(
					"The toothpaste is on the counter top besides the sink. Its empty and it does not have the cap.");
			setToothpasteEmpty(true);
		} else {
			System.out.println("The toothpaste is empty.");
		}
	}

	public boolean isToothpasteEmpty() {
		return isToothpasteEmpty;
	}

	public void setToothpasteEmpty(boolean isToothpasteEmpty) {
		this.isToothpasteEmpty = isToothpasteEmpty;
	}

}
