package com.crux.bo.impl;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.crux.bo.BookingServiceBO;

@Component
public class BookingServiceBOImpl implements BookingServiceBO {
	private static final Logger logger = Logger.getLogger(BookingServiceBOImpl.class.getName());

	@Override
	public Map<String, String> getAvailableCab(String requestBody) {
		// TODO Auto-generated method stub
		logger.info("BookingServiceBOImpl:getAvailableCab");
		return null;
	}

}
