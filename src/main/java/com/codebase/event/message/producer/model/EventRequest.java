package com.codebase.event.message.producer.model;

import java.util.List;
import java.util.Objects;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventRequest {
	
	@JsonProperty("eventID")
	private String eventID;
	
	@JsonProperty("eventProvider")
	private String eventProvider;
	
	@JsonProperty("eventType")
	private String eventType;
	
	@JsonProperty("eventSubType")
	private String eventSubType;
	
	
	@JsonProperty("eventStartDate")
	private String eventStartDate;
	
	@JsonProperty("eventEndDate")
	private String eventEndDate;
	
	@JsonProperty("eventTimeZone")
	private String eventTimeZone;
	
	@JsonProperty("eventStatus")
	private String eventStatus;
	
	@JsonProperty("eventCategory")
	private String eventCategory;
	
	@JsonProperty("eventCode")
	private String eventCode;
	
	@JsonProperty("eventSourceIP")
	private String eventSourceIP;
	
	@JsonProperty("eventMessages")
	@Valid
	private List<EventMessage> eventMessages;

	public String getEventID() {
		return eventID;
	}

	public void setEventID(String eventID) {
		this.eventID = eventID;
	}

	public String getEventProvider() {
		return eventProvider;
	}

	public void setEventProvider(String eventProvider) {
		this.eventProvider = eventProvider;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getEventSubType() {
		return eventSubType;
	}

	public void setEventSubType(String eventSubType) {
		this.eventSubType = eventSubType;
	}

	public String getEventStartDate() {
		return eventStartDate;
	}

	public void setEventStartDate(String eventStartDate) {
		this.eventStartDate = eventStartDate;
	}

	public String getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(String eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public String getEventTimeZone() {
		return eventTimeZone;
	}

	public void setEventTimeZone(String eventTimeZone) {
		this.eventTimeZone = eventTimeZone;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventSourceIP() {
		return eventSourceIP;
	}

	public void setEventSourceIP(String eventSourceIP) {
		this.eventSourceIP = eventSourceIP;
	}

	public List<EventMessage> getEventMessages() {
		return eventMessages;
	}

	public void setEventMessages(List<EventMessage> eventMessages) {
		this.eventMessages = eventMessages;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EventRequest \n");
		sb.append("{");
		sb.append("    eventID: ").append(toIndentedString(eventID)).append("\n");
		sb.append("    eventProvider: ").append(toIndentedString(eventProvider)).append("\n");
		sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
		sb.append("    eventSubType: ").append(toIndentedString(eventSubType)).append("\n");
		sb.append("    eventStartDate: ").append(toIndentedString(eventStartDate)).append("\n");
		sb.append("    eventEndDate: ").append(toIndentedString(eventEndDate)).append("\n");
		sb.append("    eventTimeZone: ").append(toIndentedString(eventTimeZone)).append("\n");
		sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
		sb.append("    eventCategory: ").append(toIndentedString(eventCategory)).append("\n");
		sb.append("    eventCode: ").append(toIndentedString(eventCode)).append("\n");
		sb.append("    eventSourceIP: ").append(toIndentedString(eventSourceIP)).append("\n");
		sb.append("    eventMessages: ").append(toIndentedString(eventMessages)).append("\n");
		sb.append("}");
		return sb.toString();

	}
	
	private String toIndentedString(Object o) {
		if(o == null)
			return "null";
		return o.toString().replace("\n", "\n    ");
	}

	@Override
	public int hashCode() {
return Objects.hash(eventID,eventProvider,eventType, eventSubType, eventStartDate, eventEndDate, eventTimeZone, eventStatus,eventCategory, eventCode, eventSourceIP, eventMessages);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		EventRequest eventRequesther = (EventRequest) obj;
		return Objects.equals(this.eventID, eventRequesther.eventID) && 
				Objects.equals(this.eventProvider, eventRequesther.eventProvider) && 
				Objects.equals(this.eventType, eventRequesther.eventType) && 
				Objects.equals(this.eventSubType, eventRequesther.eventSubType) && 
				Objects.equals(this.eventStartDate, eventRequesther.eventStartDate) && 
				Objects.equals(this.eventEndDate, eventRequesther.eventEndDate) && 
				Objects.equals(this.eventTimeZone, eventRequesther.eventTimeZone) && 
				Objects.equals(this.eventStatus, eventRequesther.eventStatus) && 
				Objects.equals(this.eventCategory, eventRequesther.eventCategory) && 
				Objects.equals(this.eventCode, eventRequesther.eventCode) && 
				Objects.equals(this.eventSourceIP, eventRequesther.eventSourceIP) && 
				Objects.equals(this.eventMessages, eventRequesther.eventMessages); 
	}

	public EventRequest() {
		super();
	}

	
}
