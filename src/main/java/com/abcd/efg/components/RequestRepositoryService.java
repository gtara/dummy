package com.abcd.efg.components;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component
public class RequestRepositoryService implements RequestRepository{

	@Override
	public List<Request> findRequests(String username) {
		
		return new ArrayList<Request>();
	}

}
