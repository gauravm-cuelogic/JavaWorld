package junitExample;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestEqualString {

	public static void main(String args[]) {

		Result rs = JUnitCore.runClasses(EqualStringExample.class);
		for (Failure failure : rs.getFailures()) {
			System.out.println(failure.toString());
		}
		
		System.out.println(rs.wasSuccessful());
	}

}