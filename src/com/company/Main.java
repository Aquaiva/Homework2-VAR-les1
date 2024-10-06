package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World!");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("task 1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("task 2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("task 3");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println("task 4");
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println("task 5");
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 5;
        System.out.println(frog);

        var aBoxerWeight = 78.2;
        var bBoxerWeight = 82.7;
        var boxersWeight = aBoxerWeight + bBoxerWeight;
        var diffInBoxersWeight = bBoxerWeight - aBoxerWeight;
        System.out.println("task 6");
        System.out.println("total weight of boxers = " +boxersWeight);
        System.out.println("boxers weight difference = " +diffInBoxersWeight);

        var difference = bBoxerWeight % aBoxerWeight;
        System.out.println("task 7");
        System.out.println("remainder = " + difference);

        var employeesWorktime = 640;
        var employeeWorkingHours = 8;
        var companyEmployees = employeesWorktime / employeeWorkingHours;
        System.out.println("task 8");
        System.out.println("Всего сотрудников в компании " + companyEmployees);

        var extendedCompanyEmployees = companyEmployees + 94;
        var extendedCompanyEmployeesWorktime = extendedCompanyEmployees * employeeWorkingHours;
        System.out.println("task 8.1");
        System.out.println("Если в компании работает " + extendedCompanyEmployees + " человек, то " + extendedCompanyEmployeesWorktime + " часов может быть поделено между сотрудниками");

    }
}