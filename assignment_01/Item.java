package assignment_01;

public class Item {
    // 
    private String name;
    private String description;

    //constructors
    Item ()
    {
        this.name = "";
        this.description = "";
    }
    Item (String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    // Accessor functions

    public String getName ()
    {
        return this.name;
    }

    public String getDescription ()
    {
        return this.description;
    }

    // Mutator functions

    public void setName (String name)
    {
        this.name = name;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }
}
