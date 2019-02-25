package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;



/**
 * Product4 entity.
 */
@Entity

public class Product4 {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	
	private String serial_no;
	
	
	private String service_provider;
	
	
	private String date_purchased;
	

	private String warranty;
	
	
	private String status;
	
	
	private String value;
	

	private String attachment;
	
	
	private String funded_by;
	
	
	private String purchased_details;
	
	private String license_no;
	
	
	private String driver_detail;
	
	private String model;
	
	
	

	
	public Product4() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSerial_no() {
		return serial_no;
	}



	public void setSerial_no(String serial_no) {
		this.serial_no = serial_no;
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



	public String getAttachment() {
		return attachment;
	}



	public void setAttachment(String attachment) {
		this.attachment = attachment;
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
	
	public String getLicense_no() {
		return license_no;
	}



	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

	
	
	public String getDriver_detail() {
		return driver_detail;
	}



	public void setDriver_detail(String driver_detail) {
		this.driver_detail = driver_detail;
	}
	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}




}
