package EncapsulationAndAbstraction;

public class InfyTV {

    private String photographer;
    private String newsreporter;
    private String correspondent;

    public String getPhotography()
    {
        return photographer;
    }
    public void setPhotography(String photographer)
    {
        this.photographer=photographer;
    }
    public String getNewsReporter()
    {
        return newsreporter;
    }
    public void setNewsReporter(String newsreporter)
    {
        this.newsreporter=newsreporter;
    }
    public String getCorrespondent()
    {
        return correspondent;
    }
    public void setCorrespondent(String correspondent)
    {
        this.correspondent=correspondent;
    }
    public void documentaryFilm()
    {
        System.out.println("A hundred years ago there were 100,000 tigers in the world. Today there are as few as 3,200. Why are tigers disappearing?......");
        System.out.println("by Correspondent:"+ getCorrespondent());
        System.out.println("News Reporter:"+ getNewsReporter());
        System.out.println("Photographer:"+ getPhotography());
    }
    
}
