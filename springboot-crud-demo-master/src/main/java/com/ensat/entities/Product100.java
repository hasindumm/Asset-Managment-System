package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;



/**
 * Product6 entity.
 */
@Entity

public class Product100 {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	

	
	
	
	private String title;
	
	private String news;
	
	
	

	



	public Product100() {
		
	}








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








	public String getNews() {
		return news;
	}








	public void setNews(String news) {
		this.news = news;
	}

	
	


}


