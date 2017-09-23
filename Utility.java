package com.names.strings;

import java.util.HashMap;

/**
 * @author fazal
 */

public class Utility {
	
	public static void encrypt(String[] name)  {
		
		    int divisor = 0;
		    String partone=null, parttwo=null, result=null, cacheName = null;
		    HashMap<String,String>  encryptedCache = new HashMap<String,String>();
		    
		for (int i = 0; i < name.length; i++)    {

	        if(encryptedCache.containsKey(name[i]))	{
		           result = encryptedCache.get(name[i]);
		           System.out.println("Name " + name[i] + " is already in cache. It's encrypted name is " + result);
		           System.out.println("\n");
	          }
	        
	        else{
	        	
	        	if(name[i].length()%2 == 1)    {
	        	   cacheName = name[i];
	    	       name[i] = name[i] + "#";
	    	       divisor = name[i].length()/2;
	    	       partone = name[i].substring(0,divisor);
	    	       parttwo = name[i].substring(divisor,name[i].length());
	    	       result = parttwo + partone;
	    	       encryptedCache.put(cacheName, result);
	               System.out.println("Encrypt result = " + result);
	               System.out.println("\n");	    	       	   		
	    	    }	    	 
	      	    else {
	      	       divisor = name[i].length()/2;
	  	           partone = name[i].substring(0,divisor);
	  	           parttwo = name[i].substring(divisor,name[i].length());
	  	           result = parttwo + partone;
	  	           encryptedCache.put(name[i], result);
	               System.out.println("Encrypt result = " + result);
	               System.out.println("\n");
	     	       }	      	      	  
	        }
		}		
	}
	
	public static void decrypt(String[] decrypt) {
		
		 int divisor = 0;
		 String decPartone=null, decPartTwo=null, decryptResult=null;
		 HashMap<String,String>  nonEnryptCache = new HashMap<String,String>();
		    
		 for (int i = 0; i < decrypt.length; i++) {		  
		     
			 if(nonEnryptCache.containsKey(decrypt[i]))	{
		        decryptResult = nonEnryptCache.get(decrypt[i]);
			    System.out.println(decrypt[i] + " is already in cache. It's decrypted name is " + decryptResult);
			    System.out.println("\n");
		       }
		        
		     else {		    	 
		      divisor = decrypt[i].length()/2;
	          decPartone = decrypt[i].substring(0,divisor);
	          if(decPartone.contains("#"))
	     	    decPartone = decPartone.replace("#", "");
	          decPartTwo = decrypt[i].substring(divisor,decrypt[i].length());
	          decryptResult = decPartTwo + decPartone;
	          nonEnryptCache.put(decrypt[i], decryptResult);
              System.out.println("Decrypt result = " + decryptResult);
              System.out.println("\n");
	       }
	   }
  }
	
	
	public static void main(String[] args) {

	 String[] names = {"Amin","Sridhar","Anil","Vimal","Amin","Vimal","Ajay","Anil","Pavan","Ajay","Sridhar","Vimal"};
     String[] decryptNames = {"arAm","har#Srid","al#Vim","miSa","an#Kir","har#Srid","arAm","ak#Dip","al#Vim"};
 
     encrypt(names);
     decrypt(decryptNames);
    

	 }    
 }
	