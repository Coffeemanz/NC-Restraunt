package by.training.nc.dev3.dao.interfaces;

import java.sql.Connection;
import java.sql.SQLException;

import by.training.nc.dev3.dao.MySqlMenuDao;



public interface DaoFactory {
	
    /** ���������� ����������� � ���� ������ */
    public Connection getConnection() throws SQLException;

    /** ���������� ������ ��� ���������� ������������� ���������� ������� Menu*/
    public MySqlMenuDao getMenuDao(Connection connection);

   
    

}
