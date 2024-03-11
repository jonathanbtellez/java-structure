package org.example;

import javax.swing.*;

public class Main01 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(numbers[4]);

        System.out.println("Search a element");

        for (int number : numbers) {
            String result = (number == 5) ? "the number 5 is part of the array" : "not fount";
            System.out.println(result);
        }

        double[] notes = new double[6];

        System.out.println("Insert the notes");

        for(int i = 0; i < notes.length; i++){
           notes[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "insert the note"));
        }

        System.out.println("Show approved notes");
        int aprovedNotes = 0;
        for (double note : notes){
            if(note > 3.4){
                aprovedNotes++;
                System.out.println("The note " + note + " was approved");
            }else{
                System.out.println("The note " + note + " was rejected");
            }
        }

        if(aprovedNotes <= 3) JOptionPane.showMessageDialog(null, "You are losing the year","Danger",JOptionPane.WARNING_MESSAGE);
    }
}