package com.dojosAndNinjas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosAndNinjas.models.DojoModel;
import com.dojosAndNinjas.models.NinjaModel;
import com.dojosAndNinjas.services.DojosAndNinjasService;



@Controller
public class DojoController {

	
	private final DojosAndNinjasService dnService;
	
	
	
	public DojoController(DojosAndNinjasService dnService) {
		
		this.dnService= dnService;
		
	}
	
	
	@GetMapping("/")
	public String homePage() {
		return "index.jsp";
	}
	
	//create a dojo
	@GetMapping("/new/dojo")
	public String newNinja(@ModelAttribute("dojo") DojoModel dojo, Model model) {
		
		List<DojoModel> allDojos = this.dnService.findAllDojos();
		model.addAttribute("allDojos", allDojos);
		return "newDojo.jsp";
	}
	
	
	@PostMapping("/dojo/create") 
		public String createDojo(@Valid @ModelAttribute("dojo") DojoModel dojo, BindingResult result, Model model) {
			if(result.hasErrors()) {
				List<DojoModel> allDojos = this.dnService.findAllDojos();
				model.addAttribute("allDojos", allDojos);
				return "newDojo.jsp";
			}else {
				
				this.dnService.createDojo(dojo);
				return "redirect:/info";
				
			}
	}
	
	
	//create a NInja
	
	@GetMapping("/new/ninja")
	public String newNinja(@ModelAttribute("ninja") NinjaModel ninja, Model model) {
		//pass list of all dojos to populate the dropdown
		List<DojoModel> allDojos = this.dnService.findAllDojos();
		model.addAttribute("allDojos", allDojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninja/create")
	public String createNinja(@Valid @ModelAttribute("ninja") NinjaModel ninja, BindingResult result, Model model) {

		if(result.hasErrors()) {
			List<DojoModel> allDojos = this.dnService.findAllDojos();
			model.addAttribute("allDojos", allDojos);
			return "newNinja.jsp";
		}else {
			this.dnService.createNinja(ninja);
			return "redirect:/info";
		}
		
		
		
	}
	
	@GetMapping("/info")
	public String infoPage(Model model) {
		
		List<DojoModel>allDojos = this.dnService.findAllDojos();
		
		model.addAttribute("allDojos",allDojos);
		
		List<NinjaModel>allNinjas = this.dnService.findAllNinjas();
		
		model.addAttribute("allNinjas",allNinjas);
		
		return "info.jsp";
	}
	
	
	
	
}
