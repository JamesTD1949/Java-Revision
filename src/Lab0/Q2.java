package Lab0;
/*A cyclist is sponsored at the rate of 7c for each km up to 10 km, and 10c for each km in excess of 10km.
  Write a program which will ask for the cyclist’s first name, initial and last name and the distance cycled.
  Your program should calculate the money due, then display a dialog containing the cylist’s full name (first name + initial + last name),
  the distance cycled, and the money due. Note here that the problem involves 2 different rates if the number of km exceeds 10 so,
  for example, if the cyclist is sponsored for 15km then the first 10km are sponsored at 7c and the remaining 5 km are sponsored at 10c.
*/

import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {
        String forename;
        String surname;
        String initial;
        double distance;
        double cost;

        forename = JOptionPane.showInputDialog(null,"Please enter your forename: ");
        surname = JOptionPane.showInputDialog(null,"Please enter your surname: ");
        initial = JOptionPane.showInputDialog(null,"Please enter your middle initial: ");
        distance = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter the distance you cycled: "));

        if (distance>10)
        {
            cost = (0.7 + (distance-10.)*0.1);
        }
        else
        {
            cost = (distance * 0.07);
        }

        JOptionPane.showMessageDialog(null,"Your full name is: " + forename + " " + initial + " " + surname + ".\nYou cycled: " + distance +
                "km.\nMoney due " + cost + " euro.","Cycle Details",JOptionPane.INFORMATION_MESSAGE);
    }

}
