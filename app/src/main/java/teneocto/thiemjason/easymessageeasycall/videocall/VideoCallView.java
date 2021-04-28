package teneocto.thiemjason.easymessageeasycall.videocall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import teneocto.thiemjason.easymessageeasycall.R;

public class VideoCallView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_call_view);

        // Hide tab bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
    }
}