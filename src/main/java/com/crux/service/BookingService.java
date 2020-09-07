package com.crux.service;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.crux.bo.BookingServiceBO;
import com.crux.exception.CustomException;
import com.crux.model.dto.Booking;

@RestController
public class BookingService {

	@Autowired
	BookingServiceBO service;
	private static final Logger logger = Logger.getLogger(BookingService.class.getName());

	@RequestMapping(value = "/register", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView home(String requestBody, ModelAndView model) throws CustomException {
		logger.info("/register call service");
		model.setViewName("registration");
		return model;
	}

	@RequestMapping(value = "/find-driver", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView findDriver(String requestBody, ModelAndView model) throws CustomException {
		// display all the available driver based on the status in the system.
		String strModelName = "error";
		Map<String, String> mapDriver = service.getAvailableCab(requestBody);
		if (mapDriver != null) {

			model.addObject("drivers", mapDriver);
		}
		model.setViewName(strModelName);
		return model;
	}

	@RequestMapping(value = "/process-booking", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView proceedBooking(String requestBody, ModelAndView model) throws CustomException {
		// find the nearest driver and book the cab.
		// get All the availble drivers find the sortest path
		String strModelName = "error";
		Booking booking = new Booking();
		Map<String, String> mapDriver = service.getAvailableCab(requestBody);
		if (mapDriver != null) {

			model.addObject("booking", booking);
		}
		model.setViewName(strModelName);
		return model;
	}

}
