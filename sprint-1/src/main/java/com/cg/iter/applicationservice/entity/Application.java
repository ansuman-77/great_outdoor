package com.cg.iter.applicationservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Application {
@Id
public String Id;
public String dateOfBirth;
public String highestQualification;
public String phoneNumber;
public String marksObtained;
public String goals;
public String scheduledProgramId;
public String status;
public String dateOfInterview;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getHighestQualification() {
	return highestQualification;
}
public void setHighestQualification(String highestQualification) {
	this.highestQualification = highestQualification;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getMarksObtained() {
	return marksObtained;
}
public void setMarksObtained(String marksObtained) {
	this.marksObtained = marksObtained;
}
public String getGoals() {
	return goals;
}
public void setGoals(String goals) {
	this.goals = goals;
}
public String getScheduledProgramId() {
	return scheduledProgramId;
}
public void setScheduledProgramId(String scheduledProgramId) {
	this.scheduledProgramId = scheduledProgramId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getDateOfInterview() {
	return dateOfInterview;
}
@Override
public String toString() {
	return "Application [Id=" + Id + ", dateOfBirth=" + dateOfBirth + ", highestQualification=" + highestQualification
			+ ", phoneNumber=" + phoneNumber + ", marksObtained=" + marksObtained + ", goals=" + goals
			+ ", scheduledProgramId=" + scheduledProgramId + ", status=" + status + ", dateOfInterview="
			+ dateOfInterview + "]";
}
public void setDateOfInterview(String dateOfInterview) {
	this.dateOfInterview = dateOfInterview;
}
/**
 * 
 */
public Application() {
	super();
	// TODO Auto-generated constructor stub
}




}
