package Assignment_2;
import java.util.Arrays;

public class problem3 {
    public static void main(String[] args) {
        String[] animals = {"horse", "dog", "cat", "horse", "dog"};
        //I have Added a variable to be used as a holder for the duplication process.
        int uniqueIndex = 0;
        //I have made it a Nested for loop that will run the length of array string and trigger the boolean value.
        for (int i = 0; i < animals.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < uniqueIndex; j++) {
                if (animals[i].equals(animals[j])) {
                    duplicate = true;
                    break;
                }
            }
            //I'm using this for storing the number of index passing the value of animals.
            if (!duplicate) {
                animals[uniqueIndex++] = animals[i];
            }
        }
        String[] newArray = Arrays.copyOf(animals, uniqueIndex);

        //for each loop to show the new contents of array and added a blankspace to its format.
        System.out.print("Removed Duplicated Array: ");
        for (String collections : newArray) {
            System.out.print(collections + " ");
        }
    }
}
