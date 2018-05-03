package model;

import enumeration.AnnotationValidity;

public class Annotation {
	private String dateOfCreation;
	private boolean peakValidity;
	private String elevation;
	private String name;
	private String localizedName;
	private AnnotationValidity validity;
	
	public String getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public boolean isPeakValidity() {
		return peakValidity;
	}
	public void setPeakValidity(boolean peakValidity) {
		this.peakValidity = peakValidity;
	}
	public String getElevation() {
		return elevation;
	}
	public void setElevation(String elevation) {
		this.elevation = elevation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocalizedName() {
		return localizedName;
	}
	public void setLocalizedName(String localizedName) {
		this.localizedName = localizedName;
	}
	public AnnotationValidity getValidity() {
		return validity;
	}
	public void setValidity(AnnotationValidity validity) {
		this.validity = validity;
	}
}
