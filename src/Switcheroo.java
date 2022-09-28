public class Switcheroo
{
    public static void main(String[] args)
    {
        String RPSMove = "s";
        RPSMove.toUpperCase();
        System.out.println("Movei is + PRSMove");
        // Force the move to be uppercase so we dont have to test for lower case

        switch(RPSMove)
        {
            case "R":
                System.out.println("Its a ROCK!");
                break;
            case "P":
                System.out.println("Its a PAPER!");
                break;
            case "S":
                System.out.println("Its SCISSORS!");
                break;
            default:
                System.out.println("Illegal RPS Move");
                break;

        }
    }
}
