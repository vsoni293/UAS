package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.entity.Application;
import com.cg.exception.ApplicationNotFoundException;

@Repository
public class ApplicationDaoImpl implements ApplicationDao {

	@Autowired
	EntityManager mgr;
	
	@Override
	public Application add(Application application) {
		mgr.persist(application);
		return application;
	}
	
	@Override
	public Application fetchById(int application_id) throws ApplicationNotFoundException{
		Application a = mgr.find(Application.class, application_id);
		if(a==null)
			throw new ApplicationNotFoundException("Invalid application id provided: "+application_id);
		return a;
	}
	@Override
	public List<Application> fetchAll() {
		return mgr.createNamedQuery("allApplications").getResultList();
	}


	@Override
	public List<Application> getByStatus(String status) {
		return mgr.createNamedQuery("byStatus").setParameter("st", status).getResultList();
	}


	@Override
	public Application updateStatus(int id, String status) throws ApplicationNotFoundException {
		Application a = mgr.find(Application.class, id);
		if(a==null)
			throw new ApplicationNotFoundException("Invalid application id provided: " + id);
		
		a.setStatus(status);
		return mgr.merge(a);
	}

}
