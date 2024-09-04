import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc=new Calc();
        System.out.println("Console Based Calculator!");
        while (true) {
            System.out.println("1.Add  ->requires(int x,int y)");
            System.out.println("2.Subtract  ->requires(int x,int y)");
            System.out.println("3.Multiply  ->requires(int x,int y)");
            System.out.println("4.Divide  ->requires(int x,int y)");
            System.out.println("5.SqrRoot  ->requires(int x)");
            System.out.println("6.Exponent  ->requires(int x,int y)");
            System.out.println("7.American Currency($) to Indian Currency(Rs)->requires(int AmericanDollar)");
            int choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(x + " + " + y + " = " + calc.add(x, y));
                    break;
                }
                case 2: {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(x + " - " + y + " = " + calc.sub(x, y));
                    break;
                }
                case 3: {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(x + " x " + y + " = " + calc.mul(x, y));
                    break;
                }
                case 4: {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(x + " / " + y + " = " + calc.div(x, y));
                    break;
                }
                case 5: {
                    int x = sc.nextInt();
                    System.out.println("Square root of " + x + " is " + calc.sqrRoot(x));
                    break;
                }
                case 6: {
                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    System.out.println(x + " ^ " + y + " = " + calc.exponent(x, y));
                    break;
                }
                case 7: {
                    int x = sc.nextInt();
                    System.out.println("Dollars to Rupees: " + calc.AmericanCurrencyToIndian(x));
                    break;
                }
            }
        }
    }
}