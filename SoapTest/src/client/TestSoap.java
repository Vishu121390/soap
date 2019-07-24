package client;

import javax.jws.soap.SOAPBinding;

import org.tempuri.Add;
import org.tempuri.Calculator;
import org.tempuri.CalculatorSoap;


public class TestSoap {

	public static void main(String[] args) {
		Calculator service=new Calculator();
		CalculatorSoap port=service.getCalculatorSoap();
		
		
		System.out.println(port.subtract(6, 8));
		
		
	}

}
