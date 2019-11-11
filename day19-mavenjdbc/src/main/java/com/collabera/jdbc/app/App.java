package com.collabera.jdbc.app;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.List;

import org.apache.log4j.Logger;

import com.collabera.jdbc.dao.CityDao;
import com.collabera.jdbc.dao.CountryDao;
import com.collabera.jdbc.dao.Department;
import com.collabera.jdbc.dao.EmployeeDao;
import com.collabera.jdbc.model.City;
import com.collabera.jdbc.model.Country;
import com.collabera.jdbc.model.Employee;


public class App 
{
	// Create static logger
	static Logger log = Logger.getLogger(App.class.getName());

	public static void main( String[] args ) throws IOException {
		log.debug("Hello World!");
		log.info("JDBC test app started.");

		Properties props = new Properties();
		props.load(new FileInputStream("jdbc.properties"));

		String user = props.getProperty("user");
		String password = props.getProperty("password");
		String dburl = props.getProperty("dburl");

		// connect to database
		Connection conn = null;
		try {
			conn = (Connection) DriverManager.getConnection(dburl, user, password);
			if(conn!=null) {
				System.out.println("mysql connection successfully acquired!");
			}
			String sql = "select * from city";
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				log.debug(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
			}
			rs.close();
			conn.close();
		} catch (Exception ex) {
			//System.out.println(ex.getMessage());
			log.error(ex.getMessage());
		}

		//TEST CITYDAO
				log.info("Testing CityDao...");
				CityDao cityDao = new CityDao();
		//		try {
		//			List<City> cities = cityDao.findByName("Miami");
		//			if(cities.size() > 0) {
		//				log.info(cities.get(0));
		//			}
		//		} catch (Exception e) {
		//			log.error(e.getMessage());
		//		}

		// TEST COUNTRYDAO
				log.info("Testing CountryDao...");
				CountryDao countryDao = new CountryDao();
				try {
					List<Country> countries = countryDao.findByName("Congo");
					if(countries.size() > 0) {
						log.info(countries.get(0));
					}
				} catch (Exception e) {
					log.error(e.getMessage());
				}

		// TRY AND DELETE
				try {
					String code = "XYZ";
					boolean count = countryDao.delete(code);
					log.info("SUCCESS: Delete country: " + code); 
				} catch (Exception e) {
					
				}

		 //TRY AND INSERT
				try {
					Country country = new Country("BBB", "AAA", "Asia", "QQQ");
					boolean success = countryDao.insert(country);
					if(success) {
						log.info("SUCCESS: Country inserted: " + country.toString());
					}
				} catch (Exception e) {
					log.error(e.getMessage());
				}

//		// TESTING THE EMPLOYEEDAO
//		log.info("Testing EmployeeDao...");
//		EmployeeDao employeeDao = new EmployeeDao();
//		try {
//		
//			Employee employee = new Employee(123, "Smith", "John", Department.ACCOUNTING);
//			boolean success = employeeDao.insert(employee);
//			if(success) {
//				log.info("SUCCESS: Country inserted: " + employee.toString());
//			}
//		} catch (Exception e) {
//			log.error(e.getMessage());
//		}



	}
}
