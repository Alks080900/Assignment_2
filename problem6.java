package Assignment_2;

public class problem6 {

    static int min(int[] arrayofInts) {
        //I have added a variable that will hold the current value in the array that has met the condition
        int min = 0;
        for (int i = 0; i < arrayofInts.length; i++) {
            //I have just applied simple for-loop then comparing it current index (i) to the array of index 0
            //it will run the loop until it will found the condition to which is the most minimum one
            if (arrayofInts[i] < arrayofInts[0]) {
                min = arrayofInts[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arrayofInts = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        System.out.println("Minimum value in the array: " + min(arrayofInts));
    }
}
