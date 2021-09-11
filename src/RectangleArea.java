/*
 *UCF COP3330 Fall 2021 Assignment 1.7 Solution
 * Copyright 2021 Ronald Lemus
 */


import java.util.Scanner;

public class RectangleArea {
    public static void main(String [] args){
        System.out.print("What is the length of the room in feet? ");
        Scanner lengthInp = new Scanner(System.in);
        int length = lengthInp.nextInt();

        System.out.print("What is the width of the room in feet? ");
        Scanner widthInp = new Scanner(System.in);
        int width = widthInp.nextInt();

        int areaFeet = length * width;
        float areaMeters = (float) (areaFeet * .09290304);

        System.out.printf("The area is\n%d square feet\n%.3f square meters",areaFeet,areaMeters);




    }
}
