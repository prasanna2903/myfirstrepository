package com.lab3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Exercise7 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a date (yyyy-mm-dd): ");
		String inputDate = scanner.nextLine();

		LocalDate currentDate = LocalDate.now();
		LocalDate enteredDate = LocalDate.parse(inputDate);

		Period period = Period.between(enteredDate, currentDate);

		int years = period.getYears();
		int months = period.getMonths();
		int days = period.getDays();

		System.out.println("Duration: " + years + " years, " + months + " months, " + days + " days");

		scanner.close();
	}


}
