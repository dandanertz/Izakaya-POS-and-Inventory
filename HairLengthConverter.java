import javax.swing.JOptionPane;

class HairLengthConverter {
    public static void main(String[] args) {
        // get the number of hair strands from the user
        String inputStrands = JOptionPane.showInputDialog("Enter the number of hair strands:");
        int numStrands = Integer.parseInt(inputStrands);

        // create arrays to store the length of each strand in centimeters and meters
        double[] lengthsCm = new double[numStrands];
        double[] lengthsM = new double[numStrands];

        // get the length of each strand in centimeters from the user
        for (int i = 0; i < numStrands; i++) {
            String inputLength = JOptionPane.showInputDialog("Enter the length of hair strand #" + (i+1) + " in centimeters:");
            lengthsCm[i] = Double.parseDouble(inputLength);
            lengthsM[i] = lengthsCm[i] / 100.0; // convert to meters
        }

        // display the lengths of each strand in centimeters and meters
        String output = "Hair lengths:\n";
        for (int i = 0; i < numStrands; i++) {
            output += "Hair strand #" + (i+1) + ": " + lengthsCm[i] + " cm (" + lengthsM[i] + " m)\n";
        }
        JOptionPane.showMessageDialog(null, output);

        // calculate the total length of Ms. Cory's hair in kilometers and miles
        double totalLengthM = 0.0;
        for (int i = 0; i < numStrands; i++) {
            totalLengthM += lengthsM[i];
        }
        double totalLengthKm = totalLengthM / 1000.0;
        double totalLengthMi = totalLengthKm / 0.62;

        // display the total length of Ms. Cory's hair in kilometers and miles
        output = "Total hair length:\n";
        output += String.format("%.2f", totalLengthKm) + " km\n";
        output += String.format("%.2f", totalLengthMi) + " mi\n";
        JOptionPane.showMessageDialog(null, output);
    }
}
//CSA121 - DANIEL JOHN HENRICK D. SANCHEZ
