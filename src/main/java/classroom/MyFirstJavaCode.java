package classroom;

import org.w3c.dom.ls.LSOutput;

public class MyFirstJavaCode {
    public static void main(String[] args) {
        System.out.println("Hello World! My name is Evita");
        System.out.println("First argument is:" + args[0]);
        System.out.println("Second argument is:" + args[1]);

        byte floorCount = 7;
        System.out.println("My house consist of " + floorCount + " floors!\n ");
        System.out.printf("My house consist of %d floors!\n", floorCount);

        short juniorTesterSalaryInEur = 1000;
        System.out.println(juniorTesterSalaryInEur);
        System.out.printf("Average salary for Junior QA Engineer is %d\n", juniorTesterSalaryInEur);

        int chinaPopulation = 1449687399;
        System.out.printf("China Population %d people\n ", chinaPopulation);

        long currentWorldPopulation = 794609708;
        System.out.printf("Current World population %d\n ", currentWorldPopulation);

        float myCurrentWeight = 70.6f;
        System.out.println(myCurrentWeight);

        double gasPriceInEur = 1.83445d;
        System.out.println(gasPriceInEur);

        boolean isSummer = true;

        if (isSummer) {
            System.out.printf("Now it is summer! And boolean value is: %b\n ", isSummer);
        } else {
            System.out.printf("No, summer will be the next! And boolean value is: %b\n ", isSummer);
        }

        char firstNameLatter = 'N';
        System.out.println(firstNameLatter);

        String myNameAndSurname = "Evita Savicka";
        System.out.println(myNameAndSurname);

        System.out.println(7+7);
        System.out.println("7+7");
        System.out.println("7"+7);

        int a = 10;
        int b = 5;
        System.out.println(a + b);

        int c = a + b;
        System.out.println(c);

        boolean isAGreaterThanB = a > b;
        System.out.println(isAGreaterThanB);
        System.out.printf("Is a greater than b: %b", isAGreaterThanB);
    }
}