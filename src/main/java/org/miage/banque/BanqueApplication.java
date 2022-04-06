package org.miage.banque;

import lombok.extern.slf4j.Slf4j;
import org.miage.banque.boundary.CompteBancaireResource;
import org.miage.banque.entity.CompteBancaire;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class BanqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(BanqueApplication.class, args);
	}


	/*
	 * http://127.0.0.1:8083/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config
	 */
	@Bean
	public OpenAPI intervenantAPI() {
		return new OpenAPI().info(new Info()
				.title("Reservation train API")
				.version("1.0")
				.description("Documentation sommaire de API reservation train 1.0"));
	}

	@Bean
	CommandLineRunner run(CompteBancaireResource compteResource){
		return args -> {
			CompteBancaire compte1 = new CompteBancaire("1", "Valentin", 250.0);
			CompteBancaire compte2 = new CompteBancaire("2", "Chloe", 0);
			compteResource.save(compte1);
			compteResource.save(compte2);
		};
	}
}
