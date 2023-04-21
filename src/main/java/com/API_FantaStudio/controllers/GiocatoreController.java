package com.API_FantaStudio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.API_FantaStudio.models.Giocatore;
import com.API_FantaStudio.services.GiocatoreService;

@RestController
@RequestMapping("/giocatori")
public class GiocatoreController {

	@Autowired GiocatoreService giocatoreService;
	
	@GetMapping
	public ResponseEntity<List<Giocatore>> getAllUsers() {
		return new ResponseEntity<List<Giocatore>>(giocatoreService.getAllGiocatori(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Giocatore> getUserByID(@PathVariable Long id) {
		return new ResponseEntity<Giocatore>(giocatoreService.getGiocatoreByID(id), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Giocatore> createUser(@RequestBody Giocatore giocatore) {
		Giocatore g = giocatoreService.createGiocatore(giocatore);
		return new ResponseEntity<Giocatore>(g, HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Giocatore> updateUser(@RequestBody Giocatore giocatore) {
		Giocatore g = giocatoreService.createGiocatore(giocatore);
		return new ResponseEntity<Giocatore>(giocatoreService.updateGiocatore(giocatore), HttpStatus.OK);
	}
}
