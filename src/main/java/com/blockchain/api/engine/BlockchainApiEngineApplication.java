package com.blockchain.api.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BlockchainApiEngineApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlockchainApiEngineApplication.class, args);
	}
}
