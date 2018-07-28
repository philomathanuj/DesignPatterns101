package com.designpatterns.decorator;

public class JalapenoTopping implements ToppingDecorator{
private Pizza pizza;
	
	public JalapenoTopping(Pizza pizza) {
		this.pizza = pizza;
	}
	@Override
	public String getDescription() {
		return "JalapenoTopping+"+pizza.getDescription();
	}

	@Override
	public double getCost() {
		return 20+pizza.getCost();
	}


}
