package org.miage.banque.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompteBancaire implements Serializable {
    private static final long serialVersionUID = 271457141351L;

    @Id
    @Column(name = "id_compte")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String idCompte;

    @Column(name = "nom")
    private String nom;

    @Column(name = "solde")
    private double solde;


}
