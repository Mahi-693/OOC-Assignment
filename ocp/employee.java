package com.codurance.ocp;

public abstract class Employee {
    protected int salary;
    
    public Employee(int salary) {
        this.salary = salary;
    }
    
    public abstract int payAmount();
}

class Engineer extends Employee {
    public Engineer(int salary) {
        super(salary);
    }
    
    @Override
    public int payAmount() {
        return salary;
    }
}

class Manager extends Employee {
    private int bonus;
    
    public Manager(int salary, int bonus) {
        super(salary);
        this.bonus = bonus;
    }
    
    @Override
    public int payAmount() {
        return salary + bonus;
    }
}
