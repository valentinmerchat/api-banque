# api-banque

## Descriptif

Cette API va communiquer avec l'API qui nous sert à faire des réservations de trajets entre deux villes.

## Entite

Compte: 
-idCompte : identifiant du compte
-nom : nom du détenteur du compte
-solde : argent présent sur le compte bancaire du détenteur

## Donnees 

J'utilise également une base de donnée H2 pour se service là afin de stocker les comptes bancaires des utilisateurs.
En effet, le solde du compte nous permettra de dire si la transaction peut ou ne pas être effectuée.
Elle renverra ensuite une réponse à notre service de réservation.


## Les chemins

- **/{reservationId}/pay** : Pour le moment, cette méthode envoi un message dans la console afin de voir si la communication se fait entre les deux API.
