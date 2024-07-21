package com.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
    	//conversion of array to collection
    	//String s[]= {"aaa","vvv","jfn"};
    	ArrayList<String>s1=new ArrayList<String>();
    	s1.add("vittal");
    	s1.add("MICHEL");
    	s1.add("sai");
    	s1.add("for");
    	System.out.println(s1);
    	Collections.swap(s1, 2, 3);
    	System.out.println(s1);
    	
    	//collection to arrays
    	
    	ArrayList<String>e=new ArrayList<String>(s1.subList(0, 2));
    	System.out.println(e);
    	
    	}
    	
    	
    }
