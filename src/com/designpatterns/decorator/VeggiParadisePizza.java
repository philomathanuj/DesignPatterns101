package com.designpatterns.decorator;

public class VeggiParadisePizza implements Pizza{

	@Override
	public String getDescription() {
		return "VeggiParadisePizza";
	}

	@Override
	public double getCost() {
		return 600;
	}

}
