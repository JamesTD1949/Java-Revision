package Lab1;

/*Write a program to calculate the cost of carpeting a room wall to wall.
  The user should be asked for his/her name, the length of the room, breadth of the room and cost per square metre of the carpet,
  each to be entered via an input dialog. The program should then generate a quotation for the customer containing information in the following format.
  Suggestion: send the output initially to System.out: when you have that working, transfer it to a JTextArea within a message dialog.
  You will need to set the Font of the JTextArea to a monospaced font.
 */

import javax.swing.*;
import java.awt.*;

public class Q3 {
    public static void main(String[] args) {

        //take in required information via JOptionPane input dialogs
        String name = JOptionPane.showInputDialog("Please enter your name: ");

        String lengthAsString = JOptionPane.showInputDialog("Please enter the length of your room in metres: ");

        String breadthAsString = JOptionPane.showInputDialog("Please enter the breadth of your room in metres:");

        String costAsString = JOptionPane.showInputDialog("Please enter the cost per square metre of your carpet: ");

        //convert the string values obtained above to double so they can be used in calculations
        double length = Double.parseDouble(lengthAsString);

        double breadth = Double.parseDouble(breadthAsString);

        double cost = Double.parseDouble(costAsString);

        //calculate area of the room
        double area = length*breadth;

        //format output string
        String output = String.format("Quotation for "+ name + "\n%-60s%.2f m.\n%-59s%.2f m.\n%-58s%.2f m.\n%-50s%.2f euro\n%-60s%.2f euro.","Length of room:",length,"Breadth of room:",breadth,"Total area of the room:",area,"Cost per square metre of carpet:",cost,"Total cost of carpet:",cost*area);

        //create JTextArea object named template
        JTextArea template = new JTextArea();

        //create a font object named font with the specified attributes
        Font font = new Font("courier",Font.PLAIN,15);

        //set the created font on the created JTextArea
        template.setFont(font);

        //add the output string to the JTextArea
        template.append(output);

        JOptionPane.showMessageDialog(null,template);

    }
}
