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

public class Product8 {
	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int id;
	
	private String reserve_id;
	
	
	
	private String start_date;
	
	private String end_date;
	
	private String date_time;
	

	private String asset_type;
	
	
	private String quntity;
	
	private String type;
	
	private String req_reason;
	
	
	private String status;
	
	

	public String getStatus() {
		return status;
	}









	public void setStatus(String status) {
		this.status = status;
	}









	public Product8() {
		
	}

	
	
	
	
	
	

	
	public String getReq_reason() {
		return req_reason;
	}









	public void setReq_reason(String req_reason) {
		this.req_reason = req_reason;
	}









	public int getId() {
		return id;
	}











	public void setId(int id) {
		this.id = id;
	}











	public String getReserve_id() {
		return reserve_id;
	}











	public void setReserve_id(String reserve_id) {
		this.reserve_id = reserve_id;
	}











	public String getStart_date() {
		return start_date;
	}











	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}











	public String getEnd_date() {
		return end_date;
	}











	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}











	public String getDate_time() {
		return date_time;
	}











	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}











	public String getAsset_type() {
		return asset_type;
	}











	public void setAsset_type(String asset_type) {
		this.asset_type = asset_type;
	}











	public String getQuntity() {
		return quntity;
	}











	public void setQuntity(String quntity) {
		this.quntity = quntity;
	}











	public String getType() {
		return type;
	}











	public void setType(String type) {
		this.type = type;
	}


}

