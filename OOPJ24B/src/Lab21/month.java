package Lab21;

import java.util.Scanner;

public class month {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nu = new Scanner(System.in);
		int month; 
		System.out.println("Enter the  Number of the month :");
		month = nu.nextInt();
        String Str;
        switch (month) {
            case 1:  Str = "January";
                     break;
            case 2: Str = "February";
                     break;
            case 3:  Str = "March";
                     break;
            case 4:  Str = "April";
                     break;
            case 5:  Str = "May";
                     break;
            case 6:  Str = "June";
                     break;
            case 7:  Str = "July";
                     break;
            case 8:  Str = "August";
                     break;
            case 9:  Str = "September";
                     break;
            case 10: Str = "October";
                     break;
            case 11: Str = "November";
                     break;
            case 12: Str = "December";
                     break;
            default: Str = "Invalid month";
                     break;
        }
        System.out.println("The month is "+Str);
    

	}


}