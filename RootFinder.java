import java.util.function.DoubleFunction;

public class RootFinder {
    public static void main(String[] args) {
        double a = 0.0;
        double b = 1.0;
        double eps = 1e-6;
        DoubleFunction<Double> f = x -> Math.sin(x) - x / 2;
        double root = Root(f, a, b, eps);
        System.out.println("Root found = " + root);
    }

    public static double Root(DoubleFunction<Double> f, double a, double b, double eps) {
        double m = (a + b) / 2;
        double fm = f.apply(m);
        double fa = f.apply(a);
        double fb = f.apply(b);

        if (Math.abs(b - a) < eps) {
            return m;
        } else if (fa * fm < 0) {
            return Root(f, a, m, eps);
        } else if (fb * fm < 0) {
            return Root(f, m, b, eps);
        } else {
            throw new IllegalArgumentException("No root found ");
        }
    }
    
}
