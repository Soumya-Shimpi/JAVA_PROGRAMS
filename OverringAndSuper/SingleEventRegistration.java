class SingleEventRegistration extends EventRegistration
{
    private int participentNo;
    SingleEventRegistration(String name, String nameOfEvent, int participentNo)
    {
        super(name, nameOfEvent); 
        this.participentNo = participentNo;
    }

    public int getParticipentNo()
    {
        return participentNo;
    }
    public void setParticipentNo(int participentNo)
    {
        this.participentNo = participentNo;
    }

    public void registerEvent()
    {
        int baseFee=0;
        if (nameOfEvent == "ShakeALeg")
        {
            registrationFee = baseFee + 100;
           
        }
        else if (nameOfEvent == "Sing&Win")
        {
           registrationFee= baseFee + 150;
            
        }
        else if(nameOfEvent == "PlayAway")
        {
            registrationFee = baseFee + 130;
        }
        else{
            baseFee = 0;
        }
    }
}