package Lab1;

import javax.swing.*;

/*Look up the internet to see what the exchange rate for GB£ is today (in euro per GB£), then write a program which converts from GB£ to euro.
  The program should ask you to enter the exchange rate once, then the program should contain a while loop which repeats automatically for an arbitrary number of conversions, terminating when a sum of £0 is entered.
  Both GB £ and euro should be displayed correct to 2 decimal places with each loop iteration, and each output dialog should contain the exchange rate in its title.
 */
public class Q1 {
    public static void main(String[] args) {

        //declare required variables
        double rate;
        double gb;
        int conversion_count = 0;

        //ask the user for today's exchange rate and typecaste it to a double
        rate = Double.parseDouble(JOptionPane.showInputDialog("Please enter today's GB to Euro exchange rate: "));

        //ask the user for the first gb value - do it here so we don't have to enter loop if first value supplied is 0
        gb = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of GB you'd like to exchange (0 to exit): "));

        //while loop that executes until user supplies 0 as gb value
        while (gb!=0)
        {
            //simple message dialog to display gb and equivalent euro value
            JOptionPane.showMessageDialog(null,"GB to be exchanged: " + String.format("%.2f",gb) +
                    "\nEquivalent Euro value: " + String.format("%.2f",gb*rate),"Today's Exchange rate: " + String.format("%.2f",rate),JOptionPane.INFORMATION_MESSAGE);

            conversion_count++;

            gb = Double.parseDouble(JOptionPane.showInputDialog("Please enter the amount of GB you'd like to exchange (0 to exit): "));
        }
        //simple message dialog to display how many conversions were carried out
        JOptionPane.showMessageDialog(null,"Thank you. You did " + conversion_count + " conversion/s","Exit",JOptionPane.INFORMATION_MESSAGE);
    }
}
