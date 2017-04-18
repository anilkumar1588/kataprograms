package com.main;

import com.kata.converter.CurrencyConverter;

public class ExecutePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter converter = new CurrencyConverter();
		// pass the number to covert
		String result = converter.convertToWords(73394050);
		System.out.println(result);

	}

}
