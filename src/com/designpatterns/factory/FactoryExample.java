package com.designpatterns.factory;

public class FactoryExample {
	
	public static void main(String[] args) {
		BaseDAO oracleBaseDAO = DAOFactory.getInstance("ORACLE");
		BaseDAO postgresBaseDAO = DAOFactory.getInstance("POSTGRES");
		BaseDAO mysqlBaseDAO = DAOFactory.getInstance("MYSQL");
		System.out.println(oracleBaseDAO.getDescription());
		System.out.println(postgresBaseDAO.getDescription());
		System.out.println(mysqlBaseDAO.getDescription());
	}

}
