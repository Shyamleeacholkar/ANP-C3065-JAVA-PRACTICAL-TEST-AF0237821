package com.threadexample;

public class Threadexample2 {
	
	    private static final Object obj = new Object();
	    private static boolean printOddNum= true;

	    public static void main(String[] args) {
	    	//print odd thread
	        Thread oddThread = new Thread(() -> {
	            for (int i = 1; i <= 100; i += 2) {
	                synchronized (obj) {
	                    while (!printOddNum) {
	                        try {
	                        	obj.wait();
	                        } catch (InterruptedException e) {
	                        }
	                    }
	                    System.out.println(Thread.currentThread().getName() + ": " + i);
	                    printOddNum = false;
	                    obj.notifyAll();
	                }
	            }
	        }, "Odd Thread");
//print even thread
	        Thread evenThread = new Thread(() -> {
	            for (int i = 2; i <= 100; i += 2) {
	                synchronized (obj) {
	                    while (printOddNum) {
	                        try {
	                        	obj.wait();
	                        } catch (InterruptedException e) {
	                        }
	                    }
	                    System.out.println(Thread.currentThread().getName() + ": " + i);
	                    printOddNum = true;
	                    obj.notifyAll();
	                }
	            }
	        }, "Even Thread");

	        oddThread.start();
	        evenThread.start();
	    }
	}
