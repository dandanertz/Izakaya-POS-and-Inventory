import java.util.Scanner;
import static java.lang.Math.*;
class AreaCircumerenceCircle {

 public static void main (String args[])
    {
        double r, circumference, A;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius of A Circle >>> ");
        r = sc.nextDouble();
        A = Math.PI*Math.pow(r, 2);
        circumference = 2 * Math.PI * r;
        
        System.out.println("The area of the circle is = "+A+" and the Circumference = "+circumference);
        System.out.println("Daniel John Henrick D. Sanchez");
        sc.close();  
    }
}

// Sanchez, Daniel John Henrick D. - A121 - CS
        
    
