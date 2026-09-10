//Positive integer test case
public class NumberRiddlePositiveInt{
    public static void main (String [] args){
        int originalInput = 2; //Enter a test value
        System.out.println("You chose: " + originalInput);
        //Converting original number to a double data type
        double currentInput = 2* originalInput;
        System.out.println("Step 1 (Double the number): "+ currentInput);
        // Adding 6 to the number
        currentInput += 6;
        System.out.println("Step 2 (Add 6 to number): "+ currentInput);
        //Dividing the number by 2 
        currentInput /=2;
        System.out.println("Step 3 (Divide by 2): "+ currentInput);
        // Subtracting the original number from the current number
        currentInput = currentInput - originalInput;
        System.out.println("Subtract Current by Original --> Final Output: "+ (int)currentInput); //Display the final output

    }
}