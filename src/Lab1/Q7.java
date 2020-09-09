package Lab1;

/*Write a program that asks the user to input an arbitrary number of integer values (terminated by –1)
and passes them one at a time to a user-defined method called isEven() which uses the remainder (%) operator to determine if an integer is even.
The method should take an integer argument and return the boolean value “true” if the integer passed in is even and “false” otherwise.
 */

import javax.swing.*;

public class Q7 {
    public static void main(String[] args) {
        int value;

        //ask for value here to avoid executing while loop when -1 is first value supplied
        value = Integer.parseInt(JOptionPane.showInputDialog("Please enter the integer you want to check is even (-1 to exit):"));

        while(value!=-1)
        {
            //practice using shorthand if statement
            String result = (isEven(value) ? "even" : "odd");

            JOptionPane.showMessageDialog(null,value + " is " + result + ".",result,JOptionPane.INFORMATION_MESSAGE);

            value = Integer.parseInt(JOptionPane.showInputDialog("Please enter the integer you want to check is even (-1 to exit):"));
        }
    }

    //simple user defined function to return true when the value is even and false when not
    private static boolean isEven(int value)
    {
        return value % 2 == 0;
    }
}
