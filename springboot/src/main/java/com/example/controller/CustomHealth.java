package com.example.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator {

	@Override
	public Health health() {
		
		Builder builder = Health.up();
		builder.withDetail("Key", "value");
		return builder.build();
	}

}
