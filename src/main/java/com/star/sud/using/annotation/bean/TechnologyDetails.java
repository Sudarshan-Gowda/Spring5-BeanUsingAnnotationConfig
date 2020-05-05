package com.star.sud.using.annotation.bean;

public class TechnologyDetails {

	// Properties
	///////////////
	private int techId;

	private String techName;

	private String techDescription;

	// Constructors
	///////////////////
	/**
	 * @param techId
	 * @param techName
	 * @param techDescription
	 */
	public TechnologyDetails(int techId, String techName, String techDescription) {
		super();
		this.techId = techId;
		this.techName = techName;
		this.techDescription = techDescription;
	}

	public TechnologyDetails() {
		super();
	}

	@Override
	public String toString() {
		return "TechnologyDetails [techId=" + techId + ", techName=" + techName + ", techDescription=" + techDescription
				+ "]";
	}

	// Properties
	////////////////
	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getTechDescription() {
		return techDescription;
	}

	public void setTechDescription(String techDescription) {
		this.techDescription = techDescription;
	}
}
