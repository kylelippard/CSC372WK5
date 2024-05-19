import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean done = false; // created bool to control do/while loop.
        int[] arr = new int[5];
        
        do { //do this while done is false
            try { //try catch block to handle incorrect input.
                fillArray(arr); //call fillArray method
                done = true;// if fillArray completes with no errors, do while loop ends.

            } catch (Exception e) {
                System.out.print("Please start over with only enter integers for array.");
            }
        } while(!done);// if error is caught before fillArray finishes, the loop will start over.

        System.out.println(product(arr, 0));//calls method for multplying numbers togehter using recursion.

    }
    public static void fillArray(int[] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter 5 numbers for the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }
    public static int product(int[] k, int i) {
        if(i == k.length) {
            return 1;
        }else {
            return k[i] * product(k, i+1);
        }
    }
}