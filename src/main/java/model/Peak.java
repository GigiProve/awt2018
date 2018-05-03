package model;

import java.util.ArrayList;

public class Peak {
	private String latitude;
	private String longitude;
	private String altitude;
	private String name;
	private ArrayList<String> localizedName;
	private String provenance;
	private boolean toBeAnnotated;
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<String> getLocalizedName() {
		return localizedName;
	}
	public void setLocalizedName(ArrayList<String> localizedName) {
		this.localizedName = localizedName;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public boolean isToBeAnnotated() {
		return toBeAnnotated;
	}
	public void setToBeAnnotated(boolean toBeAnnotated) {
		this.toBeAnnotated = toBeAnnotated;
	}	
}
