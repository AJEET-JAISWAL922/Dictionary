package com.dictionary;

import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice 
{
public static void main(String args[])
{
	Map<Integer,String> Week = new HashMap<Integer,String>();
	//Putting every day in week map
 Week.put(1, "Sunday");
 Week.put(2, "Monday");
 Week.put(3, "Tuesday");
 Week.put(4, "Wednesday");
 Week.put(5, "Thursday");
 Week.put(6, "Friday");
 Week.put(7, "Saturday");
 //Retrieving data from map
 System.out.println(Week.get(1));
 //Printout all keys
 System.out.println(Week.keySet());
 //Printout all values
 System.out.println(Week.values());
 //Size of our week
 System.out.println(Week.size());
 //key-value pairs print out
 System.out.println(Week.toString());
 
 
}
}
