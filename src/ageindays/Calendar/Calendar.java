
package ageindays.Calendar;

/**
 *
 * @author SAMA
 */
/* THIS CLASS RETURNS THE NUMBER OF DAYS IN EACH MONTH AND ALSO CHECKS IF THE YEAR IS A LEAP YEAR OR NOT*/
public class Calendar {
    /*This method "monthDay" returns the number of Days in each 
    month When the month and the year are passed into it*/

    public int monthDay(int BirthMonth,int year)
    {
        int number=0;
        switch (BirthMonth) {
            case 1:
                number=31;
                break;
            case 2:
                if(year%4==0)
                {
                    number=28;
                    break;
                }
                else
                {
                    number=29;
                }   break;
            case 3:
                number=31;
                break;
            case 4:
                number=30;
                break;
            case 5:
                number=31;
                break;
            case 6:
                number=30;
                break;
            case 7:
                number=31;
                break;
            case 8:
                number=31;
                break;
            case 9:
                number=30;
                break;
            case 10:
                number=31;
                break;
            case 11:
                number=30;
                break;
            case 12:
                number=31;
                break;
            default:
                break;
        }
        
        return number;
    }

    /*This method "isleapYear" determins whether a year is a leap year
     or not when the year is passed into it */

    public int isleapYear(int year)
    {
        int ans; // VARIBALE TO DETERMINAE IF THE INPUTED YEAR IS A LEAP YEAR OR NOT 
        if (year%4==0)
        {
            ans=1;
        }
        else
        {
        ans=0;
        }
        return ans;
    }
    
}
