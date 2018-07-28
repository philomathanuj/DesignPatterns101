package com.designpatterns.decorator;

public class MexicanGreenWavePizza implements Pizza {

	@Override
	public String getDescription() {
		return "MaxicanGreenWavePizza";
	}

	@Override
	public double getCost() {
		return 500;
	}

}
