/*An Equilibrium Index of a sequence of numbers is an index where the sum of all
  elements with a lower index is equal to the sum of all elements with a higher index
  (the number in the sequence at the index is not included in either sum).
  Given a sequence of numbers, the task is to find the equilibrium indices of the sequence
*/

package Lab0;

import javax.swing.*;
import java.util.ArrayList;

public class EquilibriumIndex {
    public static void main(String[] args) {
        //Ask the user for
        String lengthAsString = JOptionPane.showInputDialog("Please enter the length of the sequence: ");

        int length = Integer.parseInt(lengthAsString);
        int[] sequence = new int[length];

        for(int i=0;i<length;i++)
        {
            String numberAsString = JOptionPane.showInputDialog("Please enter number " + (i + 1) + " of the sequence: ");

            int number = Integer.parseInt(numberAsString);

            sequence[i]=number;
        }

        ArrayList<String> index = getIndex(sequence,length);

        JOptionPane.showMessageDialog(null,"The equilibrium index/s for this sequence are: " + index);



    }

    private static ArrayList<String> getIndex(int[] numbers,int length)
    {
        ArrayList<String> equal = new ArrayList<>();

        for(int i=1;i<length;i++)
        {

            int lower = 0, higher = 0;
            for(int j=0;j<i;j++)
            {
                lower += numbers[j];
            }
            for(int j=i+1;j<length;j++)
            {
                higher += numbers[j];
            }

            if(higher==lower)
            {
                equal.add(Integer.toString(i));
            }

        }

        return equal;
    }
}
