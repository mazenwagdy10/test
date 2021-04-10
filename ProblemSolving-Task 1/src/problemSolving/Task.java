package problemSolving;

public class Task {

    public static void main(String[] args){
        int arr[]={1,-4,7,12};
        int oddSum=0;
        for (int j : arr) {
            if (j % 2 != 0) {
                oddSum = oddSum + j;
            }
        }
        System.out.println("Sum of odd is: " +oddSum);
    }
}

