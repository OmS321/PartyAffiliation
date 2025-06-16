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

        if (pAffiliation.equals("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if (pAffiliation.equals("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if (pAffiliation.equals("I"))
        {
            System.out.println("You get an Independent Person!");
        }
        else
        {
            System.out.println("You got... an Other!");
        }

    }
}