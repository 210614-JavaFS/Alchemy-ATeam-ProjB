package com.fixtures.rooms;

import com.fixtures.objects.*;
import com.fixtures.objects.Interactive;

public class LivingRoom extends Room {
	
	public Interactive clock = new Clock();
	public Interactive TV= new Television();
	public Interactive Couch= new Couch();
			
	

	public Interactive getClockInteractive() {
		return clock;
	}

	public void setClockInteractive(Interactive clock) {
		this.clock = clock;
	}
	

	public Interactive getTVInteractive() {
		return TV;
	}

	public void setTVInteractive(Interactive tV) {
		TV = tV;
	}

	public Interactive getCouchInteractive() {
		return Couch;
	}

	public void setCouchInteractive(Interactive couch) {
		Couch = couch;
	}

	public LivingRoom(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
		
}
