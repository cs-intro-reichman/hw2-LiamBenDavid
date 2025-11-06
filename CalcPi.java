// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args) { 
        int iterations = Integer.parseInt(args[0]);
        double approximateValue = 1;
        int divisor = 3;

        int currentIteration = 1;
        while (currentIteration <= iterations){
            if (currentIteration % 2 == 0){
                approximateValue = approximateValue - (1.0/divisor);
            } else{
                approximateValue = approximateValue + (1.0/divisor);
            }
            divisor += 2;
            currentIteration += 1;
        }

        System.out.println("pi according to Java: " + Math.PI + "\npi, approximated:     " + (approximateValue * 4));

    }

}
