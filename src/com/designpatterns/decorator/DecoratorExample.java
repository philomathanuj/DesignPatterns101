package com.designpatterns.decorator;

public class DecoratorExample {
	
	public static void main(String[] args) {
		Pizza pizza = new MexicanGreenWavePizza();
		System.out.println(pizza.getDescription()+":: Rs."+pizza.getCost());
		pizza = new GoldenCornTopping(pizza);
		System.out.println(pizza.getDescription()+":: Rs."+pizza.getCost());
		pizza = new JalapenoTopping(pizza);
		System.out.println(pizza.getDescription()+":: Rs."+pizza.getCost());
		pizza = new PaneerTopping(pizza);
		System.out.println(pizza.getDescription()+":: Rs."+pizza.getCost());
		System.out.println("----------------------------");
		Pizza pizza2 = new FarmhousePizza();
		System.out.println(pizza2.getDescription()+":: Rs."+pizza2.getCost());
		pizza2 = new GoldenCornTopping(pizza2);
		System.out.println(pizza2.getDescription()+":: Rs."+pizza2.getCost());
		pizza2 = new JalapenoTopping(pizza2);
		System.out.println(pizza2.getDescription()+":: Rs."+pizza2.getCost());
		pizza2 = new PaneerTopping(pizza2);
		System.out.println(pizza2.getDescription()+":: Rs."+pizza2.getCost());
		System.out.println("----------------------------");
		Pizza pizza3 = new VeggiParadisePizza();
		System.out.println(pizza3.getDescription()+":: Rs."+pizza3.getCost());
		pizza3 = new GoldenCornTopping(pizza3);
		System.out.println(pizza3.getDescription()+":: Rs."+pizza3.getCost());
		pizza3 = new JalapenoTopping(pizza3);
		System.out.println(pizza3.getDescription()+":: Rs."+pizza3.getCost());
		pizza3 = new PaneerTopping(pizza3);
		System.out.println(pizza3.getDescription()+":: Rs."+pizza3.getCost());
	}

}
