package com.helloworld.controller;

import com.helloworld.model.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/")
	public ResponseEntity<String> getGreeting() {
		return ResponseEntity.ok("Hello!");
	}

	@GetMapping("/")
	public ResponseEntity<HealthCheck> getHealthz() {
		DiskSpace diskSpace = new DiskSpace(73492478499L, 4739247249L, 4302948L);
		HealthCheck healthCheck = new HealthCheck("OK", "0.0.1", "up since 2020-08-04 08:00:05", diskSpace);
		return ResponseEntity.ok(healthCheck);
	}
}
