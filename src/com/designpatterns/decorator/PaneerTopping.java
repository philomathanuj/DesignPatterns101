package com.designpatterns.decorator;

public class PaneerTopping implements ToppingDecorator{
private Pizza pizza;
	
	public PaneerTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDescription() {
		return "PaneerTopping+"+pizza.getDescription();
	}

	@Override
	public double getCost() {
		return 30+pizza.getCost();
	}


}
