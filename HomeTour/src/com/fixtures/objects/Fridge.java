package com.fixtures.objects;

import com.fixtures.Fixture;

public class Fridge extends Fixture {
	
	private boolean doorIsClose = true;
	
	public boolean isFridgeDoorClose() {
		this.setLongDescription("It looks like they actually close the fridge door this time.");
		return doorIsClose;
	}
	

}
