// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args) {
        int iterations = Integer.parseInt(args[0]);
        double approximateValue = 0.0;
        int divisor = 1;

        int currentIteration = 0;
        while (currentIteration < iterations) {
            if (currentIteration % 2 == 0) {
                approximateValue += 1.0 / divisor;
            } else {
                approximateValue -= 1.0 / divisor;
            }
            divisor += 2;
            currentIteration += 1;
        }

        System.out.println("pi according to Java: " + Math.PI +
                           "\npi, approximated:     " + (approximateValue * 4));
    }
}
