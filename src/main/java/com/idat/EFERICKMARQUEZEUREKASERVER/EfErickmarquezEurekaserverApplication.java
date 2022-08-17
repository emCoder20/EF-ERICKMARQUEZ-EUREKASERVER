package com.idat.EFERICKMARQUEZEUREKASERVER;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EfErickmarquezEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfErickmarquezEurekaserverApplication.class, args);
	}

}
