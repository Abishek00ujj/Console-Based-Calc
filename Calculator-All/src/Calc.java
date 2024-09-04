public class Calc
{
    public static double add(int x, int y) {
        return x + y;
    }

    public static double sub(int x, int y) {
        return x - y;
    }

    public static double mul(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        if (y == 0) {
            System.out.println("Can't divide " + x + " by 0");
            return 0;
        }
        return (double) x / y;
    }

    public static double sqrRoot(int x) {
        return Math.sqrt(x);
    }

    public static double exponent(int x, int y) {
        return (double) Math.pow(x, y);
    }

    public static double AmericanCurrencyToIndian(int x) {
        return (double) x * 83.963;
    }
}
