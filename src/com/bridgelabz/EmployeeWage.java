package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int WORKING_DAY_PER_MONTH = 20;
    static final int WORKING_HOUR_PER_MONTH = 100;

    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 8;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    public static void main(String[] args){


        int dailyWage = 0;
        int dayCount = 1;
        int workingHours = 0;

        while(dayCount <= WORKING_DAY_PER_MONTH && workingHours <= WORKING_HOUR_PER_MONTH){
            double employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
            System.out.println("\n" + employeeCheck);

            switch ((int) employeeCheck){

                case FULL_DAY_HOUR:
                    System.out.println("Employee is present");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    workingHours+=FULL_DAY_HOUR;
                    System.out.println("Employee is Full time");
                    break;

                case IS_PART_TIME:
                    dailyWage = PART_TIME_HOUR * WAGE_PER_HOUR;
                    workingHours+=PART_TIME_HOUR;
                    System.out.println("Employee is Part time");
                    break;

                default:

                    System.out.println("Employee is Absent");

            }

            System.out.println("Daily Wage for Day "+ dayCount + " => " + dailyWage);
            dayCount++;
        }
        System.out.println("Working Hours => " + workingHours);
    }

}
