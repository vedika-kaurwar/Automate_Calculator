package com.spurQlabs.TestScripts;

import org.testng.annotations.Test;

import com.spurQlabs.lib.General;

public class Operation4 {

	@Test
	public void subtraction() throws Exception
	{
		//TEST CASE STEPS
		General obj=new General();
		obj.openApplication();
		obj.subtract();
		obj.closeApplication();
	}

}
