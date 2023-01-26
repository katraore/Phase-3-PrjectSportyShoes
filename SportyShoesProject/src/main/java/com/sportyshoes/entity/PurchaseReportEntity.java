package com.sportyshoes.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseReportEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int pid;
	
	@Column
	private String category;
	
	@Column
	private Date dop;

	public PurchaseReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PurchaseReportEntity(int pid, String category, Date dop) {
		super();
		this.pid = pid;
		this.category = category;
		this.dop = dop;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Date getDop() {
		return dop;
	}

	public void setDop(Date dop) {
		this.dop = dop;
	}
	
	
	


}
