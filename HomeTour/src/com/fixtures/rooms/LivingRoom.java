package com.fixtures.rooms;

import com.fixtures.objects.*;
import com.fixtures.objects.Interactive;

public class LivingRoom extends Room {
	
	public Clock clock = new Clock();
	public Television TV= new Television();
	public Couch couch= new Couch();
			
	@Override 
	public String objectName() {
		return clock.getName();
	}

	public Interactive getClockInteractive() {
		return clock;
	}

	public void setClockInteractive(Clock clock) {
		this.clock = clock;
	}
	

	public Interactive getTVInteractive() {
		return TV;
	}

	public void setTVInteractive(Television tv) {
		this.TV = tv;
	}

	public Couch getCouchInteractive() {
		return couch;
	}

	public void setCouchInteractive(Couch couch) {
		this.couch = couch;
	}

	public LivingRoom(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	
	@Override
	public void interaction() {
		clock.interactWith();
	}
	
	public String objDesc() {
		return clock.getLongDescription();
	}
		
	public void objInteract() {
		clock.interactWith();
	}
		
}
