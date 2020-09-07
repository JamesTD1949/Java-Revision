package Lab0;

/*. Switch case, and char variables. Write a program that reads in the following values:-
(a) operation desired - 	A (for addition)
S (for subtraction)
M (for multiplication)
D (for division)
(b) a number
(c) another number

The program should carry out the operation on the numbers e.g. if the input is M 1.5 3 then the output would be 1.5*3 i.e. 4.500. Use a switch statement here and have a default case to handle any exceptional circumstances. Use dialogs for all input and output.
*/

import javax.swing.*;

public class Q4 {
    public static void main(String[] args) {
        double firstNumber;
        double secondNumber;
        char choice;
        String input;
        String firstString;
        String secondString;

        input = JOptionPane.showInputDialog("A (for addition)\n" +
                "S (for subtraction)\n" +
                "M (for multiplication)\n" +
                "D (for division)\n" +
                "Please enter your desired operation code and two numbers sepearated by a single space");

        firstString = input.substring(input.indexOf(' '),input.lastIndexOf(' '));
        secondString = input.substring(input.lastIndexOf(' '));

        firstNumber = Double.parseDouble(firstString);
        secondNumber = Double.parseDouble(secondString);
        choice = input.charAt(0);

        switch(Character.toUpperCase(choice))
        {
            case 'A':
            {
                JOptionPane.showMessageDialog(null,firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
                break;
            }
            case 'S':
            {
                JOptionPane.showMessageDialog(null,firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
                break;
            }
            case 'M':
            {
                JOptionPane.showMessageDialog(null,firstNumber + " * " + secondNumber + " = " + (firstNumber*secondNumber));
                break;
            }
            case 'D':
            {
                JOptionPane.showMessageDialog(null,firstNumber + " / " + secondNumber + " = " + (firstNumber/secondNumber));
                break;
            }
            default:
            {
                JOptionPane.showMessageDialog(null,"Invalid code specified.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }


    }

}
