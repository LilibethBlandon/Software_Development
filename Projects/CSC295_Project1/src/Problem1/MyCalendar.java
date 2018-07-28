/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem1;

/*
    Lilibeth Blandon
    CSC292-01
    Project 1: Problem 1
    About: Create a calendar class to display a calendar of a specific year the user inputs.
    Class: MyCalendar.java
*/

/**
 *
 * @author lily
 */
public class MyCalendar {
    private int year;
    private boolean isItLeapYear;
    private int numberOfDays;
    private int startingDay;
    private int [] totalNumberOfMonthDays;
    private String [] months = {"January", "February", "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"};
    private String [] daysOfTheWeek = {"Sat", "Sun", "Mon", "Tue", "Wed", "Thurs", "Fri"};
    private int currentDay;
    
    public MyCalendar(int year)
    {
        this.year = year;
        
        if(year%4 ==0){
            if(year%100==0 && year%400==0)
                isItLeapYear = true;
            else if(year%100!=0)
                isItLeapYear = true;
            else
            isItLeapYear = false;
        }
        if(isItLeapYear == true)
            numberOfDays = 366;
        else
            numberOfDays = 365;
        
        setStartingDay();
        
        if(!isItLeapYear)
        {
            int [] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            totalNumberOfMonthDays = days;
        }
        else if(isItLeapYear)
        {
            int [] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            totalNumberOfMonthDays = days;
        }
    }
    public void setStartingDay()
    {
        //Got help from this to figure out the starting day and slightly modified it.
        //http://helpdesk.objects.com.au/java/zellers-congruence-in-java
        
        int day = 1;
        int month = 1;
        int tempYear = this.getYear();

        if (month < 3) {
            month += 12;
            tempYear -= 1;
        }

        int k = tempYear % 100;
        int j = tempYear / 100;
        
        
        // 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday
        int dayOfTheWeek = ((((day + (((month + 1) * 26) / 10) + 
                k + (k / 4) + (j / 4)) + (5 * j)) % 7)-1);
        if(dayOfTheWeek == -1)
        {
            dayOfTheWeek = 6;
        }

        // 0 = Saturday, 1 = Sunday, ...
        this.setStartingDay(dayOfTheWeek);
        /*************************************************************/
    }
    
    public int setStartingDay(int day, int month)
    {
        //Got help from this to figure out the starting day and slightly modified it.
        //http://helpdesk.objects.com.au/java/zellers-congruence-in-java
        
        int tempYear = this.getYear();

        if (month < 3) {
            month += 12;
            tempYear -= 1;
        }

        int k = tempYear % 100;
        int j = tempYear / 100;

        // 0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday
        int dayOfTheWeek = ((((day + (((month + 1) * 26) / 10) + 
                k + (k / 4) + (j / 4)) + (5 * j)) % 7)-1);
        if(dayOfTheWeek == -1)
        {
            dayOfTheWeek = 6;
        }

        // 0 = Saturday, 1 = Sunday, ...
        return dayOfTheWeek;
        /*************************************************************/
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the isItLeapYear
     */
    public boolean isIsItLeapYear() {
        return isItLeapYear;
    }

    /**
     * @param isItLeapYear the isItLeapYear to set
     */
    public void setIsItLeapYear(boolean isItLeapYear) {
        this.isItLeapYear = isItLeapYear;
    }

    /**
     * @return the numberOfDays
     */
    public int getNumberOfDays() {
        return numberOfDays;
    }

    /**
     * @param numberOfDays the numberOfDays to set
     */
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    /**
     * @return the startingDay
     */
    public int getStartingDay() {
        return startingDay;
    }

    /**
     * @param startingDay the startingDay to set
     */
    public void setStartingDay(int startingDay) {
        this.startingDay = startingDay;
    }

    
    public int printFirstWeek(int startingDay, int day)
    {
        for(int i=0; i<7; i++)
        {
            //System.out.println(startingDay);
            if(i>=startingDay)
            {
                System.out.print(day + "\t");
                day++;
            }
            else
            {
                System.out.print("\t");
            }
        }
        System.out.println();
        return day;
    }
    
    public void displayWholeYear()
    {
        int month=1;
        for(int i=0; i<12; i++)
        {
            displayMonth(month, months[i], totalNumberOfMonthDays[i]);
            month++;
        }
    }
    
    public void displayMonth(int month, String months, int numberOfDays)
    {
        currentDay = setStartingDay(1, month);
        boolean firstWeekComplete=true;
        int counter=1;
            System.out.println("\t\t  " + months + " " + year);
            System.out.println("Sun\tMon\tTue\tWed\tThurs\tFri\tSat");
            while(firstWeekComplete)
            {
                counter = printFirstWeek(currentDay, counter);
                firstWeekComplete = false;
            }
            int temp=1;
            for(int j=counter; j<=numberOfDays; j++)
            {
                if(temp%7 == 0)
                {
                     System.out.print(j + "\t\n");
                     temp++;
                }
                else
                {
                    System.out.print(j + "\t");
                    temp++;
                }
            }
            System.out.println();
    }
    
}
