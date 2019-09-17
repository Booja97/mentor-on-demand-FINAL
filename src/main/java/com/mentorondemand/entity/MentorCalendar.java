package com.mentorondemand.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="mentor_calendar")
public class MentorCalendar {
	@Column(name="id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="mentor_id")
	private long mentorId;
	
	@Column(name="start_time")
	private String startTime;
	
	@Column(name="course")
	private String course;
	
	
	
	@Column(name="end_time")
	private String endTime;
	
	
	@Column(name="start_date")
	private String startDate;
	
	@Column(name="end_date")
	private String endDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public MentorCalendar(long id, long mentorId, String startTime, String course, String endTime, String startDate,
			String endDate) {
		super();
		this.id = id;
		this.mentorId = mentorId;
		this.startTime = startTime;
		this.course = course;
		this.endTime = endTime;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	
	
}
