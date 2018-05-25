package com.fahimshahrierrasel.photoandlist;

public class StoryPage
{
    int pageNumber;
    String pageStory;
    int image;
    String pageActionOne;
    int actionOneNumber;
    String pageActionTwo;
    int actionTwoNumber;

    public StoryPage(int pageNumber, String pageStory, int image, String pageActionOne,
                     int actionOneNumber, String pageActionTwo, int actionTwoNumber) {
        this.pageNumber = pageNumber;
        this.pageStory = pageStory;
        this.image = image;
        this.pageActionOne = pageActionOne;
        this.actionOneNumber = actionOneNumber;
        this.pageActionTwo = pageActionTwo;
        this.actionTwoNumber = actionTwoNumber;
    }

    public StoryPage(int pageNumber, String pageStory, int image, String pageActionOne, int actionOneNumber) {
        this.pageNumber = pageNumber;
        this.pageStory = pageStory;
        this.image = image;
        this.pageActionOne = pageActionOne;
        this.actionOneNumber = actionOneNumber;
    }

    public static StoryPage[] GetStory(){
        StoryPage inHome = new StoryPage(0, "I will go to university, Now I am in bed",
                R.drawable.image1, "Nah, I will Sleep", 0,
                "Oh! NO, I have an exam!!", 1);

        StoryPage inRoad = new StoryPage(1, "I will ride on bus or I will go by Uber",
                R.drawable.image2, "Waiting For Bus", 2,
                "Call Uber", 3);

        StoryPage noBus = new StoryPage(2, "I have been waiting for 2 hours, Exam in 10 minutes",
                R.drawable.image3, "I Cann't attednd. Go Home", 4,
                "Call Uber", 3);

        StoryPage atUniversity = new StoryPage(3, "Ohh! That Exam was not bad",
                R.drawable.image4, "Time to go Home", 0);

        StoryPage returnHome = new StoryPage(4, "I am Back!",
                R.drawable.image5, "Restart", 0);


        return new StoryPage[] {inHome,inRoad,noBus,atUniversity,returnHome};
    }
}
