package com.fixtures;

public abstract class Fixture {

	private String name;
	private String shortDescription;
	private String longDescription;

	public Fixture(String name, String shortDescription, String longDescription) {
		super();
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public Fixture() {
		this.name = "";
		this.shortDescription = "";
		
	this.longDescription = "";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
	
	public String objectName() {
		return "";
	}
	
	public void interaction() {
		
	}
}
