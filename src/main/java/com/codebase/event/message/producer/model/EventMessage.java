package com.codebase.event.message.producer.model;

import java.util.HashMap;
import java.util.Objects;

public class EventMessage extends HashMap<String, Object>{

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("{");
		sb.append("    ");
		sb.append(toIndentedString(super.toString())).append("\n");
		sb.append("}");
		return sb.toString();
	}

	
	private String toIndentedString(Object o) {
		if(o == null)
			return "null";
		return o.toString().replace("\n", "\n        ");
	}
}
