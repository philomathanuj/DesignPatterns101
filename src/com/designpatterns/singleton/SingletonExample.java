package com.designpatterns.singleton;

public class SingletonExample {
	
	public static void main(String[] args) {
		UserDetailsCache userDetails = UserDetailsCache.getInstance();
		System.out.println("Singleton object created successfully : "+userDetails);
	}

}
