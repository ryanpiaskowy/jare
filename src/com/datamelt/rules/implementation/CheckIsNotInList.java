/*
 * Created on 15.09.2006
 *
 * all code by uwe geercken
 */
package com.datamelt.rules.implementation;

/**
 * checks if a string containing multiple values separated by commas (,) 
 * NOT matches a given string. spaces in the individual values are removed (trim) 
 *
 * an example for a list would be:
 * 
 * 		"Rome, Paris, New York, Berlin"
 * 

 * @author uwe geercken
 */
public class CheckIsNotInList extends GenericCheck
{
    public static boolean evaluate(String value,String list)
    {
    	boolean matches = false;
    	if(value!=null)
    	{
	    	String [] values = list.split(",");
	        for(int i=0;i< values.length;i++)
	    	{
	    		if(values[i].trim().equals(value.trim()))
	    		{
	    			matches = true;
	    			break;
	    		}
	    	}
    	}
        return !matches;
    }
    
    public static boolean evaluate(String value,String list, boolean ignoreCase)
    {
    	boolean matches = false;
    	String [] values = list.split(",");
    	if(value!=null)
    	{
	    	for(int i=0;i<values.length;i++)
	    	{
	    		if(!ignoreCase)
	    		{
		        	if(values[i].trim().equals(value.trim()))
		    		{
		    			matches = true;
		    			break;
		    		}
	    		}
		        else
		        {
		        	if(values[i].trim().toLowerCase().equals(value.trim().toLowerCase()))
		    		{
		    			matches = true;
		    			break;
		    		}
		        }
	    	}
    	}
        return !matches;
    }
}
