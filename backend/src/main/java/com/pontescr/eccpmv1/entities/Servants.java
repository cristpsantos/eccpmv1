package com.pontescr.eccpmv1.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_servants")
public class Servants implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	public Servants() {
		
	}

	public Servants(Long id, String nameHerOrNotMarried, String nameHim, String address, String phoneHerOrNotMarried,
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servants other = (Servants) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
