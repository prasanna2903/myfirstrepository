package com.lab5;

import java.util.Scanner;

//import java.lang.*;

public class Exercise1 extends NaaException1{
	int a;

	public Exercise1(int a) {
		this.a = a;

	}

	public void check() throws NaaException1 {
		if (a < 18) {
			throw new NaaException1();
		}else {
			System.out.println("Voter");
		}
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Enter age");
		Scanner s=new Scanner(System.in);
		Exercise1 e = new Exercise1(s.nextInt());
		s.close();
		e.check();
	}
}
