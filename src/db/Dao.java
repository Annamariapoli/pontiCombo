package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import bean.Citta;

public class Dao {
	
	public List<String> getCitta(){
		Connection conn = DBConnect.getConnection();
		String query = "select city from citta order by city ASC ;";
		List<String> citta = new LinkedList<String>();
		try{
			PreparedStatement st = conn.prepareStatement(query);
			ResultSet res = st.executeQuery();
			while(res.next()){
				Citta c = new Citta(res.getInt("idCitta"), res.getString("call"), res.getString("city"));
				//Citta c = new Citta(res.getString("city"));
				citta.add(c.getCity());
			}
			conn.close();
			return citta;
			
		}catch(SQLException e ){
			e.printStackTrace();
			return null;
		}
		
	}

}
