package Lab1;

/*You have taken a job working at the cattle mart for the summer. Write a program that declares an array of 10 doubles and initializes it to the weight in kilos of 10 animals. Your program should output the following:
(a) All the weights, along a line
(b) the number of animals weighing less than 250 kilos
(c) the percentage of animals weighing at least 400 kilos
(d) the lightest animal
(e) the average weight of all the animals
Note the average is displayed correct to 1 decimal place.
*/
import javax.swing.*;

public class Q9 {
    public static void main(String[] args) {

        //declare necessary variables
        double[] weights = new double[] {234.274,123.0,344.8,455.4,150.6,234.2,123.0,344.8,455.4,150.6};
        String allWeights = "Weights: ";
        int overTwoFifty=0;
        double lightest=0;
        double total=0;
        double overFourHundred=0;

        //simple for loop to iterate through the contents of the weights array
        for(int i=0;i<weights.length;i++)
        {
            //simple if-else statement to avoid putting an extra comma at the end of the allWeights string
            if(i<=weights.length-2)
                allWeights += weights[i]+",";
            else
                allWeights += weights[i];

            //three simple conditionals to check if the current weight fits the specified criteria
            if(weights[i]<250.0)
            {
                overTwoFifty++;
            }
            else if(weights[i]>400.0)
            {
                overFourHundred++;
            }
            if(i==0 || weights[i]<lightest)
            {
                lightest = weights[i];
            }

            total+=weights[i];
        }

        //simple message dialog displaying information obtained in the for loop
        JOptionPane.showMessageDialog(null,allWeights + "\nNumber under 250kg: " + overTwoFifty +
                "\nPercentage over 400 kg: " + (overFourHundred/weights.length)*100 + "%\nLightest Animal: " + lightest
                + "\nAverage weight: " + String.format("%.1f",total/weights.length) + " kg");
    }
}
