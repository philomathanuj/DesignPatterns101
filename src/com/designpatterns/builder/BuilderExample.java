package com.designpatterns.builder;

public class BuilderExample {
	public static void main(String[] args) {
		
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
				  calories(100).sodium(35).build();
		System.out.println(cocaCola.toString());
	}

}


