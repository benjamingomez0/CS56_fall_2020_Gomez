package assignment_01;

public class Letter extends Mail{
    //member variables
    private String contents;

    //constructors
    Letter()
    {
        this.contents = "";
    }

    Letter(String address, String newContents)
    {
        super(address);
        this.contents = newContents;
    }

    //accessor method
    public String getContents()
    {
        return this.contents;
    }
}
