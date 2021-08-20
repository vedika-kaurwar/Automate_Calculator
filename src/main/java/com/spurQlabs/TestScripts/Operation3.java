package com.spurQlabs.TestScripts;

import org.testng.annotations.Test;

import com.spurQlabs.lib.General;

public class Operation3 {

	@Test
	public void addition() throws Exception
	{
		//TEST CASE STEPS
		General obj=new General();
		obj.openApplication();
		obj.added();
		obj.closeApplication();
	}
}
