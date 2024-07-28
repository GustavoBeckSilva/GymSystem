package model;

import java.util.Date;

public class Trainer extends Person {

    // variáveis
    private Date hireDate;
    private double hourlyWage;

    // construtor
    public Trainer(String name, Date hireDate, double hourlyWage) {
        super(name);
        this.hireDate = hireDate;
        this.hourlyWage = hourlyWage;
    }

    // getters e setters
    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
}
