package com.kata.converter;
import java.util.HashMap;
import java.util.Map;

public abstract class  Converter {
	
	public static final String[] specialNames = {
	        "",
	        " thousand",
	        " million",
	        " billion",
	        " trillion",
	        " quadrillion",
	        " quintillion"
	    };
	    
	    public static final String[] tensNames = {
	        "",
	        " ten",
	        " twenty",
	        " thirty",
	        " forty",
	        " fifty",
	        " sixty",
	        " seventy",
	        " eighty",
	        " ninety"
	    };
	    
	    public static final String[] numNames = {
	        "",
	        " one",
	        " two",
	        " three",
	        " four",
	        " five",
	        " six",
	        " seven",
	        " eight",
	        " nine",
	        " ten",
	        " eleven",
	        " twelve",
	        " thirteen",
	        " fourteen",
	        " fifteen",
	        " sixteen",
	        " seventeen",
	        " eighteen",
	        " nineteen"
	    };
	    
	    public String convertHudreds(int number) {
	        String current;
	        
	        if (number % 100 < 20){
	            current = numNames[number % 100];
	            number /= 100;
	        }
	        else {
	            current = numNames[number % 10];
	            number /= 10;
	            
	            current = tensNames[number % 10] + current;
	            number /= 10;
	        }
	        if (number == 0) return current;
	        return numNames[number] + " hundred" + current;
	    }
	    
	    protected int wordtonum(String word)
	    {
	            int num = 0;
	            switch (word) {
	                case "one":  num = 1;
	                         break;
	                case "two":  num = 2;
	                         break;
	                case "three":  num = 3;
	                         break;
	                case "four":  num = 4;
	                         break;
	                case "five":  num = 5;
	                         break;
	                case "six":  num = 6;
	                         break;
	                case "seven":  num = 7;
	                         break;
	                case "eight":  num = 8;
	                         break;
	                case "nine":  num = 9;
	                         break;
	                case "ten": num = 10;
	                         break;
	                case "eleven": num = 11;
	                         break;
	                case "twelve": num = 12;
	                         break;
	                case "thirteen": num = 13;
	                         break;
	                case "fourteen": num = 14;
	                         break;             
	                case "fifteen": num = 15;
	                         break;
	                case "sixteen": num = 16;
	                         break;
	                case "seventeen": num = 17;
	                         break;
	                case "eighteen": num = 18;
	                         break;
	                case "nineteen": num = 19;
	                         break;
	                case "twenty":  num = 20;
	                         break;
	                case "thirty":  num = 30;
	                         break;
	                case "forty":  num = 40;
	                         break;
	                case "fifty":  num = 50;
	                         break;
	                case "sixty":  num = 60;
	                         break;
	                case "seventy":  num = 70;
	                         break;
	                case"eighty":  num = 80;
	                         break;
	                case "ninety":  num = 90;
	                         break; 
	                case "hundred": num = 100;
	                            break;
	                case "thousand": num = 1000;
	                            break;     
	              
	            }
	            return num;
	        }
	    
	    protected Map<String, Integer> getWordNumberMap(){
	    	Map<String, Integer> wordsMap = new HashMap<String, Integer>();
	    	wordsMap.put("hundred", 100);
	    	wordsMap.put("thousand", 1000);
	    	wordsMap.put("million", 1000000);
	    	wordsMap.put("billion", 1000000000);
	    	return wordsMap;
	    }
	    
	    public int getNumber(String word){
	    	return getWordNumberMap().get(word);
	    }
	    
	    
	    public abstract String convertToWords(int number);
	    
	    public abstract int convertToDigits(String words);

}
