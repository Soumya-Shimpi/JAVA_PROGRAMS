public class ShowYourTalentRegistration
{
    public static void main(String[] args)
    {
        EventRegistration p1 = new SingleEventRegistration("Jenny","Sing&Win", 1);
        p1. registerEvent();

        EventRegistration team1 = new TeamEventRegistration("Aura", "ShakeALeg", 5,5 );
        team1.registerEvent();

        EventRegistration p2 = new SingleEventRegistration("Hudson","PlayAway", 2);
        p2.registerEvent();

        System.out.println("Thank You" + p1.name + "for your participation.Your registration fee is:"+ p1.registrationFee);
        System.out.println("You are participant no: " + ((SingleEventRegistration)p1).getParticipentNo());

        System.out.println("Thank You" + team1.name + "for your participation.Your registration fee is:"+ team1.registrationFee );
        System.out.println("You are participant no: " + ((TeamEventRegistration)team1).getNoOfParticipent());
        
    }
}