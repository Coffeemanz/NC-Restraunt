package by.training.nc.dev3.dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.*;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import by.training.nc.dev3.dao.interfaces.*;
import by.training.nc.dev3.dao.*;
import by.training.nc.dev3.entities.*;
import by.training.nc.dev3.exceptions.PersistException;

import java.sql.*;


public class Db_test {

	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/mysql";
	
	public static void main(String[] args) throws SQLException
	{
		System.out.println("Now in DAO/ Db_test /");
		
		// тестим дао бля...
		
		DaoFactory daoFactory = new MySqlDaoFactory();
		List<MenuEntity> list= null;
		try (Connection con = daoFactory.getConnection())
		{
			MySqlMenuDao dao = daoFactory.getMenuDao(con);
			try {
				list = dao.getAll();
			} catch (PersistException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(list);
		}
		
		
		

		
	// второй тест без дао (подключние и тд вынес в DBProcesso, тут уже только запрос)	
		
//		DBProcessor db = new DBProcessor();
//		Connection conn = db.getConnection(URL, USERNAME, PASSWORD);
//		
//		String query = "select * from restraunt_nc.menu";
//		String insert = "insert into restraunt_nc.menu (product_name, product_price) values (?, ?)";
		
//		PreparedStatement prepInsert = conn.prepareStatement(insert);
//		prepInsert.setString(1, "Prepared food");
//		prepInsert.setDouble(2, 10);
//		prepInsert.setInt(3, 2);
//		prepInsert.execute();
//		
//		Statement statement = conn.createStatement();
//		ResultSet resSet = statement.executeQuery(query);
		
//		PreparedStatement prepStat = conn.prepareStatement(query);
//		ResultSet resSet = prepStat.executeQuery();
//		
//		while (resSet.next())
//		{
//			System.out.println(resSet.getInt("product_id") + " " + resSet.getString("product_name") + " " + resSet.getFloat("product_price"));
//		}
//		
//		prepStat.close();
//		conn.close();
//		
		
		
		
		
		
		// первый тест без дао (3 урок где-то по видео)
		
		
//		//Connection connection = null;
//		Driver driver = null;
//		
//		try {
//			driver = new FabricMySQLDriver();
//		} catch (SQLException e) {
//			System.out.println("An error occured while creating driver.");
//		}
//		
//		try {
//			DriverManager.registerDriver(driver);
//		} catch (SQLException e) {
//			System.out.println("Can't register the driver.");
//		}
//		
//		try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//			Statement statement = connection.createStatement())
//		{	
//			System.out.println("Doing some stuff...");
//			
//			//statement.execute("insert into res_test.menu (product_name, price, client_id) values (\"Olivie\", 4, 1)");
//			//System.out.println(statement.executeQuery("select * from res_test.menu")); 			
//			//statement.executeUpdate("update res_test.menu set product_name=\"Whyskey\" where product_id = 5");
//			
//			//statement.executeQuery("select * from res_test.menu");
//			
//			
//			
//		} catch (SQLException e) {
//			System.out.println("Can't connect.");
//		}

	
	}
}
