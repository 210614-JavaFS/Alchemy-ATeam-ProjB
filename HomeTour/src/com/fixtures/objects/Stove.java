package com.fixtures.objects;
import java.util.*;

import com.fixtures.*;
public class Stove extends Fixture implements Interactive {
	private ArrayList<String> stoveTop;
	private boolean stoveIsEmpty;
	
	public boolean isTheStoveEmpty() {
		if(this.stoveTop.isEmpty() == true) {
			this.setStoveTopEmpty(true);
		}else if(this.stoveTop.isEmpty() == false) {
			this.setStoveTopEmpty(false);
		}
		return stoveIsEmpty;
	}
	public void setStoveTopEmpty(boolean stoveIsEmpty) {
		this.stoveIsEmpty = stoveIsEmpty;
		
	}
	public Stove(ArrayList<String> stoveTop) {
		this.stoveTop = stoveTop;
		this.isTheStoveEmpty();
	}
	

	@Override
	public void interactWith() {
		// TODO Auto-generated method stub
		if(isTheStoveEmpty() == false) {
			System.out.println("The stove is covered with pots. You can cook food after you clean.");
			this.setLongDescription("It looks like your roomates have cooked food before you arrived. The stove needs to be clean before you can cook anything");
		}else {
			System.out.println("The stove is clean. You can cook.");
		}
	}

}
