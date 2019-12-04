package com.collabera.mongo;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.ArrayList;
import java.util.List;

import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

public class EmployeeMongoDao {
	
	private MongoClient mongoClient = null;
	private MongoDatabase database = null;
	private MongoCollection<Employee> collection = null;
	
	public void connectToMongo() {
		CodecProvider pojoCodecProvider = PojoCodecProvider.builder()
				.automatic(true).build();
		CodecRegistry pojoCodecRegistry = 
				fromRegistries(MongoClient.getDefaultCodecRegistry(),
						fromProviders(pojoCodecProvider));
		
		mongoClient = new MongoClient("localhost", 27017);
		database = mongoClient.getDatabase("mydb")
				.withCodecRegistry(pojoCodecRegistry);
		collection = database.getCollection("employees", Employee.class);
		
	}
	public void deleteEmployee(ObjectId id) {
		DeleteResult deleteResult = collection.deleteOne(Filters.eq("_id", id));
		System.out.println("Deleted: " + deleteResult.getDeletedCount());
	}
	public Employee findByFirstName(String firstName) {
		Employee emp = collection.find(Filters.eq("firstName", firstName)).first();
		System.out.println(emp);
		return emp;
	}
	public Employee findById(ObjectId id) {
		Employee emp = collection.find(Filters.eq("id", id)).first();
		System.out.println(emp);
		return emp;
	}
	public void updateEmployee(Employee emp) {
		UpdateResult updateResult = collection.updateOne(Filters.eq("_id", emp.getId()),
				Updates.combine(
						Updates.set("firstName", emp.getFirstName()),
						Updates.set("lastName", emp.getLastName()),
						Updates.set("age", emp.getAge())));
		
		System.out.println("Updated: " + updateResult.getModifiedCount());
	}
	public void insertEmployee(Employee emp) {
		collection.insertOne(emp);
	}
	public List<Employee> listAllEmployees()	 {
		List<Employee> employees = new ArrayList<Employee>();
		employees = collection.find().into(new ArrayList<Employee>());
		for(Employee employee : employees) {
			System.out.println(employee);
		}
		return employees;
	}
	
	public static void main(String[] args) {
		EmployeeMongoDao dao = new EmployeeMongoDao();
		dao.connectToMongo();
		
		System.out.println("-------------------INSERT EMPLOYEE---------------");
		dao.insertEmployee(new Employee("Jack", "Smith", 44));
		
		System.out.println("--------------------LIST ALL EMPLOYEES-------------");
		dao.listAllEmployees();
		
		System.out.println("--------------FIND EMPLOYEE------------");
		dao.findByFirstName("Ada");
		
		System.out.println("-----------------UPDATE EMPLOYEE--------------");
		dao.updateEmployee(new Employee(
				new ObjectId("5dd8101de0d3936d3d918d51"),
				"Martha",
				"Jones",
				33));
		
		System.out.println("---------------DELETE EMPLOYEE--------------");
		dao.deleteEmployee(new ObjectId("5dd8106a38ffd258b80b7d7d"));
		
		System.out.println("------------------LIST ALL EMPLOYEES------------");
		dao.listAllEmployees();
	}

}
