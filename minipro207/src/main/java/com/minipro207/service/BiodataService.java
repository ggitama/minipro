package com.minipro207.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minipro207.model.BiodataModel;
import com.minipro207.repository.BiodataRepository;
import com.minipro207.viewmodel.viewCariPelamar;

@Service
@Transactional
public class BiodataService {

	@Autowired
	private BiodataRepository plmr;

	public List<BiodataModel> listAll(){
		return plmr.findAll();
	}

	public List<viewCariPelamar> PlmrByName(String fullname) {
		return plmr.PlmrByName(fullname);
	}

	public String CekNama(String fullname) {
		return plmr.CekNama(fullname);
	}

	public List<viewCariPelamar> viewPelamar() {
		return plmr.viewPelamar();
	}

	public BiodataModel save(BiodataModel BiodataModel) {
		return plmr.save(BiodataModel);
	}
	
	public int updateFullname(String fullname, Long id) {
		return plmr.updateFullname(fullname, id);
	}
}
