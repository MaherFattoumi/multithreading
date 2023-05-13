package com.mf.multithreading.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.mf.multithreading.MyThread;

public class MultithreadingTest {
	
	@Test
	public void testThreadCreation() {
	   Thread t = new Thread(new MyThread("myThread"));
	   assertNotNull(t);
	}

}
