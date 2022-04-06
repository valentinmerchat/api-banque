package org.miage.banque.boundary;

import org.miage.banque.entity.CompteBancaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteBancaireResource extends JpaRepository<CompteBancaire, String> {


}
