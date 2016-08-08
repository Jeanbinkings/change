package cn.Jeanbin.service;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jfinal.plugin.activerecord.Page;
import cn.Jeanbin.dao.EntityDao;

public class EntityService {

	public Page<EntityDao> showAll(int pageNumber,int pageSize,String table){
		return EntityDao.dao.paginate(pageNumber, pageSize, "select * ", "from "+table);
	}
	
	public Page<EntityDao> showBycaiji(int pageNumber,int pageSize,String table){
		return EntityDao.dao.paginate(pageNumber, pageSize, "select * ", "from "+table+" where caiji is null");
	}
	
	public Page<EntityDao> showBychuli(int pageNumber,int pageSize,String table){
		return EntityDao.dao.paginate(pageNumber, pageSize, "select * ", "from "+table+" where chuli is null");

	}
	
	public Page<EntityDao> showBycaijied(int pageNumber,int pageSize,String table){
		return EntityDao.dao.paginate(pageNumber, pageSize, "select * ", "from "+table+" where caiji is not null");
	}
	
	public Page<EntityDao> showBychulied(int pageNumber,int pageSize,String table){
		return EntityDao.dao.paginate(pageNumber, pageSize, "select * ", "from "+table+" where chuli is not null");

	}
	
	public List showtabls() throws ClassNotFoundException, SQLException{
		List list = new ArrayList();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://104.238.223.136/video","wo31400","314314");
		Statement stmt = conn.createStatement();
		ResultSet rs =stmt.executeQuery("show tables");
		while (rs.next()) {
			list.add(rs.getString("Tables_in_video"));
		}
		rs.close();
		stmt.close();
		conn.close();
		return list;
	}
	
	public boolean update_caiji(){
		
		return false; 
	}
	
	public boolean update_chuli(){
		
		return false;
	}
}
