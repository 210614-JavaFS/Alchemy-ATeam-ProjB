package com.fixtures.objects;

import com.fixtures.Fixture;

public class Toilet extends Fixture implements Interactive {

	private boolean toiletIsOutOfService;

	public boolean isToiletIsOutOfService() {
		return toiletIsOutOfService;
	}

	public void setToiletIsOutOfService(boolean toiletIsOutOfService) {
		this.toiletIsOutOfService = toiletIsOutOfService;
	}

	public Toilet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Toilet(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);

	}

	@Override
	public void interactWith() {

		if (isToiletIsOutOfService() == false) {
			System.out.println("You pulled down the toilet lever");
			this.setLongDescription(
					"The toilet has a couple years old. The tank lever is broken. The seat and the cover is out of place. The toilet is out of service.");
			setToiletIsOutOfService(true);
		} else {
			System.out.println("The toilet is out of service");
		}
	}

}
