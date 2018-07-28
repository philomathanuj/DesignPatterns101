package com.designpatterns.factory;

public class PostgresDAOJdbcImpl implements BaseDAO{

	@Override
	public String getDescription() {
		return "PostgresDAOJdbcImpl:Postgres specific implementation";
	}

}
