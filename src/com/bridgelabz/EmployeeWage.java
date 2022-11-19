package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;

    static final int PART_TIME_HOUR = 4;

    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args){

        double employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        System.out.println(employeeCheck);

        int dailyWage = 0;
        if(employeeCheck == 2){
            dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR;
            System.out.println("Full day: ");
        }else if(employeeCheck == 1){
            dailyWage = PART_TIME_HOUR * WAGE_PER_HOUR;
            System.out.println("Part Time: ");
        }else{
            System.out.println("Employee is absent");
        }

        System.out.println("Employee Wage: " + dailyWage);
    }

}
