package tasks.task017;

public class Task017 {
    public static double equation(double x) {
        return Math.cos(x * x * x * x * x) + x * x * x * x - 343.3 * x - 23;
    }

    /** Решение рекурсией */
    public static double run2(double a, double b) {

        var EPS = 0.001;
        if (Math.abs(equation(a)) <= EPS) return a;
        if (Math.abs(equation(b)) <= EPS) return b;
        if (Math.abs(a - b) <= EPS) return a;

        var i = (a + b) / 2;

        if (equation(a) * equation(i) <= 0) return run2(Math.min(a, i), Math.max(a, i));
        else return run2(Math.min(b, i), Math.max(b, i));
    }

    /** Решение циклом */
    public static double run() {
        double xN = 0.0;
        double xK = 10.0;
        double eps = 0.001;
        double xi = 0.0;
        if (equation(xN) == 0) {
            return  xN;
        }
        if (equation(xK) == 0) {
            return  xK;
        }
        while (xK - xN > eps) {
            double dx = (xK - xN) / 2;
            xi = xN + dx;

            if (equation(xN) * equation(xi) < 0) {
                xK = xi;
            } else {
                xN = xi;
            }
        }
        return xi;
    }
}
