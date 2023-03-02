package com.stringbuffer;

public class StringBufferOp {
	    public static void main(String[] args) {
	        StringBuffer sb = new StringBuffer("This is StringBuffer");

	        // Adds the string "- This is a sample program" to existing string and display it.
	        sb.append("- This is a sample program");
	        System.out.println("After appending the string: "+"\n" + sb);

	        // Inserts the string "Object" into the existing string at 21st position and display it.
	        sb.insert(21, "Object");
	        System.out.println("After inserting 'Object' at position 21: "+"\n"  + sb);

	        // Reverses the entire string and displays it.
	        sb.reverse();
	        System.out.println("After reversing the string: " +"\n" + sb);
	     
	        // Replaces the word "Buffer" with "Builder" and display it.
	        sb.reverse();
	        sb.replace(14,20, "Builder ");
	        System.out.println("After replacing the string: "+"\n"  + sb);
	       
	    }
	}
