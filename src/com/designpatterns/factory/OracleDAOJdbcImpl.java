package com.designpatterns.factory;

public class OracleDAOJdbcImpl implements BaseDAO{

	@Override
	public String getDescription() {
		return "OracleDAOJdbcImpl:Oracle specific implementation!";
	}

}
