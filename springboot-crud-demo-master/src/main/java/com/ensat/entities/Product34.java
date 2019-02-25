package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;



/**
 * Product3 entity.
 */
@Entity

public class Product34 {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	
	private String url;
	
	
	private String title;

	
	public String getTitle() {
		return title;
	}





	public void setTitle(String title) {
		this.title = title;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getUrl() {
		return url;
	}





	public void setUrl(String url) {
		this.url = url;
	}





	public Product34() {
		
	}




}
