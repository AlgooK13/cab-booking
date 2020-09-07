package com.crux.bo;

import java.util.Map;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public interface BookingServiceBO {
	
	public Map<String, String> getAvailableCab(String requestBody);
	
}
