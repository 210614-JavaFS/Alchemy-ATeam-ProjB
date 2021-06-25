package com.fixtures.rooms;

import com.fixtures.objects.Toilet;

public class Bathroom1 extends Room {

	private Toilet toilet = new Toilet();

	public Bathroom1(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

}
