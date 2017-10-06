package com.fit.track.model;

import java.util.Date;

import javax.persistence.Entity;
@Entity
public class Activity {

	public int getUSERID() {
		return USERID;
	}
	public void setUSERID(int uSERID) {
		USERID = uSERID;
	}
	public String getACTIVITYTYPE() {
		return ACTIVITYTYPE;
	}
	public void setACTIVITYTYPE(String aCTIVITYTYPE) {
		ACTIVITYTYPE = aCTIVITYTYPE;
	}
	public int getGOAL() {
		return GOAL;
	}
	public void setGOAL(int gOAL) {
		GOAL = gOAL;
	}
	public Date getDATE() {
		return DATE;
	}
	public void setDATE(Date dATE) {
		DATE = dATE;
	}
	public int getACHIEVED() {
		return ACHIEVED;
	}
	public void setACHIEVED(int aCHIEVED) {
		ACHIEVED = aCHIEVED;
	}
	int USERID;
	String ACTIVITYTYPE;
	int GOAL;
	Date DATE;
	int ACHIEVED;
	
	
}
