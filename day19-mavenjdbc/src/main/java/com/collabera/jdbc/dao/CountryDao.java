package com.collabera.jdbc.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.collabera.jdbc.model.City;
import com.collabera.jdbc.model.Country;
import com.collabera.jdbc.utils.JdbcUtils;
import com.sun.tools.javac.util.Log;

public class CountryDao {
	private static final Logger logger = Logger.getLogger(CountryDao.class.getName());
	//private static final CountryDao countryDao;
	private static HashMap<String, Country> cache = new HashMap<String, Country>();

	/** retrieve a city by name 
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws SQLException */
	public List<Country> findByName (String name) throws FileNotFoundException, IOException, SQLException {

		List<Country> list = find("WHERE name = '"+name+"'");
		return list;
	}

	public List<Country>find(String query) throws FileNotFoundException, IOException, SQLException {

		List<Country> list = new ArrayList<Country>();
		PreparedStatement pstmt = JdbcUtils.getConnection().prepareStatement("SELECT * FROM Country WHERE name = ?");
		pstmt.setString(1,  "Thailand");
		try {
			//logger.debug("executiy query: " + sqlquery);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Country c = resultSetToCountry (rs);
				list.add(c);
			} 
		} catch (SQLException sqle) {
			//logger.error("error executing: " + sqlquery, sqle);
		} finally {
			if(pstmt!= null) 
				try {
					pstmt.close();
				} catch (SQLException e) {
					/*ignore it */
				}
		}
		return list;
	}

	public boolean delete(String code) throws SQLException {
		if (code == null) {
			return false;
		}

		PreparedStatement statement = JdbcUtils.getConnection().
				prepareStatement("DELETE FROM Country where code = ?");
		statement.setString(1,  code);

		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.error("error executing delete for code: " + code);
		} finally {
			statement.close();
		}
		
		return count > 0;
	}
	
	public boolean insert (Country country) throws SQLException {
		if(country == null) {
			return false;
		}
		PreparedStatement statement = JdbcUtils.getConnection()
				.prepareStatement("lNSERT INTO country(code, name, continent, region) VALUES(?, ?, ?, ?)");
			
		statement.setString(1,  country.getCode());
		statement.setString(2,  country.getName());
		statement.setString(3,  country.getContinent());
		statement.setString(4, country.getRegion());
		
		int count = 0;
		try {
			count = statement.executeUpdate();
		} catch (SQLException sqle) {
			logger.error("error executing insert for country: " + country);
		} finally {
			statement.close();
		}
		return count > 0;
	}

	private Country resultSetToCountry(ResultSet rs) throws SQLException {
		Country country = null;

		String code = rs.getString("Code");

		// is this city already in cache? if so, use it
		if (cache.containsKey(code)) {
			country = cache.get(code);
		} else {
			country = new Country();
		}

		country.setCode(rs.getString("Code"));
		country.setName(rs.getString("Name"));
		country.setContinent(rs.getString("Continent"));
		country.setRegion(rs.getString("Region"));

		if(!cache.containsKey(code)) {
			cache.put(code,  country);
		}

		// now get reference to the country this city refers
		logger.info("get country for city " + country.getName());
		//Country country = countryDao.findById(country code);
		//city.setCountry(country);
		return country;
	}
}
