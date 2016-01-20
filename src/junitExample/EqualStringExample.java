package junitExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class EqualStringExample {

	@Test
	public void testadd(){
		
		String str = " My name is Gaurav ";
		assertEquals(" My name is Gaurav ",str);
	}
	
	
}
