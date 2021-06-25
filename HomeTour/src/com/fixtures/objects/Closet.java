package com.fixtures.objects;

import com.fixtures.Fixture;

public class Closet extends Fixture implements Interactive{
	
	private int numOfClothes;

	public int getNumOfClothes() {
		return numOfClothes;
	}

	public void setNumOfClothes(int numOfClothes) {
		this.numOfClothes = numOfClothes;
	}

	@Override
	public void interactWith() {
		System.out.println( "The closet is ready");
		
		if(getNumOfClothes()<=20) {
			System.out.println("the closet has space");
		}else {
			System.out.println("you can not add any more clothes");
		}
		
	}

	public Closet(String name, String shortDescription, String longDescription,int numOfClothes) {
		super(name, shortDescription, longDescription);
		this.numOfClothes = numOfClothes;
	}

}
