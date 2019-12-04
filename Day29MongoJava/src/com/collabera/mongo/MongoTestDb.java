package com.collabera.mongo;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoTestDb {
	private MongoClient mongo = null;
	public MongoDatabase connectToMongo() {
		
		mongo = new MongoClient("localhost", 27017);
		MongoCredential credential;
		credential = MongoCredential.createCredential("sampleUser", "mydb", "password".toCharArray());
		
		MongoDatabase database = mongo.getDatabase("mydb");
		System.out.println("database : " + database.getName());
		return database;
		
	}
	public void createCollection(MongoDatabase database) {
		database.createCollection("sampleCollection");
		System.out.println("Collection created successfully.");
		
	}
	public MongoCollection<Document> retrieveCollection(MongoDatabase database, String collectionName) {
		MongoCollection<Document> collection = null;
		try {
			collection = database.getCollection(collectionName);
		} catch(IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}
		return collection;
	}
	public void insertDocument(MongoCollection<Document> collection) {
		Document document = new Document("title", "MongoDB2")
				.append("id", 2)
				.append("description", "database")
				.append("likes", 100)
				.append("url", "http://www.collabera.com/mongodb/")
				.append("by", "collabera");
		
				collection.insertOne(document);
		
				System.out.println("Document inserted successfully");
	}
	public void retrieveAllDocuments(MongoCollection<Document> collection) {
		
		FindIterable<Document> iterDoc = collection.find();
		int i = 1;
		
		// Getting the iterator
		Iterator it = iterDoc.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			i++;
		}
		System.out.println("total nr of documents: " + i);
	}
	public void updateDocument(MongoCollection<Document> collection) {
		try {
			collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));
			System.out.println("Document update successfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void deleteDocument(MongoCollection<Document> collection) {
		try {
			collection.deleteOne(Filters.eq("id", 1));
			System.out.println("Document deleted successfully...");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void dropCollection(MongoCollection<Document> collection) {
		collection.drop();
		System.out.println("Collection dropped successfully.");
	}
	public void listCollections(MongoDatabase database) {
		for(String name : database.listCollectionNames()) {
			System.out.println(name);
		}
	}
	
	@Override
	public void finalize() {
		mongo.close();
	}

	public static void main(String[] args) {
		MongoTestDb mongoApp = new MongoTestDb();
		
		MongoDatabase database = mongoApp.connectToMongo();
		
		// Retrieving a collection
		MongoCollection<Document> collection = database.getCollection("sampleCollection");
		
		mongoApp.insertDocument(collection);
		mongoApp.retrieveAllDocuments(collection);
		
		mongoApp.updateDocument(collection);
		mongoApp.retrieveAllDocuments(collection);
		
		mongoApp.deleteDocument(collection);
		mongoApp.retrieveAllDocuments(collection);
	}
}
