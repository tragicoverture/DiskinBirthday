import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader brD = new BufferedReader(new FileReader("Descrip.txt"));
        BufferedReader brC = new BufferedReader(new FileReader("Baristas.txt"));
        BufferedReader brN = new BufferedReader(new FileReader("Names.txt"));
        BufferedReader diskin = new BufferedReader(new InputStreamReader(System.in));
        String message, barista, name;
        ArrayList<StarbucksItem> StardisksMenu = new ArrayList<>(); // we created our StardisksMenu
        while (((message = brD.readLine()) != null) && ((barista = brC.readLine()) != null) && ((name = brN.readLine()) != null)) {
            StardisksMenu.add(new StarbucksItem(barista, message, name)); // each stardisks item has a name, barista, and special message!
        }
        System.out.println("Welcome to Stardisks! Where you can Disk-IN and Disk-Out in a few!");
        System.out.println("Would you like to try an item? (yes/no)");
        String s = diskin.readLine();
        while (!s.equalsIgnoreCase("yes") && (!s.equalsIgnoreCase("no"))) {
            System.out.println("Sorry, I don't understand...Try again? (yes/no) ");
            s = diskin.readLine();
        }
        while (s.equalsIgnoreCase("yes")) {
            System.out.println("Which item number would you like? ");
            for (int i = 0; i < StardisksMenu.size(); i++) { // displays StardisksMenu
                System.out.println((i + 1) + ". " + StardisksMenu.get(i).getName());
            }
            try {
                int ans = Integer.parseInt(diskin.readLine());
                if (ans < 0 || ans > StardisksMenu.size()) {
                    System.out.println("Sorry! That item doesn't exist.");
                }
                else {
                    System.out.println("**DISKIN**\n" + StardisksMenu.get(ans -1).getName() + "\nThank you for your order!");
                    System.out.println(StardisksMenu.get(ans - 1).toString());
                }
                System.out.println("Would you like another item? (yes/no)");
                s = diskin.readLine();
                while (!s.equalsIgnoreCase("yes") && (!s.equalsIgnoreCase("no"))) {
                    System.out.println("Sorry, I don't understand...Try again? (yes/no) ");
                    s = diskin.readLine();
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Sorry, I don't understand...Try again? (yes/no) ");
                s = diskin.readLine();
            }
            while (!s.equalsIgnoreCase("yes") && (!s.equalsIgnoreCase("no"))) {
                System.out.println("Sorry, I don't understand...Try again? (yes/no) ");
                s = diskin.readLine();
            }
        }
        System.out.println("""
                Sorry to see you go!
                Happy Birthday Mrs. Diskin!!!
                -your amazing students :)""");
    }
}