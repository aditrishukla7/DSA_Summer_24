import java.util.Scanner;
public class InClassAssignment1 {
    
    public static void main(String[] args) {
        double [] myList = new double[3];
        Scanner keyboard = new Scanner(System.in);
        
        // Problem 1
        System.out.println("Enter " + myList.length + " values: ");
        for (int i=0; i<myList.length; i++) {
            System.out.print("Value " + (i+1) + ": ");
            myList[i] = keyboard.nextDouble();
        }
        /*
        // Problem 2
        System.out.println("Display " + myList.length + " values: ");
        for (int i=0; i<myList.length; i++) {
            System.out.printf("Value %d: %0.2f\n", (i+1), myList[i]);
        }
        */
        
        // Problem 3
        double total = myList[0] + myList[1] + myList[2];
        System.out.println("Total sum of list: " + total);
        
        // Problem 4
        double bigNum = 0;
        for (var i = 0; i < myList.length; i++) {    
            if ( myList[i] > bigNum ) {
                bigNum = myList[i];
            }
        }
        System.out.println("The largest number in the list: " + bigNum);
        
        // Problem 5
        int index = 0;
        bigNum = 0;
        for (var i = 0; i < myList.length; i++) {    
            if ( myList[i] > bigNum ) {
                index = i;
                bigNum = myList[i];
            }
        }
        System.out.println("Find the smallest index of the larget element in the array: " + index);
        
        // Problem 7
        double [] myListShift = new double[3];
        myListShift[0] = myList[myList.length-1];
        int i = 1;
        while (i < myList.length) {
            myListShift[i] = myList[i-1];
            i++;
        }
        
        for (int k=0; k < myListShift.length; k++) {
            System.out.print(myListShift[k] + " ");
        }
    }
}
