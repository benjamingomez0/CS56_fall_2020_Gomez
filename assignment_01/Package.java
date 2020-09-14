package assignment_01;

public class Package extends Mail 
{
    //member variable
    private Item [] items; 

    //constructors
    //default
    Package()
    {
        this.items = new Item[10];
    }
    //constructor with 
    Package(Item [] newItems, String address)
    {
        super(address);

        this.items = new Item[newItems.length];
        for(int i = 0; i < newItems.length; i++)
        {
            this.items[i] = newItems[i]; 
        }
    }

    public Item[] getItems()
    {
        return this.items;
    }
}
