package com.cg.iter.applicationservice.service;

import java.util.List;
import java.util.Optional;

import com.cg.iter.applicationservice.entity.Application;

public interface ApplicationService {
	
	
	
	public boolean deleteById(String Id);
	public boolean addApplication(Application app);
	public boolean updateApplication(Application app);
	

}
