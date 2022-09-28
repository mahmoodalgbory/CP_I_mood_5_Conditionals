public class Main
{
    public static void main(String[] args)
    {
        //Logical AND in Java is &&
        // Logical OR in Java is ||

        int age = 14;
        String critterRace = "Orc";

        if(age >= 21 && critterRace.equalsIgnoreCase("ORC"))
        {
            System.out.println("You can get a drivers license.. Please be careful");
        }

        if age = 14;
        critterRace = "Elf";

        if(critterRace.equalsIgnoreCase("Elf") )
        {
            System.out.println("You can get a driver's license.. Please be careful");
        }
        else
        {
            System.out.println("Sorry too young for a Driver's license");
        }

        // cascaded if then else used for selection

        String playerA = "S";

        if(playerA.equals("R") )
        {
            System.out.println("Move is Rock");
        }
        else if(playerA.equals("P") )
        {
            System.out.println("Move is Paper");
        }
        else
        {
            System.out.println("Has to be scissors");
        }
        /* String name ="mahmood";
        String fname = name;

        if (name.equals(fname))
        {
            System.out.println("Same Variable content");
        }
        */
    }
}