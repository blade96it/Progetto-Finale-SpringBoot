package com.API_FantaStudio.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "giocatori")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Giocatore {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	private String cognome;
	private String dataNascita;
	private String piede;
	private String altezza;
	private String nazionalita;
	private String ruolo;
	private String ruoloMantra;
	private String squadra;
	private int overall;
	private String rarita;
	private String skill;
	private double fantaMedia;
	private double mediaVoto;
	private boolean espanso;
	private String card;
	private int partiteGiocate;
	private int reti;
	private int assist;
	private int cleanSheet;
	private int goalSubiti;
	private int ammonizioni;
	private int espulsioni;
	private int rigoriTirati;
	private int rigoriSegnati;
	private int rigoriRicevuti;
	private int rigoriParati;
	private int quotazione;
	
}
