package Hell;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fraction fraction1 =new Fraction();
        int d = in.nextInt();
        Fraction fraction2 = new Fraction(d,in.nextInt());
        //System.out.println(fraction1);
        //fraction2.printFraction();
        Fraction fraction3 = new Fraction(10, 10);
        //fraction2.multyOnKoeff(2);
        //System.out.println(fraction2);
        //fraction1 = fraction2.multyFraction(fraction3);
        //System.out.println(fraction1);
        //fraction1 = fraction2.SumOfFraction(fraction3);
        //System.out.println(fraction1);
        fraction1 = fraction2.MinsOfFraction(fraction3);
        System.out.println(fraction1);
    }
}

