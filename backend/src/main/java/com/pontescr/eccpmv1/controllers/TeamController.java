package com.pontescr.eccpmv1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.eccpmv1.dto.TeamDTO;
import com.pontescr.eccpmv1.services.TeamService;

@RestController
@RequestMapping(value="/teams")
public class TeamController {

	@Autowired
	private TeamService service;
	
	@GetMapping
	public ResponseEntity<List<TeamDTO>> findAll(){
		List<TeamDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
