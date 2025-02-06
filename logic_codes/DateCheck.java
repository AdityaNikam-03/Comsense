package com.tbc.logic_codes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCheck {

	public static void main(String[] args) throws ParseException {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date userDate = null;
       
            userDate = sdf.parse(inputDate);

        Date currentDate = new Date();
        
        if (userDate != null) {
            if (userDate.after(currentDate)) {
                System.out.println("The entered date is upcoming.");
            } else if (userDate.equals(currentDate)) {
                System.out.println("The entered date is today.");
            } else {
                System.out.println("The entered date is in the past.");
            }
        }
        scanner.close();
	}

}
