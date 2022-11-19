package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;

    static final int WORKING_DAY_PER_MONTH = 20;

    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args){

     //   double employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
     //   System.out.println(employeeCheck);

        int dailyWage = 0;
        int dayCount = 1;
        int totalWage = 0;

        while(dayCount <= WORKING_DAY_PER_MONTH){
            double employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
            System.out.println("\n" + employeeCheck);

            switch ((int) employeeCheck){

                case 1:
                    System.out.println("Employee is present");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;

                default:
                    System.out.println("Employee is absent");
                    dailyWage = 0;
            }

            dayCount++;
            totalWage = totalWage + dailyWage;
            System.out.println("Employee Wage till day "+ (dayCount-1)+ " is: " + totalWage);
        }
        System.out.println("\notal Employee Wage: " + totalWage);
    }

}
