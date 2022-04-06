package org.miage.banque.boundary;

import org.miage.banque.entity.CompteBancaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.ExposesResourceFor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping(value="/comptes", produces = MediaType.APPLICATION_JSON_VALUE)
@ExposesResourceFor(CompteBancaire.class)
public class CompteBancaireRepresentation {

    private final CompteBancaireResource cbr;

    @Autowired
    CompteDelegate compteDelegate;

    public CompteBancaireRepresentation(CompteBancaireResource cbr) {
        this.cbr = cbr;
    }

    @GetMapping("/{idclient}/pay")
    @Transactional
    public ResponseEntity<String> retirerMontant(@PathVariable("idclient") String idclient){
        ResponseEntity<String> reponse = compteDelegate.appelRetirerMontant(idclient);


        return reponse;
    }
}
