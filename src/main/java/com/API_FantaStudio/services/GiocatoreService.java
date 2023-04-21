package com.API_FantaStudio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.API_FantaStudio.models.Giocatore;
import com.API_FantaStudio.repositories.GiocatoreRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class GiocatoreService {
	
	@Autowired GiocatoreRepository giocatoreRepo;
	
	public Giocatore createGiocatore(Giocatore giocatore) {
		giocatoreRepo.save(giocatore);
		return giocatore;
	}
	
	public List<Giocatore> getAllGiocatori() {
		return (List<Giocatore>) giocatoreRepo.findAll();
	}
	
	public Giocatore getGiocatoreByID(Long id) {
		if(!giocatoreRepo.existsById(id)) {
			throw new EntityNotFoundException("Il giocatore non esiste!");
		}
		return giocatoreRepo.findById(id).get();
	}
	
	public Giocatore updateGiocatore(Giocatore giocatore) {
		if(!giocatoreRepo.existsById(giocatore.getId())) {
			throw new EntityNotFoundException("Il giocatore non esiste!");
		}
		return giocatoreRepo.save(giocatore);
	}

}
