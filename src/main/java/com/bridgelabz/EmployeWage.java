package com.bridgelabz;

public class EmployeWage {
    public static void main(String[] args) {
        final int IS_PRESENT = 1;
        final int PER_HR = 20;
        final int FULL_DAY = 8;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT) {
            System.out.println("employee is present");
            int oneday_wages = (PER_HR * FULL_DAY);
            System.out.println(oneday_wages);

        } else {
            System.out.println("employee is absent");
        }

    }
}
