package com.designpatterns.decorator;

public class GoldenCornTopping implements ToppingDecorator{
	
	private Pizza pizza;
	
	public GoldenCornTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDescription() {
		return "GoldenCornTopping+"+pizza.getDescription();
	}

	@Override
	public double getCost() {
		return 10+pizza.getCost();
	}

}
