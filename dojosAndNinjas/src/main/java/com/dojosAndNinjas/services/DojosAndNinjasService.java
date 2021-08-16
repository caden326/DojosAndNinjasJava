package com.dojosAndNinjas.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.dojosAndNinjas.models.DojoModel;
import com.dojosAndNinjas.models.NinjaModel;
import com.dojosAndNinjas.repositories.DojoRepository;
import com.dojosAndNinjas.repositories.NinjaRepository;

@Service
public class DojosAndNinjasService {
	
	private final DojoRepository drepo;
	private final NinjaRepository nrepo;
	

	//constructor
	public DojosAndNinjasService(DojoRepository drepo, NinjaRepository nrepo) {
		
		this.drepo = drepo;
		
		this.nrepo = nrepo;
		
	}
	
	
	//methods
	
	public List<DojoModel> findAllDojos(){
		return (List<DojoModel>)this.drepo.findAll();
	}
	
	
	public DojoModel createDojo(DojoModel d) {
		return this.drepo.save(d);
	}
	
	
	public NinjaModel createNinja(NinjaModel n) {
		return this.nrepo.save(n);
	}
	
	public DojoModel getOneDojo(Long id) {
		return this.drepo.findById(id).orElse(null);
	}

	public List<NinjaModel> findAllNinjas(){
		return (List<NinjaModel>)this.nrepo.findAll();
	}
	
	
}
