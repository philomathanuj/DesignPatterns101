package com.designpatterns.factory;

public class DAOFactory {
	
	
	public static BaseDAO getInstance(String databaseType) {
		if("ORACLE".equals(databaseType)) {
			return new OracleDAOJdbcImpl();
		}
		else if("POSTGRES".equals(databaseType)) {
			return new PostgresDAOJdbcImpl();
		}
		else if("MYSQL".equals(databaseType)) {
			return new MySqlDAOJdbcImpl();
		}
		else {
			throw new IllegalArgumentException("No database found with the given type");
		}
	}

}
