import java.util.Scanner;
public class compount_interest_calculator_in_java {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        int P = enter.nextInt();
        System.out.print("Enter annual interest rate: ");
        double r = enter.nextDouble() / 100;
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = enter.nextInt();
        System.out.print("Enter time in years: ");
        int t = enter.nextInt();

        double A = P * Math.pow(1+r/n,n*t);

        System.out.println("Total Amount is: "+A);
        double CI = A-P;
        System.out.println("Compound Interest is: "+CI);


        enter.close();

    }
}
