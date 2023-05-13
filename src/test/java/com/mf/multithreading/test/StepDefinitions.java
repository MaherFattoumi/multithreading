package com.mf.multithreading.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mf.multithreading.MyThread;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	Thread t;

	@Given("a new thread")
	public void givenANewThread() {
		t = new Thread(new MyThread("myThread"));
	}

	@When("the thread is started")
	public void whenTheThreadIsStarted() {
		t.start();
	}

	@Then("the thread should be running")
	public void thenTheThreadShouldBeRunning() {
		assertTrue(t.isAlive());
	}
}
