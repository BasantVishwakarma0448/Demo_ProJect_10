package com.rays.common;

import java.util.HashMap;
import java.util.Map;

public class ORSResponse {

	private static String DATA = "data";
	private static String INPUT_ERROR = "inputerror";
	private static String MESSAGE = "message";

	private boolean success = false;
	private Map<String, Object> result = new HashMap<String, Object>();

	public ORSResponse() {
		// TODO Auto-generated constructor stub
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public void addResult(String key, Object value) {
		result.put(key, value);
	}

	public void addData(Object value) {
		result.put(DATA, value);
	}

	public void addMessage(Object value) {
		result.put(MESSAGE, value);
	}

	public void addInputErrors(Object value) {
		result.put(INPUT_ERROR, value);
	}

	public ORSResponse(boolean success, String message) {
		this.success = success;
		addMessage(message);
	}

	public ORSResponse(boolean success, String message, Object value) {
		this.success = success;
		addResult(message, value);
		addData(value);
	}

	public ORSResponse(boolean success) {
		// TODO Auto-generated constructor stub
		this.success = success;
	}
}
