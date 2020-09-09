package Lab1;

/*Write your own user-defined method called cube() which is passed an integer value and returns the cube of it (i.e. it will return an integer also).
  In your main() method you should have this method called repeatedly (using a loop) to display a table of values between 1 and 15 inclusive along with their cubes as indicated in the screen capture below.
*/

public class Q6 {
    public static void main(String[] args) {

        //add the headings to the table
        String output = String.format("%-20s%s\n%-20s%s", "Number", "Cube", "\n------", " ----\n");

        //create the fifteen lines of the cube table using a for loop that contains a call to the user defined method
        for(int i=1;i<=15;i++)
        {
            output += String.format("%-20s%.0f\n",i,cube(i));
        }

        System.out.println(output);


    }

    //basic user defined method to cube the supplied int
    private static double cube(int i)
    {
        return Math.pow(i,3);
    }
}
