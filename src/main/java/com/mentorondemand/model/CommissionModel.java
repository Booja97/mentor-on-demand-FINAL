package com.mentorondemand.model;

public class CommissionModel {

	private long id;

	private int commissionPercentage;

	public CommissionModel() {
	}

	public CommissionModel(int commissionPercentage) {
		super();

		this.commissionPercentage = commissionPercentage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getCommissionPercentage() {
		return commissionPercentage;
	}

	public void setCommissionPercentage(int commissionPercentage) {
		this.commissionPercentage = commissionPercentage;
	}

}
