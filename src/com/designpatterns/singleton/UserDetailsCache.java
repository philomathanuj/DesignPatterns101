package com.designpatterns.singleton;

public class UserDetailsCache {
	
	private volatile static UserDetailsCache instance;
	
	private UserDetailsCache() {
		
	}
	
	public static UserDetailsCache getInstance() {
		if(instance == null) {
			synchronized (UserDetailsCache.class) {
				if(instance == null) {
					instance = new UserDetailsCache();
				}
			}
		}
		return instance;
	}

}
