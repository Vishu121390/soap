package com.demo.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Calculator {
	String s= null;
	final int a=5;
	@WebMethod
	public int add(int a, int b) {
		return a+b;
	}
	@WebMethod
	public int sub(int a, int b) {
		return a-b;
	}

}
