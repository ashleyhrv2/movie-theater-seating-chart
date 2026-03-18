package javaPack;

import java.util.Scanner;

public class DisplayMenu 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        arraymenu order = new arraymenu();
        Reciept receipt = new Reciept();

       
        String[] breakfast = 
        {
            
        };

        String[] lunch = 
        {
            
        };

        String[] dinner = 
        {
            
        };

        boolean running = true;

        while (running)
        {
            System.out.println("Choose a row:");
            System.out.println("1. Row A");
            System.out.println("2. Row B");
            System.out.println("3. Row C");
            System.out.println("4. Row D");
            System.out.println("5. Row E");
            System.out.println("6. Row F");
            System.out.println("7. Row G");
            System.out.println("8. Row H");
            System.out.println("9. Row I");
            System.out.println("10. Row J");
            System.out.println("11. Reserve");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            if (choice == 11)
            {
                receipt.printReceipt(order.getCart());
                running = false;
                continue;
            }

            String[] selectedMenu = null;

            if (choice == 1) selectedMenu = breakfast;
            else if (choice == 2) selectedMenu = lunch;
            else if (choice == 3) selectedMenu = dinner;
            else {
                System.out.println("Invalid choice.");
                continue;
            }

           
            for (int i = 0; i < selectedMenu.length; i++)
            {
                System.out.println((i + 1) + ". " + selectedMenu[i]);
            }

            System.out.print("Pick an item number: ");
            int itemNum = input.nextInt();

            if (itemNum >= 1 && itemNum <= selectedMenu.length)
            {
                order.addItem(selectedMenu[itemNum - 1]);
            }
            else
            {
                System.out.println("Invalid item number.");
            }
        }

        System.out.println("Thanks for visiting!");
    }
}

