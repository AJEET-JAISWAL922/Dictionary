package com.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8 
{
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> myMap = new HashMap<String,Integer>();
        int n = in.nextInt();
        String name = null;
        for(int i = 0; i < n; i++){
            name = in.next();
            int phone = in.nextInt();
            // Write code here
            
                myMap.put(name,phone);
                
        }
        
        while(in.hasNext()){
            String s = in.next();
            if(myMap.containsKey(s)==true)
            {
            	System.out.println(s + "="+ myMap.get(s));
            
            
            }else 
            {
                 System.out.println("Not found");                
}
            // Write code here
        
        }
	}
}


