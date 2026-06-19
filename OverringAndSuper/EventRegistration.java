class EventRegistration
{
   public String name;
   public String nameOfEvent;
   public double registrationFee;
    int baseFee;
   EventRegistration(String name,String nameOfEvent)
   {
      this.name = name;
      this.nameOfEvent = nameOfEvent;
   }
   public String getName()
   {
     return name;
   }
   public void setName(String name)
   {
     this.name = name;
   }

   public String getNameOfEvent()
   {
     return nameOfEvent;
   }
   public void setNameOfEvent(String nameOfEvent)
   {
     this.nameOfEvent = nameOfEvent;
   }
   public double getRegistrationFee()
   {
        return registrationFee;
   }
   public void setRegistrationFee(double registrationFee)
   {
        this.registrationFee = registrationFee;
   }

   public void registerEvent()
   {
                
        if (nameOfEvent.equals("ShakeALeg"))
        {
            baseFee = 100;
        }
        else if (nameOfEvent.equals("Sing&Win"))
        {
            baseFee = 150;
        }
        else if (nameOfEvent.equals("Actathon"))
        {
            baseFee = 70;
        }
        else if (nameOfEvent.equals("PlayAway"))
        {
            baseFee = 130;
        }
        else
        {
            baseFee = 0;
        }
   }
}