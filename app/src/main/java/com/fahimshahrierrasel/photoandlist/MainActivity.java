package com.fahimshahrierrasel.photoandlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView storyImage;
    private TextView storyText;
    private Button actionOne;
    private Button actionTwo;
    StoryPage[] story;
    int currentPage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyImage = findViewById(R.id.iv_story_image);
        storyText = findViewById(R.id.tv_story_text);
        actionOne = findViewById(R.id.btn_action_one);
        actionTwo = findViewById(R.id.btn_action_two);

        story = StoryPage.GetStory();
        setPageStory(currentPage);

        actionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StoryPage page = story[currentPage];
                setPageStory(page.actionOneNumber);
            }
        });
        actionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StoryPage page = story[currentPage];
                setPageStory(page.actionTwoNumber);
            }
        });

    }

    private void setPageStory(int pageNumber)
    {
        StoryPage page = null;

        for (StoryPage aStory : story) {
            StoryPage temp = story[pageNumber];
            if (temp.pageNumber == pageNumber) {
                page = temp;
                break;
            }
        }

        currentPage = page.pageNumber;
        storyImage.setImageDrawable(this.getResources().getDrawable(page.image));
        storyText.setText(page.pageStory);
        actionOne.setText(page.pageActionOne);
        if(page.pageActionTwo != null){
            actionTwo.setVisibility(View.VISIBLE);
            actionTwo.setText(page.pageActionTwo);
        }else{
            actionTwo.setVisibility(View.GONE);
        }
    }

}
