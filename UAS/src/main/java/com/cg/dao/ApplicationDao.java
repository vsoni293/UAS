package com.cg.dao;

import java.util.List;

import com.cg.entity.Application;
import com.cg.exception.ApplicationNotFoundException;

public interface ApplicationDao {

	Application add(Application application);
	Application fetchById(int application_id) throws ApplicationNotFoundException;
	List<Application> fetchAll();
	List<Application> getByStatus(String status);
	Application updateStatus(int id, String status) throws ApplicationNotFoundException;
}
