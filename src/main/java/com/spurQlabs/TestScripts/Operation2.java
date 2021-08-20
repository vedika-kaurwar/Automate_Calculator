package com.spurQlabs.TestScripts;

import org.testng.annotations.Test;

import com.spurQlabs.lib.General;

public class Operation2 {

	@Test
	public void division() throws Exception
	{
		//TEST CASE STEPS
		General obj=new General();
		obj.openApplication();
		obj.div();
		obj.closeApplication();
	}

}
