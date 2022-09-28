import javax.swing.*;

public class CrossProductIf
{
    public static void main(String[] args)
    {
        String playerA = "I";
        String playerB = "R";

        if(playerA.equalsIgnoreCase("R"))
        {
            if(playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock its a TIE");
            } if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper covers Rock Player B wins!");
            }
            else
            {
                System.out.println("Rock breaks Scissors Player A wins");
            }
        }
        if(playerA.equalsIgnoreCase("P"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock Player A wins");
            } if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Paper it's a Tie!");
            }
            else
            {
                System.out.println("Scissors cuts Paper Player B wins!");
            }
            else//player a must be scissors
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Rock breaks Scissors Player B wins!");
                }
                if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Scissors cuts papers Player A wins");
                }else
                {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                }
            }
        }
    }
}