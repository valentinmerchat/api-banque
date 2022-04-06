package org.miage.banque.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CompteDelegate {

    @Autowired
    @Lazy
    RestTemplate restTemp;

    public ResponseEntity<String> appelRetirerMontant(String idClient){
        System.out.println("Appel API Banque");

        return ResponseEntity.ok().build() ;
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
