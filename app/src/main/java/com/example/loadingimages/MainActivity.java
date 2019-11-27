package com.example.loadingimages;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int index; // used for accessing images one by one.
    int images[]; // will hold the ids of all the images. Even Array class can be implemented for storing the imageIds.
    int n; // count of images[]

    public void switchImage(View button){
        Log.i("Action", "Button tapped");

        // Instance of the image view to change displaying image
        ImageView displayedImageView = (ImageView) findViewById(R.id.imageView);

        // index gets incremented by one. Once last image in the array is displayed, index will go back to first image
        index = (index + 1) % n;

        //extracting the image id
        int imageId = images[index];

        // setting the image view to display the extracted image
        displayedImageView.setImageResource(imageId);

        Log.i("Event", "Image switched to dog " + Integer.toString(index + 1));
    }

    // Initialization of the class members....
    private void initialization(){
        index = 0;

        // Images that are getting displayed... If new
        images = new int[] {R.drawable.dog1, R.drawable.dog2,
                R.drawable.dog3, R.drawable.dog4, R.drawable.dog5, R.drawable.dog6};
        n = images.length;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialization();
    }
}
