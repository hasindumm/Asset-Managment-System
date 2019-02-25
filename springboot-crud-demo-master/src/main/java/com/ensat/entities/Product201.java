package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;



/**
 * Product1 entity.
 */
@Entity

public class Product201 {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	
	private String title;
	
	
	private String date;
	

	private String body;
	
	
	
	
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}








	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}




	public String getBody() {
		return body;
	}




	public void setBody(String body) {
		this.body = body;
	}




	public Product201() {
		
	}




	


}

