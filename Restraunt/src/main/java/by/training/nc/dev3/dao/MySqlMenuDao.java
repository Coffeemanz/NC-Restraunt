package by.training.nc.dev3.dao;

import by.training.nc.dev3.dao.interfaces.*;
import by.training.nc.dev3.entities.*;
import by.training.nc.dev3.exceptions.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySqlMenuDao extends AbstractJDBCDao<MenuEntity, Integer>{

    private class PersistMenu extends MenuEntity {
        public void setId(int id) {
            super.setId(id);
        }
    }
    
    public MySqlMenuDao(Connection connection) {
        super(connection);
    }
    
    @Override
    public String getSelectQuery() {
        return "SELECT product_id, product_name, product_description FROM restraunt_nc.menu";
    }

    @Override
    public String getCreateQuery() {
        return "INSERT INTO restraunt_nc.menu (product_name, product_price) \n" +
                "VALUES (?, ?);";
    }

    @Override
    public String getUpdateQuery() {
        return "UPDATE restraunt_nc.menu SET product_name= ?, product_price = ? WHERE product_id= ?;";
    }

    @Override
    public String getDeleteQuery() {
        return "DELETE FROM restraunt_nc.menu WHERE product_id= ?;";
    }

    @Override
    public MenuEntity create() throws PersistException {
        MenuEntity m = new MenuEntity();
        return persist(m);
    }

 

    @Override
    protected List<MenuEntity> parseResultSet(ResultSet rs) throws PersistException {
        LinkedList<MenuEntity> result = new LinkedList<MenuEntity>();
        try {
            while (rs.next()) {
                PersistMenu m = new PersistMenu();
                m.setId(rs.getInt("product_id"));
                m.setProduct_name(rs.getString("product_name"));
                m.setProduct_description(rs.getString("product_description"));
                m.setProduct_price(rs.getFloat("product_price"));
                result.add(m);
            }
        } catch (Exception e) {
            throw new PersistException(e);
        }
        return result;
    }

    @Override
    protected void prepareStatementForInsert(PreparedStatement statement, MenuEntity object) throws PersistException {
        try {
            statement.setString(1, object.getProduct_name());
            statement.setFloat(2, object.getProduct_price());
        } catch (Exception e) {
            throw new PersistException(e);
        }
    }

    @Override
    protected void prepareStatementForUpdate(PreparedStatement statement, MenuEntity object) throws PersistException {
        try {
            statement.setString(1, object.getProduct_name());
            statement.setFloat(2, object.getProduct_price());
            statement.setInt(3, object.getId());
        } catch (Exception e) {
            throw new PersistException(e);
        }
    }

	@Override
	public MenuEntity getByPK(int key) throws SQLException, PersistException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//	private final Connection connection;
//	
//	public MySqlMenuDao(Connection connection) {
//        this.connection = connection;
//    }
//
//    @Override
//    public MenuEntity create() {
//        return null;
//    }
//    
//    @Override
//    public MenuEntity read(int key) throws SQLException{
//        String sql = "SELECT * FROM restraunt_nc.menu WHERE id = ?;";
//        PreparedStatement stm = connection.prepareStatement(sql);
//
//        stm.setInt(1, key);
//
//        ResultSet rs = stm.executeQuery();
//        rs.next();
//        MenuEntity m = new MenuEntity();
//        m.setProduct_id(rs.getInt("product_id"));
//        m.setProduct_name(rs.getString("product_name"));
//        m.setProduct_description(rs.getString("product_description"));
//        m.setProduct_price(rs.getFloat("product_price"));
//        return m;
//    }
//    
//    @Override
//    public void update(MenuEntity menu) {
//
//    }
//    
//    @Override
//    public void delete(MenuEntity menu) {
//
//    }
//    
//    @Override
//    public List<MenuEntity> getAll() throws SQLException {
//        String sql = "SELECT * FROM restraunt_nc.menu;";
//        PreparedStatement stm = connection.prepareStatement(sql);
//        ResultSet rs = stm.executeQuery();
//        List<MenuEntity> list = new ArrayList<MenuEntity>();
//        while (rs.next()) {
//            MenuEntity m = new MenuEntity();
//            m.setProduct_id(rs.getInt("product_id"));
//            m.setProduct_name(rs.getString("product_name"));
//            m.setProduct_description(rs.getString("product_description"));
//            m.setProduct_price(rs.getFloat("product_price"));
//            list.add(m);
//        }
//        return list;
//    }
    
    
}
