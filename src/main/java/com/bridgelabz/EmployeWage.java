package com.bridgelabz;

public class EmployeWage {
    public static void main(String[] args) {
        final int IS_PRESENT = 1;
        final int PER_HR = 20;
        final int FULL_DAY = 8;
        final int PART_TIME_HRS=8;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_PRESENT) {
            System.out.println("employee is present");
            int oneday_wages = (PER_HR * FULL_DAY);
            System.out.println("Oneday Wages is:"+oneday_wages);
         int part=(PER_HR*PART_TIME_HRS);
         double total = (oneday_wages+part);
         System.out.println("PartTime Wages"+part);
         System.out.println("TotalWages"+total);
        } else {
            System.out.println("employee is absent");
        }

    }
}
