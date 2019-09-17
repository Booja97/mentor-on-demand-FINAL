package com.mentorondemand.model;

public class PaymentHistoryModel {

	private long paymentId;

	private long userId;

	private long skillId;

	private String paymentAmount;

	public PaymentHistoryModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentHistoryModel(long userId, long skillId, String paymentAmount) {
		super();
		this.userId = userId;
		this.skillId = skillId;
		this.paymentAmount = paymentAmount;
	}

	public long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	@Override
	public String toString() {
		return "PaymentHistory [paymentId=" + paymentId + ", userId=" + userId + ", skillId=" + skillId
				+ ", paymentAmount=" + paymentAmount + "]";
	}

}
