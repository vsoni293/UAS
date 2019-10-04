package com.cg.service;

import java.util.List;

import com.cg.entity.Application;
import com.cg.exception.ApplicationNotFoundException;

public interface ApplicationService {

	Application addApplication(Application application);
	Application getApplicationById(int application_id) throws ApplicationNotFoundException;
	List<Application> getAllApplications();
	List<Application> getByStatus(String status);
}
