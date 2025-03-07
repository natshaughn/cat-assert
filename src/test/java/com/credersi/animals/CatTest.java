package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	@Test 
	public void testJelly() {
		assert(true);
	}
	@Test
	public void testFeeding() {
		Cat cat = new Cat();
		cat.feeds();
		assertEquals(cat.howHungry(), 30);
		
	}
	@Test 
	public void testRunning() {
		Cat cat = new Cat();
		cat.runs();
		assertEquals(cat.howHungry(), 80);
	}
	@Test 
	public void testOverFeeding() {
		Cat cat = new Cat();
		cat.feeds();
		cat.feeds();
		cat.feeds();
		assertEquals(cat.howHungry(), 0);
	}
	@Test
	public void testFeedAndRun() {
		Cat cat = new Cat();
		cat.feeds();
		cat.runs();
		assertEquals(cat.howHungry(), 60);	
	}
	@Test 
	public void testRunTwice() {
		Cat cat = new Cat();
		cat.runs();
		cat.runs();
		assertEquals(cat.howHungry(), 110);
		assertTrue(cat.isAlive() == false);
	}
	@Test 
	public void testRunThreeTimes() {
		Cat cat = new Cat();
		for (int i = 0; i < 3; i++) {
			cat.runs();
		}
		assertEquals(cat.howHungry(), 140);
		assertTrue(cat.isAlive() == false);
	}
	@Test 
	public void testEachFunctionTenTImes() {
		Cat cat = new Cat();
		for (int i = 0; i < 10; i++) {
			cat.runs();
			cat.feeds();
		}
		assertTrue(!cat.isAlive());
	}
}