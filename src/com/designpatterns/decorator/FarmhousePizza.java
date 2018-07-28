package com.designpatterns.decorator;

public class FarmhousePizza implements Pizza {

	@Override
	public String getDescription() {
		return "FarmhousePizza";
	}

	@Override
	public double getCost() {
		return 400;
	}

}
