package com.pontescr.eccpmv1.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.eccpmv1.dto.TeamDTO;
import com.pontescr.eccpmv1.entities.Team;
import com.pontescr.eccpmv1.repositories.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository repository;
	
	@Transactional(readOnly = true)
	public List<TeamDTO> findAll() {
		List<Team> list = repository.findAll();
		return list.stream().map(x -> new TeamDTO(x)).collect(Collectors.toList());
	}
	
}
