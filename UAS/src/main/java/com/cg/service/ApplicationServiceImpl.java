package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.dao.ApplicationDao;
import com.cg.entity.Application;
import com.cg.exception.ApplicationNotFoundException;

public class ApplicationServiceImpl implements ApplicationService {

	@Autowired
	ApplicationDao dao;
	
	@Override
	public Application addApplication(Application application) {
		return dao.add(application);
	}
	@Override
	public Application getApplicationById(int application_id) throws ApplicationNotFoundException {
		return dao.fetchById(application_id);
	}
	
	@Override
	public List<Application> getAllApplications() {
		return dao.fetchAll();
	}

	@Override
	public List<Application> getByStatus(String status) {
		return dao.getByStatus(status);
	}

}
