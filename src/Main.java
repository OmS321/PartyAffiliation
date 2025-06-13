import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String pAffiliation;

        System.out.print("Enter your political affiliation (D)emocrat, (R)epublican, (I)ndependent, or Other (Any other key): ");

        pAffiliation = input.nextLine();
        pAffiliation = pAffiliation.toUpperCase();

        switch (pAffiliation)
        {
            case "D":
                System.out.println("You get a Democratic Donkey!");
                break;
            case "R":
                System.out.println("You get a Republican Elephant!");
                break;
            case "I":
                System.out.println("You get an Independent Person!");
                break;
            default:
                System.out.println("You got... an Other!");
                break;
        }

    }
}