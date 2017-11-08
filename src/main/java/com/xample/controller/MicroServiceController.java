package com.xample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xample.service.AddressService;

@RestController
public class MicroServiceController {

	@Autowired
	@Qualifier("addressServiceImpl")
	private AddressService addressService;

	@GetMapping(value = "/hello")
	public String hello() throws Exception {

		return new StringBuilder().append("Hello from IP address: ").append(addressService.getAddress()).append("\n").toString();
	}

}
