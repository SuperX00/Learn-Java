import java.util.Scanner;
public class Mad_Libs_Game {
    public static void main(String[] args){

        Scanner Word = new Scanner(System.in);

        System.out.print("Enter an adjective: ");
        String adjective = Word.nextLine();
        System.out.print("Enter a animal: ");
        String animal = Word.nextLine();
        System.out.print("Enter a verb: ");
        String verb = Word.nextLine();
        System.out.print("Enter a place: ");
        String place = Word.nextLine();

        System.out.println("Today I saw a "+adjective+ " animal.");
        System.out.println("In was a "+animal+" from the zoo.");
        System.out.println("The "+animal+" was " +verb+ " happily.");
        System.out.println("Then it was ran all the way to "+place);

        Word.close();

    }
}
