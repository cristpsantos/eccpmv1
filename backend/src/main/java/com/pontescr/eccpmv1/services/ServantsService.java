package com.pontescr.eccpmv1.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pontescr.eccpmv1.dto.ServantsDTO;
import com.pontescr.eccpmv1.entities.Servants;
import com.pontescr.eccpmv1.repositories.ServantsRepository;

@Service
public class ServantsService {
	
	
	@Autowired
	private ServantsRepository repository;

	@Transactional(readOnly = true)
	public List<ServantsDTO> findAll(){
		List<Servants> list = repository.findAll();
		return list.stream().map(x -> new ServantsDTO(x)).collect(Collectors.toList());
	}
}
