package com.cg.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "sch_prog_seq", sequenceName = "SCHEDULED_PROGRAM_ID")
@Table(name = "Programs_Scheduled")
public class ProgramsScheduled {
	@Id
	@GeneratedValue(generator = "sch_prog_seq")
	@Column(name = "scheduled_program_id")
	private int scheduledProgramId;
	@Column(name = "program_name", length = 5)
	private String programName;
	@Column(length = 10)
	private String location;
	private Date startDate;
	private Date endDate;
	@Column(name = "session_per_week")
	private int sessionPerWeek;

	public ProgramsScheduled() {
	}

	public int getScheduledProgramId() {
		return scheduledProgramId;
	}

	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getSessionPerWeek() {
		return sessionPerWeek;
	}

	public void setSessionPerWeek(int sessionPerWeek) {
		this.sessionPerWeek = sessionPerWeek;
	}
	
}
