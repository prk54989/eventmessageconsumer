package com.codebase.event.message.producer.model;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Validated
public class EventResponse {
	@JsonProperty("transactionId")
	private String transactionId = null;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transactionId == null) ? 0 : transactionId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventResponse other = (EventResponse) obj;
		if (transactionId == null) {
			if (other.transactionId != null)
				return false;
		} else if (!transactionId.equals(other.transactionId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EventResponse [transactionId=" + transactionId + "]";
	}

	public EventResponse(String transactionId) {
		super();
		this.transactionId = transactionId;
	}
	
	public EventResponse transactionId(String transactionId) {
		this.transactionId = transactionId;
		return this;
	}
	
	

}
