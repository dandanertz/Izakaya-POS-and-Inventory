import javax.swing.JOptionPane;
import java.lang.Math.*;

public class EmployeePay {
   public static void main(String[] args) {
        // Declare and initialize constants
        final double SSS = 175.89;
        final double PhilHealth = 300;
        final double AbscDeduc = 5.75;
        final double LateDeduc = 3.25;

        // Declare variables
        double ratePerHour, hours_worked, absences, lates;
        double gross, totalDeductions, net, roundNet;

        // Prompt the user to enter rate per hour, hours worked, absences, and lateness
        String rateStr = JOptionPane.showInputDialog("Enter rate per hour:");
        ratePerHour = Double.parseDouble(rateStr);

        String hoursStr = JOptionPane.showInputDialog("Enter hours worked:");
        hours_worked = Double.parseDouble(hoursStr);

        String absencesStr = JOptionPane.showInputDialog("Enter number of absences:");
        absences = Double.parseDouble(absencesStr);

        String latenessStr = JOptionPane.showInputDialog("Enter number of late days:");
        lates = Double.parseDouble(latenessStr);

        // Calculate gross pay
        gross = ratePerHour * hours_worked;
        
        // Calculate deductions
        totalDeductions = SSS + PhilHealth + (absences * AbscDeduc) + (lates *LateDeduc);

        // Calculate net pay
        net = gross - totalDeductions;
        roundNet = Math.round(net*100.0)/100.0;
        // Display the results
        JOptionPane.showMessageDialog(null, "Gross Pay: Php " + gross
            + "\nTotal Deductions: Php " + totalDeductions
            + "\nNet Pay: Php " + roundNet);
    }
    }
// CSA121 - DANIEL JOHN HENRICK D. SANCHEZ
