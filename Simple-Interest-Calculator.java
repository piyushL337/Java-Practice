/*
In this Program I'm taking the values of p, r and t from user and 
then  calculating the simple interest based on entered values.
P is Principal amount.
R is rate per annum.
T is time in years.
Simple Interest = (P × R × T)/100
*/
import java.util.Scanner;
public class JavaExample
{
    public static void main(String args[]) 
    {
        float p, r, t, sinterest;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = scan.nextFloat();
        System.out.print("Enter the Rate of interest : ");
        r = scan.nextFloat();
        System.out.print("Enter the Time period : ");
        t = scan.nextFloat();
        scan.close();
        sinterest = (p * r * t) / 100;
        System.out.print("Simple Interest is: " +sinterest);
    }
}
