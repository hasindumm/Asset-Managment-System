package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;



/**
 * Product entity.
 */
@Entity

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	
	private String product_key;
	
	
	private String service_provider;
	
	
	private String date_purchased;
	

	private String warranty;
	
	
	private String status;
	
	
	private String value;
	

	private String software;
	
	
	private String funded_by;
	
	
	private String purchased_details;
	

	
	public Product() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getProduct_key() {
		return product_key;
	}



	public void setProduct_key(String product_key) {
		this.product_key = product_key;
	}



	public String getService_provider() {
		return service_provider;
	}



	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}



	public String getDate_purchased() {
		return date_purchased;
	}



	public void setDate_purchased(String date_purchased) {
		this.date_purchased = date_purchased;
	}



	public String getWarranty() {
		return warranty;
	}



	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public String getValue() {
		return value;
	}



	public void setValue(String value) {
		this.value = value;
	}



	public String getSoftware() {
		return software;
	}



	public void setSoftware(String software) {
		this.software = software;
	}



	public String getFunded_by() {
		return funded_by;
	}



	public void setFunded_by(String funded_by) {
		this.funded_by = funded_by;
	}



	public String getPurchased_details() {
		return purchased_details;
	}



	public void setPurchased_details(String purchased_details) {
		this.purchased_details = purchased_details;
	}



}
