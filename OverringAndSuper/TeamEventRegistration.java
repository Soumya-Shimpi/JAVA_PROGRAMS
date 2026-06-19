public class TeamEventRegistration extends EventRegistration
{
    private int noOfParticipent;
    private int teamNo;

    TeamEventRegistration(String name, String nameOfEvent, int noOfParticipent, int teamNo)
    {
        super(name, nameOfEvent);
        this.noOfParticipent = noOfParticipent;
        this.teamNo = teamNo;
    }     
    
    public int getNoOfParticipent()
    {
        return teamNo;
    }
    public void setNoOfParticipent(int noOfParticipent)
    {
        this.noOfParticipent = noOfParticipent;
    }


    public int getTeamNo()
    {
        return teamNo;
    }
    public void setTeamNo(int teamNo)
    {
        this.teamNo = teamNo;
    }

    public void registerEvent()
    {   
        super.registerEvent();
        registrationFee = baseFee * noOfParticipent;
    }
}