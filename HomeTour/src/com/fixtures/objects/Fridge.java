package com.fixtures.objects;

import com.fixtures.Fixture;

public class Fridge extends Fixture implements Interactive {
	
	private boolean doorIsClose = true;
	
	public boolean isFridgeDoorClose() {
		if(this.doorIsClose == true) {
			this.setLongDescription("It looks like they actually close the fridge door this time.");
		}
		return doorIsClose;
	}

	@Override
	public void interactWith() {
		// TODO Auto-generated method stub
		this.isFridgeDoorClose();
		System.out.println(this.getLongDescription());
	}	

}
