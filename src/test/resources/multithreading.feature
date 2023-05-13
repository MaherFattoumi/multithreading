Feature: Multithreading

Scenario: Thread creation
   Given a new thread
   When the thread is started
   Then the thread should be running