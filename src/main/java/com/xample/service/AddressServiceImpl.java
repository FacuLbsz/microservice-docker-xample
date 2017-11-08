package com.xample.service;

import java.net.InetAddress;

import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

	@Override
	public String getAddress() throws Exception {
		final String serverAddress = InetAddress.getLocalHost().getHostAddress();

		return serverAddress;
	}

}
