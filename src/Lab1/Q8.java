package Lab1;

/*Write a program that asks the user to input a list of 10 integers. Store these values in an array of the required size and output the 1st and 5th values in the array.
  Use a for loop to read in the values efficiently.
*/

import javax.swing.JOptionPane;

public class Q8 {
    public static void main(String[] args) {

        int[] contain = new int[10];

        //standard for loop to take in 10 user supplied integer values
        for(int i=0;i<10;i++)
        {
            String numberAsString = JOptionPane.showInputDialog("Please enter an integer: ");

            int number = Integer.parseInt(numberAsString);

            contain[i] = number;
        }

        //displayed the requested items in the array using their index
        JOptionPane.showMessageDialog(null,"The first value in the array is " + contain[0]
                + "\nThe fifth value in the array is " + contain[4]);

    }
}
