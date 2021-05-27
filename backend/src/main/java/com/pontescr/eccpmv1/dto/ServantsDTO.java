package com.pontescr.eccpmv1.dto;

import com.pontescr.eccpmv1.entities.MaritalStatus;
import com.pontescr.eccpmv1.entities.Servants;

public class ServantsDTO {

	private Long id;
	private String nameHerOrNotMarried;
	private String nameHim;
	private String address;
	private String phoneHerOrNotMarried;
	private String phoneHim;
	private String birthHerOrNotMarried;
	private String birthHim;
	private String birthWedding;
	private String occupationHerOrNotMarried;
	private String occupationHim;
	private MaritalStatus marriedStatus;
	
	public ServantsDTO() {
		
	}

	public ServantsDTO(Long id, String nameHerOrNotMarried, String nameHim, String address, String phoneHerOrNotMarried,
			String phoneHim, String birthHerOrNotMarried, String birthHim, String birthWedding,
			String occupationHerOrNotMarried, String occupationHim, MaritalStatus marriedStatus) {
		this.id = id;
		this.nameHerOrNotMarried = nameHerOrNotMarried;
		this.nameHim = nameHim;
		this.address = address;
		this.phoneHerOrNotMarried = phoneHerOrNotMarried;
		this.phoneHim = phoneHim;
		this.birthHerOrNotMarried = birthHerOrNotMarried;
		this.birthHim = birthHim;
		this.birthWedding = birthWedding;
		this.occupationHerOrNotMarried = occupationHerOrNotMarried;
		this.occupationHim = occupationHim;
		this.marriedStatus = marriedStatus;
	}
	
	public ServantsDTO(Servants entity) {
		id = entity.getId();
		nameHerOrNotMarried = entity.getNameHerOrNotMarried();
		nameHim = entity.getNameHim();
		address = entity.getAddress();
		phoneHerOrNotMarried = entity.getPhoneHerOrNotMarried();
		phoneHim = entity.getPhoneHim();
		birthHerOrNotMarried = entity.getBirthHerOrNotMarried();
		birthHim = entity.getBirthHim();
		birthWedding = entity.getBirthWedding();
		occupationHerOrNotMarried = entity.getOccupationHerOrNotMarried();
		occupationHim = entity.getOccupationHim();
		marriedStatus = entity.getMarriedStatus();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameHerOrNotMarried() {
		return nameHerOrNotMarried;
	}

	public void setNameHerOrNotMarried(String nameHerOrNotMarried) {
		this.nameHerOrNotMarried = nameHerOrNotMarried;
	}

	public String getNameHim() {
		return nameHim;
	}

	public void setNameHim(String nameHim) {
		this.nameHim = nameHim;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneHerOrNotMarried() {
		return phoneHerOrNotMarried;
	}

	public void setPhoneHerOrNotMarried(String phoneHerOrNotMarried) {
		this.phoneHerOrNotMarried = phoneHerOrNotMarried;
	}

	public String getPhoneHim() {
		return phoneHim;
	}

	public void setPhoneHim(String phoneHim) {
		this.phoneHim = phoneHim;
	}

	public String getBirthHerOrNotMarried() {
		return birthHerOrNotMarried;
	}

	public void setBirthHerOrNotMarried(String birthHerOrNotMarried) {
		this.birthHerOrNotMarried = birthHerOrNotMarried;
	}

	public String getBirthHim() {
		return birthHim;
	}

	public void setBirthHim(String birthHim) {
		this.birthHim = birthHim;
	}

	public String getBirthWedding() {
		return birthWedding;
	}

	public void setBirthWedding(String birthWedding) {
		this.birthWedding = birthWedding;
	}

	public String getOccupationHerOrNotMarried() {
		return occupationHerOrNotMarried;
	}

	public void setOccupationHerOrNotMarried(String occupationHerOrNotMarried) {
		this.occupationHerOrNotMarried = occupationHerOrNotMarried;
	}

	public String getOccupationHim() {
		return occupationHim;
	}

	public void setOccupationHim(String occupationHim) {
		this.occupationHim = occupationHim;
	}

	public MaritalStatus getMarriedStatus() {
		return marriedStatus;
	}

	public void setMarriedStatus(MaritalStatus marriedStatus) {
		this.marriedStatus = marriedStatus;
	}

}
