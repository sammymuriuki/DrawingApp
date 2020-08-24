package com.generalstores;

public class HelloWorld {
	private String message;
	public void setMessage(String message) {
		this.message = message;
	}
	public void getMessage() {
		System.out.println("Here is your message: "+this.message);
	}
}
