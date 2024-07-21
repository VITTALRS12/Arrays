package com.arrays;

import java.util.Scanner;

//public class SimilarArrays {
	//import java.util.Arrays;

	public class SimilarArrays {
	    public static void main(String[] args) {
	        // Sample arrays
	        int[] array1 = new int[2];
	        int[] array2 = new int[2];
	        try (Scanner sc = new Scanner(System.in)) {
				// Compare arrays and display similar elements
				System.out.println("Similar elements:");
				for (int i = 0; i < array1.length; i++) {
				    for (int j = 0; j < array2.length; j++) {
				    	 array1[i]=sc.nextInt();
				    }
				}
				  // System.out.println("similar elemts1");
				    	 for (int i = 0; i < array1.length; i++) {
				            for (int j = 0; j < array2.length; j++) {
				            	 array2[j]=sc.nextInt();
				        if (array1[i] == array2[j]) {
				            System.out.print(array1[i]);
				           // System.out.println(array2[j]);
				            break;
				        }
				       
				    }
				}
			}
	    }
	}


