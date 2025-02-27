package com.wipro.spring_cloud_circuit_breaker_reading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@SpringBootApplication
public class SpringCloudCircuitBreakerReadingApplication {
	
	@Autowired
	  private BookService bookService;

  @GetMapping("/to-read")
  public Mono<String> toRead() {
    return bookService.readingList();
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringCloudCircuitBreakerReadingApplication.class, args);
  }
}