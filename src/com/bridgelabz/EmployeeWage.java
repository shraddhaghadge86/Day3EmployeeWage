package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args){

        double employeeCheck = (int) Math.floor(Math.random() * 10) % 2;

        System.out.println(employeeCheck);

        if(employeeCheck == 1){
            System.out.println("Employee is present");
        }else{
            System.out.println("Employee is absent");
        }
    }

}
