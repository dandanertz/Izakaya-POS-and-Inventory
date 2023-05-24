import javax.swing.JOptionPane;

public class Calculator {
  public static void main(String[] args) {
    // Prompt the user to enter two numbers
    String input1 = JOptionPane.showInputDialog("Enter the first number:");
    String input2 = JOptionPane.showInputDialog("Enter the second number:");

    // Convert the inputs to double values
    double num1 = Double.parseDouble(input1);
    double num2 = Double.parseDouble(input2);

    // Calculate the sum, difference, product, and quotient
    double sum = num1 + num2;
    double difference = num1 - num2;
    double product = num1 * num2;
    double quotient = num1 / num2;

    // Display the results
    String message = "The sum of the two numbers is: " + sum + "\n"
                   + "The difference of the two numbers is: " + difference + "\n"
                   + "The product of the two numbers is: " + product + "\n"
                   + "The quotient of the two numbers is: " + quotient;
    JOptionPane.showMessageDialog(null, message);
  }
} 
// CSA121 - DANIEL JOHN HENRICK D. SANCHEZ
