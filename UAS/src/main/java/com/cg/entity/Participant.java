package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "part_seq", sequenceName = "PARTICIPANT_SEQ")
public class Participant {
	@Id
	@Column(name = "participant_id")
	@GeneratedValue(generator = "part_seq")
	private int participantId;
	@Column(name="roll_no", length = 5)
	private String rollNo;
	@Column(name="email_id", length = 20)
	private String emailId;
	private int applicationId;
	@Column(name="scheduled_program_id", length = 5)
	private String scheduledProgramId;

	public Participant() {
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public String getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(String scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	
}
