import java.math.*;

public class HotCold {

    private static int makeGuess(int secret, int range){
        int prevGuess = 1;
        int guess = range;
        int min = 1;
        int max = range;
        boolean hot;

        if (prevGuess == secret){return prevGuess;}
        if (guess == secret){return guess;}

        while (guess != secret){
            if (Math.abs(prevGuess - secret) > Math.abs(guess - range)){hot = true;}
            else {hot = false;}

            if (hot){
                
                prevGuess = guess;
                guess
            }
            else{

            }
        }


        return guess;
    }
    
}
