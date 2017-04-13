package by.training.nc.dev3.dao.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

import by.training.nc.dev3.dao.MySqlMenuDao;



public interface DaoFactory {
	
    /** Возвращает подключение к базе данных */
    public Connection getConnection() throws SQLException;

    /** Возвращает объект для управления персистентным состоянием объекта Menu*/
    public MySqlMenuDao getMenuDao(Connection connection);

   
    

}
