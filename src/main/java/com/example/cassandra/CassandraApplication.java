package com.example.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories("com.example.cassandra.repository")
public class CassandraApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(CassandraApplication.class, args);
	}

	
}
