package com.fit.track.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Activity {
	private  @Id @GeneratedValue int USERID;
	private String ACTIVITYTYPE;
	private int GOAL;
	private Date DATE;
	private int ACHIEVED;
	
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
	
	
}
