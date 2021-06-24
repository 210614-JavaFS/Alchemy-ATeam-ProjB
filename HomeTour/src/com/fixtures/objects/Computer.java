package com.fixtures.objects;

import com.fixtures.Fixture;

public class Computer extends Fixture implements Interactive{
	
	private boolean isOn = false;
	
	public Computer(){
		super();
		this.setName("Computer");
		this.setShortDescription("A gaming computer is on");
        this.setLongDescription("The computer is turn off");
    }

	@Override
	public void interactWith() {
		if (isOn) {
		System.out.println("You turn off the computer");
		this.setLongDescription("The computer is turn off and the room goes darker now");
		isOn = false;
		}
		else {
			isOn = true;
			System.out.println("You turn on the computer");
			this.setLongDescription("You played a little bit with the computer");
		}
	}
	
}
