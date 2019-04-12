package com.calculatetax;

public class Tax {
    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getTax(){
        float tax = 0.0f;
        if (salary <= 200000) {
            tax = (salary / 100) * 1;
        } else if (salary > 200000 && salary <= 350000) {
            float firstTax = (200000 / 100) * 1;
            float remainingAmount = salary - 200000;
            float secondTax = (remainingAmount / 100) * 15;
            tax = firstTax + secondTax;
        } else if (salary > 350000) {
            float firstTax = (200000 / 100) * 1;
            float secondTax = (150000 / 100) * 15;
            float remainingAmount = salary - 350000;
            float thirdTax = (remainingAmount/100)*25;
            tax = firstTax + secondTax + thirdTax;
        }
        return tax;
    }
}