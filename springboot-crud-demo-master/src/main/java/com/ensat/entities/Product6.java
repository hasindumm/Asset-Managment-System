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

public class Product6 {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	
	private String type;
	
	
	private String service_provider;
	
	
	private String date;
	

	private String asset_type;
	
	
	private String payment;
	
	
	private String description;
	

	private String attachment;
	
	
	
	
	
	
	

	
	public Product6() {
		
	}









	public int getId() {
		return id;
	}









	public void setId(int id) {
		this.id = id;
	}









	public String getType() {
		return type;
	}









	public void setType(String type) {
		this.type = type;
	}









	public String getService_provider() {
		return service_provider;
	}









	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}









	public String getDate() {
		return date;
	}









	public void setDate(String date) {
		this.date = date;
	}









	public String getAsset_type() {
		return asset_type;
	}









	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}









	public String getPayment() {
		return payment;
	}









	public void setPayment(String payment) {
		this.payment = payment;
	}









	public String getDescription() {
		return description;
	}









	public void setDescription(String description) {
		this.description = description;
	}









	public String getAttachment() {
		return attachment;
	}









	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}



	



}

