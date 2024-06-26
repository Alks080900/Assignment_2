package Assignment_2;

public class problem4 {
    public static void main(String[] args) {
        float a = 1.27F;
        float b = 3.881F;
        float c = 9.6F;
        float floatSum = a+b+c; //Provided the non-casted sum,
        int sumOfFloat = (int) (a+b+c); //Casting into integer.
        System.out.println("Before casting the sum of floats: " + floatSum);
        System.out.println("The sum of all floats that has been casted is: " + sumOfFloat);
        //Manually calculate the sum of float inside the Math round function.
        System.out.println("the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, is : " + Math.round(a+b+c));
    }
}