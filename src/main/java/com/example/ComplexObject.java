package com.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ComplexObject {
	private Map adminEmails;
	private List someList;
	private Map someMap;
	private Set someSet;
	
	public Map getAdminEmails() {
		return adminEmails;
	}
	public void setAdminEmails(Map adminEmails) {
		this.adminEmails = adminEmails;
	}
	
	public List getSomeList() {
		return someList;
	}
	public void setSomeList(List someList) {
		this.someList = someList;
	}
	@Override
	public String toString() {
		return "ComplexObject [adminEmails=" + adminEmails + ", someList=" + someList + ", someMap=" + someMap
				+ ", someSet=" + someSet + "]";
	}
	public Map getSomeMap() {
		return someMap;
	}
	public void setSomeMap(Map someMap) {
		this.someMap = someMap;
	}
	public Set getSomeSet() {
		return someSet;
	}
	public void setSomeSet(Set someSet) {
		this.someSet = someSet;
	}
	
}
