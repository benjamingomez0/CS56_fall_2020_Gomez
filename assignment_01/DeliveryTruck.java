package assignment_01;

public class DeliveryTruck 
{
   private Mail [] mailbag = new Mail[10];
   private String horn = "beep beep";

   DeliveryTruck(){}
   public void honkHorn()
   {
       System.out.println(horn);
   }
   public void load (Mail mail)
   {
       for(int i = 0; i < this.mailbag.length; i++)
       {
            if(this.mailbag[i] == null)
            {
                this.mailbag[i] = mail;
                System.out.println("Mail has been placed in the bag");
                break;
            }
            else if( i == this.mailbag.length -1 )
            {
                System.out.println("Mailbag full"); 
            }
            
       }
   }
}


