package org.horizoncolumbus.hs;

import java.util.*;

public class SquareRooter {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int numbers[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number:");
            numbers[i] = input.nextInt();
        }

        for (double rootedNumber : numbers){
            rootedNumber = Math.sqrt(rootedNumber);
            System.out.print(rootedNumber + "\t");
        }
    }
}
