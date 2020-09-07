/*A simple calculation. The canteen is offering a special start-of-year mineral-and-muffin snack deal at 2 euro per snack.
  Write a program which will ask you to enter your name, your class name and how many snacks you’d like,
  and which will calculate and display in a dialog your name and class, the number of snacks you asked for and what you will have to pay.
 */
package Lab0;

import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
      String name;
      String className;
      int noSnacks;

      name = JOptionPane.showInputDialog(null,"Please enter your name: ");
      className = JOptionPane.showInputDialog(null,"Please enter your class name: ");
      noSnacks = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the number of snacks you'd like to buy: "));

      JOptionPane.showMessageDialog(null,"Your name is: " + name + ".\nYour class is: " + className + ".\nYour requested " + noSnacks + " snacks."
        + "\nTotal cost: " + noSnacks*2 + " Euro.");
    }
}
