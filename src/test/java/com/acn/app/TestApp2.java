package com.acn.app;

import junit.framework.Assert;
import org.junit.Test;

public class TestApp2 {

	@Test
	public void testPrintHelloWorld2() {

		Assert.assertEquals(App.getHelloWorld2(), "Hello World 2");

	}

}