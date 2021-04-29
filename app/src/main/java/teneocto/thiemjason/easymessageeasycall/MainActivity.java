package teneocto.thiemjason.easymessageeasycall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import teneocto.thiemjason.easymessageeasycall.login.FirebaseUIActivity;
import teneocto.thiemjason.easymessageeasycall.login.Login;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide tab bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();

        Intent intent = new Intent(getApplicationContext(), FirebaseUIActivity.class);
        startActivity(intent);
        finish();
    }
}