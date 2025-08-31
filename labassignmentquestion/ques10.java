/*
Create an abstract class Employee with method getAmount() which displays the amount paid to employee. Reuse this class to calculate the amount to be paid to WeeklyEmployee 
and HourlyEmployee according to number of weeks and total weeks for WeeklyEmployee, and number of hours and total hours for HourlyEmployee.
*/

abstract class Employee {
    abstract void getAmount();
}

class WeeklyEmployee extends Employee {
    private double payPerWeek;
    private int totalWeeks;

    WeeklyEmployee(double payPerWeek, int totalWeeks) {
        this.payPerWeek = payPerWeek;
        this.totalWeeks = totalWeeks;
    }

    @Override
   void getAmount() {
      System.out.println("Weekly Employee Salary: " + payPerWeek* totalWeeks);
    }
}

class HourlyEmployee extends Employee {
    private double payPerHour;
    private int totalHours;

    HourlyEmployee(double payPerHour, int totalHours) {
        this.payPerHour = payPerHour;
        this.totalHours = totalHours;
    }

    @Override
      void getAmount() {
       System.out.println("Hourly Employee Salary: " +  payPerHour*totalHours);
    }
}

public class Salary{
    public static void main(String[] args) {
        Employee weeklyEmp = new WeeklyEmployee(2000, 4);   // ₹2000 per week for 4 weeks
        Employee hourlyEmp = new HourlyEmployee(150, 120);  // ₹150 per hour for 120 hours

       weeklyEmp.getAmount();
       hourlyEmp.getAmount();
    }
}
