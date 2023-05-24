import java.util.Scanner;
import java.util.HashMap;
class CustomerBill
{
    public static void main (String args[])
    {
        Scanner scn = new Scanner(System.in);
        final double VAT = 0.038;
        String Model, Color;
        double price;
        int Quantity;
        double Credit;
        
        HashMap<String, Double> Phones = new HashMap<String, Double>();
        Phones.put("Nokia",550.00);
        Phones.put("Samsung",54000.00);
        Phones.put("Apple", 68000.00);

        System.out.println("Enter Cash Amount >>> ");
        Credit = scn.nextDouble();

        GeneratePhoneList(Phones);
        System.out.println("Phone Model >>> ");
        Model = scn.next();

        System.out.println("Color >>> ");
        Color = scn.next();

        System.out.println("Quantity >>> ");
        Quantity = scn.nextInt();

        try {
            price = Phones.get(Model);
            Double grossTotal = price * Quantity;
            Double vat = ApplyVAT(grossTotal, VAT);
            Double result = BillGenerator(grossTotal, vat, Credit);
            if (result > 0) {

                System.out.println(String.format("\nSales: %d amount of %s phone with the color %s.\nThank you!", Quantity, Model, Color));
            } 
            else {
                System.out.println("Insufficient credits.");
            }
        } 
        catch (Exception e) {
            System.out.println("There is no such model. Please input the corresponding model");
        }
        scn.close();

    }
    public static void GeneratePhoneList(HashMap<String, Double> phoneList) {
        System.out.println("List of phone brands with its price...");
        phoneList.forEach((key, value) -> {
            System.out.println(String.format("%10s : %8.2f", key, value));
        });
    }

    public static double ApplyVAT(double bill, double rate) {
        return bill * rate;
    }

    public static double BillGenerator(double total, double vat, double credits) {
        double netTotal = total + vat;
        double change = credits - netTotal;

        System.out.println(String.format("%16s : %8.2f", "Gross Total", total));
        System.out.println(String.format("%16s : %8.2f", "Vat (3.8%)", vat));
        System.out.println(String.format("%16s : %8.2f\n", "Net Total", netTotal));
        System.out.println(String.format("%16s : %8.2f\n\n", "Change", change));
        System.out.println("Sanchez, Daniel John Henrick D.");

        return change;
    }//Main End
}//Class End

// Sanchez, Daniel John Henrick D. - A121 - CS



