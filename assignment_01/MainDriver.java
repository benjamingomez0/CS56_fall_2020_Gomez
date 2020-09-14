package assignment_01;

public  class MainDriver{    
    public static void main (String [] args)
    {
        Item item_1 = new Item("Item 1", "The First Item");
        System.out.println("Item 1 name: " + item_1.getName());
        System.out.println("Item 1 description: " + item_1.getDescription());
        item_1.setName("box");
        item_1.setDescription("This is a box");
        System.out.println("New Item 1 name: " + item_1.getName());
        System.out.println("New Item 1 description: " + item_1.getDescription());
        
        DeliveryTruck truck = new DeliveryTruck();

        Item [] parcelItems = new Item[3];
        parcelItems[0]= item_1;
        parcelItems[1]= new Item("Item 2","The Second Item");
        Package parcel = new Package(parcelItems,"abc");

        truck.load(parcel);
        truck.honkHorn();
        // Mail m = new Mail("123");


    }



}