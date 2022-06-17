package homework.classHomework;

public class Triangle {
    // 1. uzdevums
//    a.Visu malu garumu mainīgie (veseli skaitļi) un laukums
//    b.No-arg konstruktors, kas pasaka, ka mēs veidojam trijstūri
//    c.Arg konstruktors, kur tiek padotas visas trīs malas un
//    uzreiz aprēķināts trijstūra laukums un saglabāts laukuma mainīgajā
//    d.Metode, kas atgriež true/false vai trīsstūris ir vienādmalu
//    e.Metode, kas atgriež true/false vai trīsstūris ir vienādsānu

    public int pirmāMala;
    public int otrāMala;
    public int trešāMala;
    public int trijstūraLaukums;

    public Triangle() {
        System.out.println("Mēs veidojam trijstūri!");
    }

    public Triangle(int pirmāMala, int otrāMala, int trešāMala) {
        this.pirmāMala = pirmāMala;
        this.otrāMala = otrāMala;
        this.trešāMala = trešāMala;

        double pusperimetrs = (this.pirmāMala + this.otrāMala + this.trešāMala) / 2d;
        double laukums = Math.sqrt(pusperimetrs * (pusperimetrs - this.pirmāMala) * (pusperimetrs - this.otrāMala) * (pusperimetrs - trešāMala));
        this.trijstūraLaukums = (int) laukums;
        }

    public boolean vienādmaluTrijstūrijs() {
        return this.pirmāMala == this.otrāMala && this.otrāMala == this.trešāMala;
    }
    public boolean vienādsānutrijstūris() {
        return this.pirmāMala == this.otrāMala || this.otrāMala == this.trešāMala || this.pirmāMala == this.trešāMala;
    }
    }



