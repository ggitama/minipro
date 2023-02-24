package com.minipro207.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.minipro207.model.PendidikanModel;
import com.minipro207.repository.PendidikanRepository;

@Service
@Transactional
public class PendidikanService {
	@Autowired
	private PendidikanRepository pdr;
	
	public List<PendidikanModel> listAll(){
		return pdr.findAll(Sort.by("id").ascending());
	}
	
}
