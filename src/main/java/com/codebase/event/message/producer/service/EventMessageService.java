package com.codebase.event.message.producer.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.codebase.event.message.producer.model.EventMessage;
import com.codebase.event.message.producer.model.EventRequest;
import com.codebase.event.message.producer.model.EventResponse;

@Service
public class EventMessageService {

	public ResponseEntity<EventResponse> streaming(EventRequest eventRequest) {
		
		/*
		 * for(EventMessage eventMessage : eventRequest.getEventMessages()) {
		 * System.out.println("EventMessage "+eventMessage); 
		 * }
		 */
		
		
		return null;
	}

}
