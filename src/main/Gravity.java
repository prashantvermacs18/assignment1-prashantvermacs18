/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

import java.util.Scanner;

public class Gravity {
	public static void main(String[] args) {
        double s;
        double d;
        double g = 9.8;
        Scanner input = new Scanner(System.in);
        double time = input.nextDouble();
        s = g * time;
        d = (g * Math.pow(time, 2)) / 2;
        System.out.println("The speed of the object at " + time + " seconds after its release is " + s + " and the distance the object has travelled in the " + time + " seconds after the release is " + d);
    }
}

