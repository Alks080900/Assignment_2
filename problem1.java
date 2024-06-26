package Assignment_2;

import java.util.*;

public class problem1 {

    static Random random;

    private problem1() {
        random = new Random();
    }

    public static int getRandomInt() {
        if(random == null) new problem1();
        return random.nextInt();
    }

    public static int getRandomInt(int lower, int upper) {
        if(lower > upper) return 0;
        if(lower == upper) return lower;
        int difference = upper - lower;
        int start = getRandomInt();
        start = Math.abs(start) % (difference+1);

        start += lower;
        return start;
    }

    //Rules: PI to the power of X & Y to the power of PI
    public static void main(String[] args){
        double pi = Math.PI;
        //Added a variable that will get the upper and lower for X and Y since they are in different range.
        int randomX = getRandomInt(1, 9);
        int randomY = getRandomInt(3, 14);
        //Created a variable to do the calculation
        double resultForX = Math.pow(pi, randomX);
        double resultForY = Math.pow(randomY, pi);
        //I have also show the random generated number first to see if the calculation is correct.
        //Applied a Math round function to clean the decimal places of the result.
        System.out.println("The random number for X is: " + randomX);
        System.out.println("The calculation for the PI to the power of X is: " + Math.round(resultForX));
        System.out.println("The random number for Y is: " + randomY);
        System.out.println("The calculation for the Y to the power of PI is: " + Math.round(resultForY));
    }


}