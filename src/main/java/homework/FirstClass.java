package homework;

public class FirstClass {
    public static void main(String[] args) {

        String countryName = "Latvia";
        System.out.println(countryName);

        int countryPopulation = 1902000;
        System.out.println(countryPopulation);

        int countryArea = 64589;
        System.out.println(countryArea);

        String countryCapital = "Riga";
        System.out.println(countryCapital);

        String countryLanguage = "Latvian";
        System.out.println(countryLanguage);

        boolean isCountryInEu = true;
        System.out.println(isCountryInEu);

        char countryCurrency = '€';
        System.out.println(countryCurrency);

        System.out.println("My country is " + countryName + " and the capital is " + countryCapital + ".");
        System.out.printf("My country is %s and the capital is %s.\n", countryName, countryCapital);

        System.out.println("The official language of " + countryName + " is " + countryLanguage + " language. ");
        System.out.printf("The official language of %s is %s language.\n", countryName, countryLanguage);

        int a = 2;
        int b = 8;
        int c = a * b;
        System.out.println(c);

        int d = 33;
        int e = 3;
        System.out.printf("Number 33 multiplied by 3 is equal %d\n", d * e);

        int f = 15;
        int g = 30;
        int sum = f + g;
        System.out.println(sum);

        int diff = g - f;
        System.out.println(diff);

        int prod = f * g;
        System.out.println(prod);

        int div = g / f;
        System.out.println(div);

        int mod = f % g;
        System.out.println(mod);

        int k = 5;
        int l = 40;
        System.out.println(l + k);

        System.out.println(l - k);

        System.out.println(k * l);

        System.out.println(l / k);

        System.out.println(k % l);
    }
}
