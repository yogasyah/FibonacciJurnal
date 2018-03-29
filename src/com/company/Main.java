package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i,j,temp;
        int input = Integer.parseInt(JOptionPane.showInputDialog("masukkan integer positif"));
        int SIZE = (input*2) +1;
        int [] array= new int [SIZE];
        int sum=2; // array [0] + array [1] pasti 2
        int median;

// mengisi array membentuk deret fibonnaci
        array [0] = 0;
        array [1] = 1;

//mengisi array
        for (i=2; i<array.length; i++) {
            array [i] = array [i-1] + array [i-2];
        }

// menghitung median
        if (SIZE % 2 == 0) {
            median = array [(SIZE/2)-1] + array [SIZE/2];
        }
        else {
            median = array [SIZE/2];
        }

// menghitung mean
        for (i=2; i<array.length; i++) {
            sum = sum + array [i] ;
        }

        int mean = sum/SIZE;

//bubble sort (DESCENDING)
        for (i=0; i<array.length-1; i++) {
            for (j=0; j<array.length-1; j++) {
                if (array [j]< array [j+1] ) {
                    temp = array [j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                }
            }
        }
// printing everything.. hehehe
        System.out.println("deret : ");
        for (i=0; i<array.length; i++) {
            System.out.print (array [i]+ " ");
        }
        System.out.println (" ");

        System.out.println ("mean :" + mean);
        System.out.println ("median:"+ median);

    }
	// write your code here
    }
