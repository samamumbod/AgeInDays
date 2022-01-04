


/*
  A PROGRAM THAT TELLS YOUR AGE IN DAYS
*/
package ageindays;

import ageindays.Calendar.Calendar;
import ageindays.converter.ConvertDate;
import java.util.Scanner;

/**
 *
 * @author SAMA
 */
public class AgeInDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
         ConvertDate myDate= new ConvertDate();
         Calendar number= new Calendar();
         Calendar calendar= new Calendar();
         /*  VARIABLES */ 
         
        
        String currentDate,birthDate; // Holds the current date and birth date inputed by the user
        int birth_year;        // Holds the year in the inputed birth date
        int current_year;       // Holds the year in the inputed current date
        int month_of_birthYear; // Holds the month in the inputed birth date
        int month_of_currentYear; // Holds the month in the inputed current date
        int birthDay; // Holds the birth day in the inputed birth date
        int currentDay; // Holds the current day in the inputed current date
        int ageInDays = 0; // Holds the age in days
        int monthCounter;// Counter that loops through the months when the birth month is less than the current month
        int yearCounter; // Counter that loops through the years when the birth year is less than the current year
       
        System.out.println("Determine your Age in Days");
        System.out.println("--------------------------");
        System.out.println("Input Date in this Foramt : (dd/mm/yyyy)");
        System.out.print("Enter your Birth Date: ");
        birthDate=in.nextLine();
        
        myDate.convert(birthDate);
        birth_year=myDate.dateYear();
        month_of_birthYear=myDate.dateMonth();
        birthDay=myDate.dateDay();

        System.out.print("Enter your Current Date: ");
        currentDate=in.nextLine();
        myDate.convert(currentDate);
        current_year=myDate.dateYear();
        month_of_currentYear=myDate.dateMonth();
        currentDay=myDate.dateDay();
        
        
        if (birth_year == current_year)
        {
            if(month_of_birthYear == month_of_currentYear)
            {
                ageInDays=currentDay-birthDay;
            }
            else if(month_of_birthYear < month_of_currentYear)
            {
                ageInDays= number.monthDay(month_of_birthYear,birth_year)-birthDay;
                for(monthCounter= month_of_birthYear+1; monthCounter<=month_of_currentYear; monthCounter++)
                {
                    if(monthCounter==month_of_currentYear)
                    {
                        ageInDays+=currentDay; 
                    }
                    else
                    {
                         ageInDays+=number.monthDay(monthCounter, birth_year);
                    }
                }
            }   
        }
        else if (birth_year < current_year)
        {
            for(yearCounter=birth_year; yearCounter<= current_year; yearCounter++)
            {
                if(yearCounter==birth_year)
                {
                    ageInDays += number.monthDay(month_of_birthYear, birth_year);
                    for(monthCounter= month_of_birthYear+1; monthCounter<=12; monthCounter++)
                    {
                    ageInDays += number.monthDay(monthCounter, birth_year);
                    }
                }
                else if(yearCounter>birth_year && yearCounter<current_year)
                {
                    if(calendar.isleapYear(yearCounter)==1)
                    {
                        ageInDays+=366;
                    } else {
                        ageInDays+=365;
                    }
                }
                else  if(yearCounter==current_year)
                {
                    for(monthCounter=1; monthCounter<=month_of_currentYear; monthCounter++)
                    {
                        if(monthCounter==month_of_currentYear )
                        {
                            ageInDays+=currentDay;
                        }
                        else
                        {
                            ageInDays+=number.monthDay(monthCounter,current_year);
                        }
                    }
                        
                }
            }
        }
            System.out.println("You are " + ageInDays + " Day(s) Old.");
    }   
}