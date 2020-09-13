package assignment_01;

public abstract class Mail
{
    protected String address;

    // constructors
    Mail()
    {
        this.address = "";
    }
    Mail(String address)
    {
        this.address = address;
    }
    // getter method
    public  String getAddress ()
    {
        return this.address;
    };
}
