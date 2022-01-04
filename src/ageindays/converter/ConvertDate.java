
/* THIS CLASS CONVERTS THE INPUTED DATES INTO INTEGERS*/

package ageindays.converter;

/**
 *
 * @author SAMA
 */

public class ConvertDate {
    private String dd=" ",mm=" ",yyyy=""; // Holds the corresponding day(dd), month(mm), and year(yyyy) of the Birth and Current dates temporally

    /*This Method (convert) takes are date and brokes it into date, month
    and year */
    public void convert(String date)
    {
        
        if (date.length()==10)
        {
            dd=date.substring(0,2);
            //System.out.println(dd);
            mm=date.substring(3,5);
            //System.out.println(mm);
            yyyy=date.substring(6, 10);
           // System.out.println(yyyy);
        }
    }
    /*This method (dateDay) returns the the 
    day of the passed date to an integer */
    public int dateDay()
    {
        return Integer.parseInt(dd);
    }
    /*This method (dateMonth) returns the the 
    month of the passed date to an integer*/
    public int dateMonth()
    {
        return Integer.parseInt(mm);
    }
    /*This method (dateYear) returns the the 
    year of the passed date to an integer*/
    public int dateYear()
    {
        return Integer.parseInt(yyyy);
    }
    
}
