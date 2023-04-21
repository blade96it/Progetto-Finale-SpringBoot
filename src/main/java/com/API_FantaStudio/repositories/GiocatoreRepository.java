package com.API_FantaStudio.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.API_FantaStudio.models.Giocatore;

@Repository
public interface GiocatoreRepository extends CrudRepository<Giocatore, Long> {

}
