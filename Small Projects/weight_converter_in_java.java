import java.util.Scanner;

public class weight_converter_in_java {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);

        System.out.print("Enter the weight: ");
        double weight = value.nextDouble();

        System.out.print("Enter 1 to kg to lbs: \n");
        System.out.print("Enter 2 to lbs to kg: \n");
        int choice = value.nextInt();

        if(choice == 1){
            weight *= 2.20462;
            System.out.println("The new weight is : " +weight);
        }
        else if(choice == 2){
            weight *= 0.453592;
            System.out.println("The new weight is : " +weight);
        }
        else {
            System.out.println("Please Enter the weight:");
        }

        value.close();
    }

}
