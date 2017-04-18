package com.kata.converter;


public class CurrencyConverter extends Converter {

	@Override
	public String convertToWords(int number) {
		// TODO Auto-generated method stub
		
		if (number == 0) { return "zero"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertHudreds(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
	}

	// work under progress
	@Override
	public int convertToDigits(String words) {
		return 0;
	}

}

