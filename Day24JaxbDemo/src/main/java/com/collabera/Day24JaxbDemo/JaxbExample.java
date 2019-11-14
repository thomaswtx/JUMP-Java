package com.collabera.Day24JaxbDemo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JaxbExample {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setId(100);
		customer.setName("jones");
		customer.setAge(29);
		
		/*
		try {
			File file = new File("C:\\dev\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			// output printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(customer, file);
			jaxbMarshaller.marshal(customer, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		} */
		
		try {
			File file = new File("C:\\dev\\file.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);
			
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer2 = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer2);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
