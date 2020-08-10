package com.cg.iter.applicationservice.service;

import java.util.List;
import java.util.Optional;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.iter.applicationservice.entity.Application;
import com.cg.iter.applicationservice.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService {
	
	

	
	@Autowired
	ApplicationRepository repo;
	
	

	@Override
	public boolean deleteById(String Id) {
		if (Id.equals(repo.findById(Id).get().getId()) )
		{
			repo.deleteById(Id);
			return true;
		}
		else {
			return false;
		}

	}

	

	@Override
	public boolean addApplication(Application app) {
		
		if (app.equals(repo.findById(app.getId())))
		{
		
		return false;
		}
		
		
		else
		{ 
			
			repo.save(app);
			return true;
		}
	}

	@Override
	public boolean updateApplication(Application app) {
		
		if (app.equals(repo.findById(app.getId())))
		{
		
			repo.save(app);
			return true;
		}
		
		
		else
		{ 
			
			return false;
		}
	}

	

			
			
			
		
}	
		
	
		
	


