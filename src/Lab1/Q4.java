package Lab1;

/*
Write a program that asks the user to enter their full name, including first name, middle name if any, and surname, as one String.
The program should then output the following information:
•	The number of characters in the name (use the length() method)
•	The initial of the firstname (declare a char variable to hold the initial, and use charAt(0))
•	The name as entered, but entirely in capital letters (use toUpperCase())
•	The surname on its own (use lastIndexOf() to find the last space, then use substring)
*/

import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please enter your full name: ");

        //Use methods contained in the string/Character class to obtain the specified information
        int length = name.length();

        char initial = name.charAt(0);

        String upper = name.toUpperCase();

        //use lastIndexOf +1 to avoid including the final space itself
        String surname = name.substring(name.lastIndexOf(" ")+1);

        JOptionPane.showMessageDialog(null,"Number of characters in your name: " + length
                + "\nInitial of your first name: " + initial + "\nYour name in capital letters: " + upper + "\nYour last name: " + surname);
    }
}
