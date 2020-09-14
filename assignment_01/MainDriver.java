/*
Name: Benjamin Gomez
Section: 3615
Description: The Main Driver below uses the classes 
             implemented in other files within the
             package assignment_01
*/


package assignment_01;
import java.util.*;

public  class MainDriver{    
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        DeliveryTruck truck = new DeliveryTruck();
        truck.honkHorn();
        int choice =1;
        while(choice != -999)
        {
            printMenu();
            choice = in.nextInt();

            switch(choice)
            {
                case 1 : loadTruck(truck, in);
                         System.out.println();
                         break;
                case 2 : System.out.println("Truck has " + truck.getAmtMail() + "/10 items in mailbag." );
                         break;
                case 3 : choice = -999;
                         break;
                default : System.out.println("Invalid Selection...");
                          System.out.println();
                          break;
            }
        }
        
    }
    static void printMenu()
    {
        System.out.println("Please make your selection:");
        System.out.println("Load Truck =====> 1");
        System.out.println("Check Mailbag ==> 2");
        System.out.println("Quit ===========> 3");
    }

    static void loadTruck (DeliveryTruck truck, Scanner input)
    {
        int choice = 0;
        while(choice != 3)
        {
            System.out.println("Load Letter ===> 1");
            System.out.println("Load Package ==> 2");
            System.out.println("Quit ==========> 3");
            
            choice = input.nextInt();
        
        if(choice == 1)
        {
            
            System.out.println("Enter Address");
            input.nextLine();
            String addy = input.nextLine();
            
            System.out.println("Enter Contents");
            String contents = input.nextLine();

            Letter letter = new Letter(addy,contents);

            if(truck.getAmtMail() < 10)
            {
            truck.load(letter);
            choice =  3;
            }
            else
            {
                System.out.println("Truck is full!");
                choice =  3;
            }

        }
        if(choice == 2)
        {
            System.out.println("Enter number of items in package");

            
            int numItems = input.nextInt();
            Item [] packItems = new Item [numItems];
            for(int i = 0; i < numItems; i++)
            {
                System.out.println("Enter name for item " + (i+1));
                input.nextLine();
                String name = input.nextLine();
                

                System.out.println("Enter description for item " + (i+1));
                // input.next();
                String description = input.nextLine();
                

                packItems[i] = new Item(name, description);
                
            }
            System.out.println("Enter address for package ");
            // input.nextLine();
            String addy = input.nextLine();
            
            Package pack = new Package(packItems,addy);
            if(truck.getAmtMail() < 10)
            {
                truck.load(pack);
                choice =  3;
            }
            else
            {
                System.out.println("Truck is full!");
                choice =  3;
            }  
        }
     }
    }
}