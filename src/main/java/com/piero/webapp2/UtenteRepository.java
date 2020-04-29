package com.piero.webapp2;


import org.springframework.data.repository.CrudRepository;

import com.piero.webapp2.Utente;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UtenteRepository extends CrudRepository<Utente, Integer> {

}