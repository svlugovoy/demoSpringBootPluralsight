package com.svlugovoy;

import com.svlugovoy.controller.HomeController;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

	@Test
	public void homeTest() {
		HomeController hc = new HomeController();
		assertEquals("Hello world!!!", hc.home());
	}

}
