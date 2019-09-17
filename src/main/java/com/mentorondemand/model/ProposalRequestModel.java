package com.mentorondemand.model;

public class ProposalRequestModel {

	private long proposalId;

	private long userId;

	private long mentorId;

	private long technologyId;
	private String Status;

	public ProposalRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProposalRequestModel(long userId, long mentorId, long technologyId, String status) {
		super();

		this.userId = userId;
		this.mentorId = mentorId;
		this.technologyId = technologyId;
		Status = status;
	}

	public long getProposalId() {
		return proposalId;
	}

	public void setProposalId(long proposalId) {
		this.proposalId = proposalId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	public long getTechnologyId() {
		return technologyId;
	}

	public void setTechnologyId(long technologyId) {
		this.technologyId = technologyId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
