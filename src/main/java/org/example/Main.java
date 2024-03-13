package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
    int length = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert the length of the array"));
    int[] numbers = new int[length];
    Main.insertData(numbers);
    Main.showData(numbers);
    }

    public static void insertData(int[] numbers){

        JOptionPane.showMessageDialog(null, "Insert data of array");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(JOptionPane.showInputDialog(
                                    null,
                                    "Insert a number "+ (i+1
                                    )
                            )
            );
        }
    }

    public static void showData(int[] numbers){
        int i = 0;
        for (int number : numbers) {
            System.out.println((i + 1) + " " + number);
            i++;
        }
    }
}