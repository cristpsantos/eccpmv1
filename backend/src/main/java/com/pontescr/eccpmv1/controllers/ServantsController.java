package com.pontescr.eccpmv1.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pontescr.eccpmv1.dto.ServantsDTO;
import com.pontescr.eccpmv1.services.ServantsService;

@RestController
@RequestMapping(value = "/servants")
public class ServantsController {

	@Autowired
	private ServantsService service;
	
	@GetMapping
	public ResponseEntity<List<ServantsDTO>> findAll(){
		List<ServantsDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
