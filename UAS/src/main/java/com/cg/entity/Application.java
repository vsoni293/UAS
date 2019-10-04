package com.cg.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "app_seq", sequenceName = "APPLICATION_ID")
@NamedQuery(name = "allApplications", query = "from Application")
@NamedQuery(name = "byStatus", query = "from Application where status=:st")
public class Application {
	@Id
	@Column(name = "application_id")
	@GeneratedValue(generator = "app_seq")
	private int applicationId;
	@Column(length = 20, name = "full_name")
	private String fullName;
	private Date dateOfBirth;
	@Column(length = 10, name = "highest_qualification")
	private String highestQualification;
	@Column(name ="marks_obtained")
	private double marksObtained;
	@Column(length = 20)
	private String goals;
	@Column(length = 20, name = "email_id")
	private String mailId;
	@Column(length = 5, name = "scheduled_program_id")
	private String scheduledProgramId;
	@Column(length = 10)
	private String status;
	private Date dateOfInterview;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "offered_program_id")
	private ProgramsOffered program;
	
	public Application() {
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public double getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(double marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public String getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateOfInterview() {
		return dateOfInterview;
	}

	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	
}
