package homeworkTwo;

import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\\\\1. uzdevums");
        int userNum;
        int sum = 0;
        while (sum <= 100) {
            System.out.print("Ieraksti veselu skaitli: ");
            userNum = scanner.nextInt();
            sum = sum + userNum;
        }
        System.out.println("Gatavs!");

        System.out.println("\\\\2. uzdevums");
        int userNumb;
        System.out.println("Ieraksti veselu skaitli: ");
        userNumb = scanner.nextInt();
        if (userNumb <= 1) {
            System.out.println(userNumb + " nav pirmskaitlis!");
        } else if (!(userNumb % 2 == 0) && ! (userNumb % 3 == 0) && userNumb % userNumb == 0 || userNumb == 2) {
            System.out.println(userNumb + " ir pirmskaitlis!");
        } else {
            System.out.println(userNumb + " ir salikts skaitlis!");
        }

        System.out.println("\\\\3. uzdevums");
        int[] nums = {9, 30, 57, 99};
        String[] months = {"January", "May", "July", "September",};
        char[] letters = {'A', 'B', 'C', 'D'};
        // while
        System.out.println("a)while");
        int a = 0;
        while (a < nums.length) {
            System.out.println(nums[a]);
            a++;
        }
        int b = 0;
        while (b < months.length) {
            System.out.println(months[b]);
            b++;
        }
        int c = 0;
        while (c < letters.length) {
            System.out.println(letters[c]);
            c++;
        }
        // do while
        System.out.println("b)do while");
        int d = 0;
        do {
            System.out.println(nums[d]);
            d++;
        }
        while (d < nums.length);

        int e = 0;
        do {
            System.out.println(months[e]);
            e++;
        } while (e < months.length);

        int f = 0;
        do {
            System.out.println(letters[f]);
            f++;
        } while (f < letters.length);
        // for loop
        System.out.println("c)for loop");
        for (int g = 0; g < nums.length; g++) {
            int el = nums[g];
            System.out.println(el);
        }
        for (int i = 0; i < months.length; i++) {
            String element = months[i];
            System.out.println(element);
        }
        for (int l = 0; l < letters.length; l++) {
            char element1 = (letters[l]);
            System.out.println(element1);
        }
        //for each
        System.out.println("d)for each");
        for (int j : nums) {
            System.out.println(j);
        }
        for (String k : months) {
            System.out.println(k);
        }
        for (char m : letters) {
            System.out.println(m);
        }

        System.out.println("\\\\4. uzdevums");
        int[] numbers1 = new int[100];
        for (int i = 0; i < numbers1.length; i++) {
            numbers1[i] = i;
            if (i % 2 == 0) {
                System.out.print(numbers1[i] + ", ");
            }
        }

        System.out.println("\\\\5. uzdevums");
        System.out.println("Ievadiet skaitli: ");
        int y = scanner.nextInt();
        int factorial = 1;
        for (int r = 1; r <= y; r++) {
            factorial = factorial * r;
        }
        System.out.printf("Faktoriāls %d = %d",y, factorial);

        System.out.println("\\\\6. uzdevums");
        int pin = 1596;
        int count = 0;
        do {
            System.out.print("Ievadi PIN: ");
            int num = scanner.nextInt();
            if (num != pin) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz!");
                count++;
            } else if (num == pin) {
                System.out.println("PIN ir pieņemts, laipni lūdzam!");
                break;
            } else {
                System.out.println("Atvainojiet, bet Jūs esat bloķēts!");
                // te ir problēma - nevaru saprast kas ir jāizdara, lai šis paziņojums parādās.
            }
        } while (count < 3);
    }
}
