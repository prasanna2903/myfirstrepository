package com;

public class Practise14 {

	public static void main(String[] args) {
		String s="wqer1235";
		
		int sum = 0;
		for(char c:s.toCharArray())
			if(Character.isDigit(c)) {
				int i = Integer.parseInt(String.valueOf(c));
				sum+=i;
			}
		System.out.println(sum);
	
	}

}
