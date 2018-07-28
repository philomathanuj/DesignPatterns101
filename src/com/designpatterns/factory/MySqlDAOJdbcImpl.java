package com.designpatterns.factory;

public class MySqlDAOJdbcImpl implements BaseDAO{

	@Override
	public String getDescription() {
		return "MySqlDAOJdbcImpl:MySQL specific implementation";
	}

}
