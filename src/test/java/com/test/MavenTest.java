package com.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.Service;

public class MavenTest {
	@Test
	public void TestEmailOne() {
		Service service = new Service();
		assertTrue(service.validateEmail("anbu@gmail.com"));
	}
	
	@Test
	public void TestEmailTwo() {
		Service service = new Service();
		assertFalse(service.validateEmail("anbugmail.com"));
	}
}
