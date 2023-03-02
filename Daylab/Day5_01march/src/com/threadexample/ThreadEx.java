package com.threadexample;

public class ThreadEx {
	//array 
	    private static final int[] arr = {1, 20, 50, 15, 30};

	    public static void main(String[] args) {
	        // Create two threads
	        Thread thread1 = new Thread(() -> {
	        	// synchronized block is used to synchronize access to a shared resource 
	        	//(the sum variable) between the two threads
	            synchronized (ThreadEx.class) {
	                int sum = 0;
	                for (int i = 1; i <= 10; i++) {
	                    sum += i;
	                }
	                double average = (double) sum / 10;
	                System.out.println("The average of first 10 numbers is " + average);
	                ThreadEx.class.notifyAll();
	            }
	        });

	        Thread thread2 = new Thread(() -> {
	            synchronized (ThreadEx.class) {
	                try {
	                	ThreadEx.class.wait();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                for (int i : arr) {
	                    int square = i * i;
	                    System.out.println("The square of " + i + " is " + square);
	                }
	            }
	        });

	        // Start the threads
	        thread1.start();
	        thread2.start();
	    }
	}
