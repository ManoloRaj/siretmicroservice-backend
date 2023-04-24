package com.siretmicroservice.siretmicroservicebackend;

import com.siretmicroservice.siretmicroservicebackend.model.Etablissement;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Properties;

@SpringBootApplication
public class SiretmicroserviceBackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(SiretmicroserviceBackendApplication.class, args);
	}

}
