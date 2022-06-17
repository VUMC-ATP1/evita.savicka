package homework.classHomework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // 2. uzdevums
//  1.Izveidojiet trijstūri ar no-arg konstruktoru. Piešķiriet šim objektam malu vērtības un izsauciet visas metodes no šī objekta un izvadiet rezultātu uz ekrāna.
//	2.Izveidojiet jaunu trijstūri ar konstruktoru, kur visas malas tiek padotas jau konstruktorā. Izsauciet visas metodes no šī objekta un izvadiet rezultātus uz ekrāna.

	Scanner scanner = new Scanner(System.in);
    System.out.println("\\\\1. uzdevums");
    Triangle trijstūris = new Triangle();
        System.out.println("Ievadi trijstūra pirmās malas garumu: ");
        trijstūris.pirmāMala = scanner.nextInt();
        System.out.println("Ievadi trijstūra otrās malas garumu: ");
        trijstūris.otrāMala = scanner.nextInt();
        System.out.println("Ievadi trijstūra trešās malas garumu: ");
        trijstūris.trešāMala = scanner.nextInt();

        Triangle trijstūris1 = new Triangle(trijstūris.pirmāMala, trijstūris.otrāMala, trijstūris.trešāMala);

        System.out.println("Trijstūra laukums ir " + trijstūris1.trijstūraLaukums);

        if (trijstūris.vienādmaluTrijstūrijs()) {
            System.out.println("Tas ir vienādmalu trijstūris!");
        } else if (trijstūris.vienādsānutrijstūris()) {
            System.out.println("Tas ir vienādsānu trijstūris!");
        } else {
            System.out.println("Tas ir dažādmalu trijstūris!");
        }

        System.out.println("\\\\2. uzdevums");
        Triangle trijstūris2 = new Triangle(7, 9, 12);
        System.out.println("Trijstūra laukums ir " + trijstūris2.trijstūraLaukums);
        if (trijstūris2.vienādmaluTrijstūrijs()) {
            System.out.println("Tas ir vienādmalu trijstūris!");
        } else if (trijstūris2.vienādsānutrijstūris()) {
            System.out.println("Tas ir vienādsānu trijstūris!");
        } else {
            System.out.println("Tas ir dažādmalu trijstūris!");
        }
    }
}
