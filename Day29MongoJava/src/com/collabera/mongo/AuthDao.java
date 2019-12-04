package com.collabera.mongo;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

public class AuthDao {
	
	private MongoClient mongoClient = null;
	private MongoDatabase database = null;
	private MongoCollection<Auth> collection = null;
	
	public void connectToMongoAuth() {
		CodecProvider pojoCodecProvider = PojoCodecProvider.builder()
				.automatic(true).build();
		CodecRegistry pojoCodecRegistry = 
				fromRegistries(MongoClient.getDefaultCodecRegistry(),
						fromProviders(pojoCodecProvider));
		
		mongoClient = new MongoClient("localhost", 27017);
		database = mongoClient.getDatabase("mydb")
				.withCodecRegistry(pojoCodecRegistry);
		collection = database.getCollection("users", Auth.class);
		
	}
	public  List<Auth> listAllUsers()	 {
		List<Auth> auths = new ArrayList<Auth>();
		auths = collection.find().into(new ArrayList<Auth>());
		
		for(Auth auth : auths) {
			System.out.println(auth);
		}
		
		return auths;
	}
	public boolean authenticateLogin(String username, String password) {
		
		List<Auth> list = new ArrayList<Auth>();
		AuthDao aDao = new AuthDao();
		list = aDao.listAllUsers();
		boolean flag = false;
		
		for(Auth auth : list) {
			if((auth.getUsername() == username) && (auth.getPassword() == password)) {
				flag = true;
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		
		AuthDao aDao = new AuthDao();
		
		aDao.listAllUsers();
	}
}
