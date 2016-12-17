package application;

import java.util.LinkedList;
import java.util.List;

import bean.Citta;
import db.Dao;

public class Model {

	Dao dao = new Dao();
	
	public List<String> getCity(){
		List<String> citta = new LinkedList<String>();
		citta = dao.getCitta();
		return citta;
	}
	
}
