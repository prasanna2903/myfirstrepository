package com;

public class Practise13 {

	public static void main(String[] args) {
//		String s = "12eg3";
//
//		StringBuffer sb = new StringBuffer();
//		StringBuffer sb1 = new StringBuffer();
//
//		for (char c : s.toCharArray()) {
//			if (Character.isLetter(c)) {
//				sb.append(c);
//			}
//			if (Character.isDigit(c)) {
//				sb1.append(c);
		
//			}
//
//		}
//
//		if (!s.matches("[A-Za-z0-9]*")) {
//			System.out.println("invalid string");
//		}
//		else {
//			System.out.println("kmkms");
//				int sum = 0;
//				for (char e : sb1.toString().toCharArray()) {
//					int i = Integer.parseInt(String.valueOf(e));
//					sum += i;
//				}
//
//				System.out.println(sb + "" + sum);
//			}
//		
//
//		if (s.matches("[a-zA-Z]*"))
//		{
//			System.out.println("iuhaduaih");
//		
//		}
//		
//		if (s.contains(" "))
//		{
//			System.out.println(" only one word ivvu ra");
//			
//		}

		
		
		String s = "Akhilu678karthik";
		
		StringBuffer sb = new StringBuffer();
		StringBuffer sbn = new StringBuffer();
		int sum =0;
		for ( int i=0; i<s.length();i++)
		{
			char c=s.charAt(i);
			if (Character.isLetter(c))
			{
			sb.append(c);
			
			}
			if (Character.isDigit(c))
			{
				sbn.append(c);
			}
	}
	for (int j=0; j<sbn.length(); j++)
	{
		char ch = sbn.charAt(j);
		int n= Integer.parseInt(String.valueOf(ch));
		sum = sum+n;
	}
		
		System.out.print(sb);
		System.out.println(sum);
		String str="34";
		int ss=Integer.parseInt(str);
		System.out.println(ss+3);
	}
	

}

 
 


       






