package com.pontescr.eccpmv1.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.pontescr.eccpmv1.entities.Team;

public class TeamDTO {

	private Long id;
	private String name;
	
	private List<ServantsDTO> servants = new ArrayList<>();
	
	public TeamDTO() {
		
	}

	public TeamDTO(Long id, String name, List<ServantsDTO> servants) {
		this.id = id;
		this.name = name;
	}
	
	public TeamDTO(Team entity) {
		id = entity.getId();
		name = entity.getName();
		servants = entity.getServants().stream().map(x -> new ServantsDTO(x)).collect(Collectors.toList());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ServantsDTO> getServants() {
		return servants;
	}

	public void setServants(List<ServantsDTO> servants) {
		this.servants = servants;
	}
	
}
