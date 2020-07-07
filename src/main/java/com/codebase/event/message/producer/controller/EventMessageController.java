package com.codebase.event.message.producer.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.cloud.client.ServiceInstance;

import com.codebase.event.message.producer.model.EventMessage;
import com.codebase.event.message.producer.model.EventRequest;
import com.codebase.event.message.producer.model.EventResponse;
import com.codebase.event.message.producer.service.EventMessageService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class EventMessageController {
	private static final Logger logger = LoggerFactory.getLogger(EventMessageController.class);

	@Autowired
	EventMessageService eventMessageService;

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "/publish-events", produces = { "application/json" }, consumes = {
			"application/json" }, method = RequestMethod.POST)
	@HystrixCommand(fallbackMethod = "getEventRequestFallBack")
	ResponseEntity<EventResponse> streaming(@javax.validation.Valid @RequestBody EventRequest eventRequest,
			@RequestHeader(value = "Content-Type", required = true) String contentType,
			@RequestHeader(value = "Accept", required = true) String accept) {
		logger.info("  EventMessageController  : streaming : EventRequest {}", eventRequest);
		return eventMessageService.streaming(eventRequest);

	}

	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
		System.out.println(">>>>>>>>>>> " + this.discoveryClient.getInstances(applicationName));
		return this.discoveryClient.getInstances(applicationName);
	}
	

	public ResponseEntity<EventResponse> getEventRequestFallBack(EventRequest  re, String str, String str2) {
		logger.info("Inside getEventRequestFallBack..... ");
		EventRequest eventRequest = new EventRequest();
		eventRequest.setEventID("101");
		eventRequest.setEventSubType("Defaut-Eagle");
		eventRequest.setEventType("Defaut-eagle-fund");
		eventRequest.setEventStartDate("06/24/2019 20:14:52");
		eventRequest.setEventEndDate("06/24/2019 20:14:52");
		eventRequest.setEventTimeZone("PST");
		eventRequest.setEventStatus("Defaut-success");
		eventRequest.setEventCategory("");
		eventRequest.setEventCode("Defaut-EVTUSB001");
		eventRequest.setEventSourceIP("Defaut-success");
		List<EventMessage> eventMessageList = fetchEventMessageFallBack();
		eventRequest.setEventMessages(eventMessageList);;
		return eventMessageService.streaming(eventRequest);
	}
	private List<EventMessage> fetchEventMessageFallBack() {
		List<EventMessage> eventMessageList = new ArrayList<EventMessage>();
		for(int i =0;  i<20; i++) {
			double d = Math.random();
		EventMessage eventMessage = new EventMessage();
		eventMessage.put("IMPORT_NAME" , "Defaut-NUVEEN SEC YIELD CHECK UPLOADER"+d);
		eventMessage.put("FEED_NAME" , "Defaut-SEC YIELD CHECK UPLOADER"+d);
		eventMessage.put("COMPLETION_DATETIME" , "06/24/2019 20:14:52 AM");
		eventMessage.put("FILE_LOCATION" , "/temp/");
		eventMessage.put("FILE_NAME" , "Defaut-temp");
		eventMessage.put("SEQUENCE" , "Defaut-loadIntoEagle");
		eventMessage.put("ENENT_ID" , "2020020369878to2020_2315");
		eventMessageList.add(eventMessage);
		}
		return eventMessageList;
		
	}

}
