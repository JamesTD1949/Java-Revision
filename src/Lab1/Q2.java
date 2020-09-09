package Lab1;

/*Write a program to produce the following table using a for loop. Send the output to a JTextArea and display the JTextArea within a message dialog.
  Don’t worry about aligning the layout. There are 12 inches in one foot and 3 feet in one yard.
*/

import javax.swing.*;

public class Q2 {
        public static void main(String[] args) {

            //create table headings
            String table = "Yards     Inches\n--------     ------\n";

            //create 10 line table using a for loop
            for(int i=1;i<=10;i++)
            {
                table += i + "          " + i*36 + "\n";
            }

            //create a JTextArea object named area
            JTextArea area = new JTextArea();

            //append the 10 line table created above to the JTextArea
            area.append(table);

            //display JTextArea
            JOptionPane.showMessageDialog(null,area);
        }
}
