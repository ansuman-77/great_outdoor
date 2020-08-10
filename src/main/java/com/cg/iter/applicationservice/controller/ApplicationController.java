package com.cg.iter.applicationservice.controller;

import java.util.List;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.iter.applicationservice.entity.Application;

import com.cg.iter.applicationservice.service.ApplicationService;

@RestController
@RequestMapping("/application")
public class ApplicationController {
	
	
	
	@Autowired
	ApplicationService service;

	
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public boolean addUser(@RequestBody Application app )
	{
		if(app==null||app.dateOfInterview==null||app.goals==null||app.scheduledProgramId==null || app.status==null || app.marksObtained==null ||app.Id==null||app.phoneNumber==null||app.dateOfBirth==null ) 
	{ 
		
		return false;
		
	}
		boolean result=service.addApplication(app);
		return result;
		

		
	}
	
	
	
	@RequestMapping(value="/updateapp",method=RequestMethod.POST)
	public boolean updateApplication(@RequestBody Application app)
	{
		if(app==null||app.dateOfInterview==null||app.goals==null||app.scheduledProgramId==null || app.status==null || app.marksObtained==null ||app.Id==null||app.phoneNumber==null||app.dateOfBirth==null ) 
		{ 
			return false;
		}
		boolean result =service.updateApplication(app);
		return true;
		
	}
	
	@RequestMapping(value="/deleteappbyid",method=RequestMethod.POST)
	public boolean deleteAppById(@RequestParam("id") String Id)
	{
		if(Id==null)
		{
			return false;
			
		}
		boolean result = service.deleteById(Id);
		return result;
		
	}
	
	
	

}
