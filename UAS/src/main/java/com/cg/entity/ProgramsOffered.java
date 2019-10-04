package com.cg.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "offer_prog_seq", sequenceName = "OFFERED_PROGRAM_ID")
@Table(name = "Programs_Offered")
public class ProgramsOffered {
	@Id
	@GeneratedValue(generator = "offer_prog_seq")
	@Column(name = "offered_program_id")
	private int offeredProgramId;
	@Column(name = "program_name", length = 5)
	private String programName;
	@Column(length = 20)
	private String description;
	@Column(name = "applicant_eligibility", length = 40)
	private String applicantEligibility;
	private int duration;
	@Column(name = "degree_certificate_offered", length = 10)
	private String degreeCertificateOffered;
	
	@OneToMany(mappedBy = "program", cascade = CascadeType.ALL
			,fetch=FetchType.EAGER)
	Set<Application> applications = new HashSet<Application>();
	
	public ProgramsOffered() {
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplicantEligibility() {
		return applicantEligibility;
	}

	public void setApplicantEligibility(String applicantEligibility) {
		this.applicantEligibility = applicantEligibility;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}

	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	
}
