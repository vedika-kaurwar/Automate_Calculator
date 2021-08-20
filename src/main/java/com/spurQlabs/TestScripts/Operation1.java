package com.spurQlabs.TestScripts;

import org.testng.annotations.Test;

import com.spurQlabs.lib.General;

public class Operation1 {

	@Test
	public void multiplication() throws Exception
	{
		//TEST CASE STEPS
		General obj=new General();
		obj.openApplication();
		obj.mul();
		obj.closeApplication();
	}
}
