import java.util.Scanner;
public class ci
{
    public static void main(String args[]) 
    {
        double p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextDouble();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextDouble();
        System.out.print("Enter the Time period : ");
        t = scan.nextDouble();
        scan.close();
        sinterest = p*(Math.pow((1+(r/100)),t));
        System.out.printf("Compound Interest is: %.2f ",sinterest);
    }
}
