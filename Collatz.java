// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        
        int seeds = Integer.parseInt(args[0]);
        String mode = args[1].toUpperCase();
        
        if (mode.equals("V")) {
            int currentSeed = 1;
            while (currentSeed <= seeds) {

                System.out.print(currentSeed + " ");
                int value = currentSeed;
                int startingValue = currentSeed;
                int steps = 1;

                if (value == 1) {
                    System.out.print("4 2 1 (4)\n");
                } else {
                    while (value != 1) {
                        if (value % 2 == 0) {
                            steps += 1;
                            value /= 2;
                        } else {
                            steps += 1;
                            value = value * 3 + 1;
                        }
                        System.out.print(value + " ");
                    }
                }
                
                if (startingValue != 1) {
                    System.out.print("(" + steps + ")\n");
                }
                currentSeed++;
            }
            
            System.out.println("Every one of the first " + seeds + " hailstone sequences reached 1.");

        } else {
            System.out.println("Every one of the first " + seeds + " hailstone sequences reached 1.");
        }
    }
}
