package com.example.oracleDbContainer;

import org.springframework.boot.SpringApplication;

public class TestOracleDbContainerApplication {

	public static void main(String[] args) {
		SpringApplication.from(OracleDbContainerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
