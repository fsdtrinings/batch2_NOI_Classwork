package p1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class AgeCalculationDateBased {
    public static void main(String[] args) {

        String strDOB = "23-03-2014";
        String arr[] = strDOB.split("-");
        int year = Integer.parseInt(arr[2]);
        int month = Integer.parseInt(arr[1]);
        int day = Integer.parseInt(arr[0]);

        LocalDate dob = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        Period gap = Period.between(dob,today );

        System.out.println("No Of Days As Gap Object : "+gap);
        System.out.println("No of Days "+gap.getDays());
        System.out.println("No of Years "+gap.getYears());
        System.out.println("No of Months "+gap.getMonths());

        System.out.println("Age "+gap.getYears());

        // --- Using Chrono Units
        long daysBetween = ChronoUnit.DAYS.between(dob, today);

        System.out.println(daysBetween+" Days Old");

    }
}
