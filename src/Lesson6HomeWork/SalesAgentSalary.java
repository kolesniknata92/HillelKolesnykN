package Lesson6HomeWork;

public class SalesAgentSalary {

    private int workHours;
    private double rateForHour;
    private int experience;
    private int countOfSales;
    private double sumOfSales;
    private double salary;


    public SalesAgentSalary(int workHours, double rateForHour, int experience) {
        this.workHours = workHours;
        this.rateForHour = rateForHour;
        this.experience = experience;
        setSalary(sumForOvertime()+ experienceCoefficient());



    }

    public SalesAgentSalary(int workHours, double rateForHour, int experience, int countOfSales, double sumOfSales) {
        this.experience = experience;
        this.workHours = workHours;
        this.rateForHour = rateForHour;
        this.countOfSales = countOfSales;
        this.sumOfSales = sumOfSales;
        setSalary(sumForOvertime()+ experienceCoefficient()+ salesNumber()+bonusForSales());


    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public double getRateForHour() {
        return rateForHour;
    }

    public void setRateForHour(double rateForHour) {
        this.rateForHour = rateForHour;
    }

    public int getCountOfSales() {
        return countOfSales;
    }

    public void setCountOfSales(int countOfSales) {
        this.countOfSales = countOfSales;
    }

    public double getSumOfSales() {
        return sumOfSales;
    }

    public void setSumOfSales(double sumOfSales) {
        this.sumOfSales = sumOfSales;
    }

    public double sumForOvertime() {
        double bonus1 = 0;
        if (workHours > 160) {
            int difference = workHours - 160;
            bonus1 = difference * (rateForHour * 1.5);
            return bonus1;
        } else {
            return -0;
        }
    }
        public double experienceCoefficient() {
            double bonus2 = 0;
            double hoursWithoutOvertime = workHours > 160 ? 160 : workHours;
            if (experience < 2) {
                bonus2 = rateForHour * hoursWithoutOvertime;
            }
            else if (experience < 4) {
                    bonus2 = hoursWithoutOvertime * (rateForHour * 1.2);
                }
                else if (experience < 6) {
                bonus2 = hoursWithoutOvertime * (rateForHour * 1.3);
            } else {
                bonus2 = hoursWithoutOvertime * (rateForHour * 1.4);
            }
            return bonus2;
        }
    public double salesNumber() {
        double bonus3 = 0;
        double fine = 0;
        if (countOfSales >= 20) {
            bonus3 = 250;
        } else if (countOfSales < 10) {
            bonus3 = (-150.0);
        }
        return bonus3;
    }
    public double bonusForSales() {
        double bonus4 = 0;
        if (sumOfSales > 15000.0) {
            bonus4 = (rateForHour * workHours) + 200.0;
            return bonus4;
        } else {
            bonus4 = 0;
        }
        return bonus4;
    }




    }


