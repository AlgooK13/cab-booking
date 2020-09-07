package com.crux.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ApplicationError implements ErrorController {

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

	@GetMapping(value = "/error")
	public ModelAndView handleError(HttpServletRequest request, ModelAndView model) {
		model.setViewName("error");
		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		return model;
	}
}
