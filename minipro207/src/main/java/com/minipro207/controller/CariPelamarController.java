package com.minipro207.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.minipro207.model.BiodataModel;
import com.minipro207.service.BiodataService;
import com.minipro207.viewmodel.viewCariPelamar;

@Controller
public class CariPelamarController {
	@Autowired
	private BiodataService plmrs;

	@RequestMapping("/pelamar")
	public String pelamar() {

		return "Caripelamar/pelamar";
	}

	@RequestMapping("/pelamarlist")
	public String pelamarlist(Model model) {
		return "Caripelamar/pelamarlist";
	}

	// searching
	@RequestMapping("/pelamarlistbynama/{fullname}")
	public String PlmrByName(@PathVariable(name = "fullname") String fullname, Model model) {
		String namalower = fullname.toLowerCase();
		List<viewCariPelamar> pelamarlist = plmrs.PlmrByName(namalower);
		model.addAttribute("pelamarlist", pelamarlist);
		return "Caripelamar/pelamarlist";
	}

	@RequestMapping("/detailpelamar/{biodataId}")
	public String detailpelamar(@PathVariable(name = "biodataId") Long biodataId, Model model) {
		List<BiodataModel> pelamarlist = plmrs.listAll();
		model.addAttribute("biodataId", biodataId);
		model.addAttribute("pelamarlist", pelamarlist);
		return "Caripelamar/detailpelamar";
	}

}
