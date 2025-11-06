//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String phrase = args[0].toUpperCase();
            int iterations = Integer.parseInt(args[1]);
            int currentChar = 0;

            while (currentChar < phrase.length()){
                char c = phrase.charAt(currentChar);

                if (c == 'A' || c == 'E' || c == 'F' || c == 'H' || 
                    c == 'I' || c == 'L' || c == 'M' || c == 'N' || 
                    c == 'O' || c == 'R' || c == 'S' || c == 'X') {
                    System.out.println("Give me an " + c + ": " + c + "!");
                } else {
                    System.out.println("Give me a  " + c + ": " + c + "!");
                }
                
                currentChar += 1;
            }
            
            System.out.println("What does that spell?");
            
            int currentIteration = 0;

            while (currentIteration < iterations){
                System.out.println(phrase+"!!!");
                currentIteration +=1;
            }
        }
}
