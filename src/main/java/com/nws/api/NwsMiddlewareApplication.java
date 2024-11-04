package com.nws.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NwsMiddlewareApplication {

	public static void main(String[] args) {
		SpringApplication.run(NwsMiddlewareApplication.class, args);
		//System.setProperty("javax.net.ssl.trustStore", "D:\\diamwallet\\keystore.jks");
		//System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
        System.out.println("---------- Trust Store Path New---- : " + System.getProperty("javax.net.ssl.trustStore"));
        System.out.println("---------- Trust Store Password New ----: " + System.getProperty("javax.net.ssl.trustStorePassword"));
		
	}

}
