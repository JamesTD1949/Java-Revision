package Lab0;

/*Write a program which will ask for a person’s name and taxable income, calculate the tax due and the net income after tax,
  and display the gross income, the tax rate, the tax and the income after tax.
*/

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        String name;
        double income;
        double taxRate;
        double netIncome;
        double taxPayable;

        name = JOptionPane.showInputDialog(null,"Please enter your full name: ");
        income = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your taxable income: "));

        taxRate = returnTaxRate(income);

        taxPayable = calculateTax(income,taxRate);

        JOptionPane.showMessageDialog(null,"Your name is: " + name + ".\nYour gross income is: " + income +" Euro.\n" +
                "Your tax rate is: " + taxRate + "%.\nYour tax payable is: " + taxPayable + " Euro.\nYour net income is: " + (income-taxPayable) + " Euro.");

    }

    private static double returnTaxRate(double income)
    {
        if(income<=20000)
        {
            return 0;
        }
        else if(income<=36000)
        {
            return 0.2;
        }
        else
        {
            return 0.41;
        }
    }

    private static double calculateTax(double income, double taxRate)
    {
        return income*taxRate;
    }
}
