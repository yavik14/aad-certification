package com.theyavikteam.aad_certification;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.theyavikteam.aad_certification.api.dto.UserDto;
import com.theyavikteam.aad_certification.data.repository.datasource.BrawlRepository;
import com.theyavikteam.aad_certification.utils.ContextUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    private static final String LOGO_FILE_NAME = "brawl_stars_logo.png";

    private ImageView imageMain;
    private TextView labelMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageMain = findViewById(R.id.imageMain);
        labelMain = findViewById(R.id.labelMain);
//        loadHeaderImage();
//        readBrawlers();
        BrawlRepository brawlRepository = new BrawlRepository();
        brawlRepository.getUserByTag("98LC2JV0", new BrawlRepository.RepositoryCallback<UserDto>() {
            @Override
            public void onSuccess(UserDto response) {
                labelMain.setText(response.getName());
            }

            @Override
            public void onError(String errorMessage) {
                ContextUtils.toastMessage(getApplicationContext(), errorMessage);
            }
        });
    }

    //TODO Example of read image from assets
    private void loadHeaderImage() {
        try {
            imageMain.setImageBitmap(BitmapFactory.decodeStream(getAssets().open(LOGO_FILE_NAME)));
        } catch (IOException e) {
            ContextUtils.toastMessage(getApplicationContext(), e.getMessage());
        }
    }

    //TODO Example of read file from raw
    private void readBrawlers() {
        StringBuilder brawlersBuilder = new StringBuilder();
        String line;
        InputStream inputStream = getResources().openRawResource(R.raw.brawlers);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            while ((line = reader.readLine()) != null) {
                brawlersBuilder.append(line);
                brawlersBuilder.append("\n");
            }
        } catch (IOException e) {
            ContextUtils.toastMessage(getApplicationContext(), e.getMessage());
        }
        labelMain.setText(brawlersBuilder.toString());
    }


}
