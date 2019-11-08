package com.collabera.jdbc.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.apache.log4j.Logger;

import com.collabera.jdbc.model.City;
import com.collabera.jdbc.utils.JdbcUtils;

public class CityDao {

	private static final Logger logger = Logger.getLogger(CityDao.class.getName());
	//private static final CountryDao countryDao;
	private static HashMap<Integer, City> cache = new HashMap<Integer, City>();

	/** retrieve a city by its id 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws SQLException */
	public City findById(Integer id) throws FileNotFoundException, IOException, SQLException {
//		if (cache.containsKey(id)) {
//			return cache.get(id);
//		}
		List<City> list = find("WHERE ID = "  + id);
		return list.get(0);
	}

	/** retrieve a city by name 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws SQLException */
	public List<City> findByName (String name) throws FileNotFoundException, IOException, SQLException {
	
		List<City> list = find("WHERE name = '"+name+"'");
		return list;
	}

	public List<City>find(String query) throws FileNotFoundException, IOException, SQLException {

		List<City> list = new ArrayList<City>();
		Statement stmt = JdbcUtils.getConnection().createStatement();
		String sqlquery = "SELECT * FROM city" + query;
		
		try {
			logger.debug("executiy query: " + sqlquery);
			ResultSet rs = stmt.executeQuery(sqlquery);
			while(rs.next()) {
				City c = resultSetToCity (rs);
				list.add(c);
			} 
		}catch (SQLException sqle) {
			logger.error("error executing: ", sqle);
		} finally {
			if(stmt!= null) 
				try {
					stmt.close();
				} catch (SQLException e) {
					/*ignore it */
				}
		}
		return list;
	}

	private City resultSetToCity(ResultSet rs) throws SQLException {
		City city = null;
		
		Integer id = rs.getInt("id");
		
		// is this city already in cache? if so, use it
		if (cache.containsKey(id)) {
			city = cache.get(id);
		} else {
			city = new City();
		}
		
		city.setId(id);
		city.setName(rs.getString("Name"));
		city.setDistrict(rs.getString("District"));
		city.setPopulation(rs.getInt("Population"));
		String countrycode = rs.getString("countrycode");
		
		if(!cache.containsKey(id)) {
			cache.put(id,  city);
		}
		
		// now get reference to the country this city refers
		logger.info("get country for city " + city.getName());
		//Country country = countryDao.findById(countrycode);
		//city.setCountry(country);
		return city;
	}
}
