package homeworkTwo;

import java.util.Scanner;

public class HomeworkTwo {
    public static void main(String[] args) {

        //1. uzd. - loģiskās izteiksmes
        //x = pozitīvs - true
        int x = 8;
        System.out.println(x > 0);

        //x = negatīvs - false
        System.out.println(x < 0);

        //x > 5 un x <= 10 - true
        System.out.println(x > 5 && x <= 10);

        //x nav <= 5 un x < 10 - true
        System.out.println(!(x <= 5 && x < 10));

        //x = 0 vai x = 10 - false
        System.out.println(x == 0 || x == 10);

        //x * x > 10 - true
        System.out.println(x * x > 10);

        //2. uzd. - pieņem (skaitlis) un izvada mēneša nosaukumus
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadi mēneša numuru!");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.println("It is January");
                break;
            case 2:
                System.out.println("It is February");
                break;
            case 3:
                System.out.println("It is March");
                break;
            case 4:
                System.out.println("It is April");
                break;
            case 5:
                System.out.println("It is May");
                break;
            case 6:
                System.out.println("It is June");
                break;
            case 7:
                System.out.println("It is July");
                break;
            case 8:
                System.out.println("It is August");
                break;
            case 9:
                System.out.println("It is September");
                break;
            case 10:
                System.out.println("It is October");
                break;
            case 11:
                System.out.println("It is November");
                break;
            case 12:
                System.out.println("It is December");
                break;
            default:
                System.out.println("Not incorrect month of the year!");
        }

        //3. uzd. - pieņem 3 veselus skaitļus un izvada lielāko

        System.out.println("Ievadi pirmo skaitli!");
        int number1 = scanner.nextInt();
        System.out.println("Ievadi otro skaitli!");
        int number2 = scanner.nextInt();
        System.out.println("Ievadi trešo skaitli!");
        int number3 = scanner.nextInt();

        int largestNumber = Math.max(Math.max(number1, number2), number3);
        System.out.println("Lielākais skaitlis ir " + largestNumber);


    //4. uzd. - nolasa krāsu un izvada gājēja darbības pie luksofora

        String krasa = "Zaļa";

        if (krasa.equals("Zaļa")) {
        System.out.println("Varat šķērsot ielu!");
        }
        else if (krasa.equals("Dzeltena")) {
        System.out.println("Uzmanīgi, tūlīt mainīsies luksofora gaisma!");
        }
        else if (krasa.equals("Sarkana")) {
        System.out.println("Stop! Gaidiet luksofora zaļo signālu!");
        }
        else {
        System.out.println("Luksofors nedarbojas! Šķērsojiet ielu uzmanīgi.");
        }


    //5. uzd. - izvada vizītkarti, kura neko neatgriež
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

    //6. uzd. - izvada vizītkarti ar dažādiem parametriem
        printBusinessCardTwo("Līga", "Kalniņa","+371 12345678",1985);
        printBusinessCardTwo("Juris","Vītols","+371 87654321",1978);

    //7. uzd. - divu veselu skaitļu summa
       int summa = sum(65, 21);
        System.out.println(summa);

    //8. uzd. - pieņem 3 decimālskaitļus un atgriež rezultātu, kā decimālskaitļi
        System.out.println(average(20.5,65,3));

    }
    // metode 5. uzd.
    public static void printBusinessCard() {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: Jānis");
        System.out.println("Uzvārds: Bērziņš");
        System.out.println("Telefona numurs: +371 12345678");
        System.out.println("Dzimšanas gads: 1990");
        System.out.println("##########");
        }

    // metode 6. uzd.
    public static void printBusinessCardTwo(String name, String surname, String phoneNumber, int yearOfBirth) {
        System.out.println("Vizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Telefona numurs: " + phoneNumber);
        System.out.println("Dzimšanas gads: " + yearOfBirth);
        System.out.println("##########");
        }

    // metode 7. uzd.
    public static int sum(int a, int b) {
        return a + b;
        }

    // metode 8. uzd.
    public static double average(double num1, double num2, double num3) {
        return ((num1 + num2 + num3) / 3);
        }
}

