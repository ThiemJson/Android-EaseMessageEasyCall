package teneocto.thiemjason.easymessageeasycall;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FirebaseLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_login);

        // Hide tab bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();

        findViewById(R.id.loginButton).setBackgroundColor(Color.parseColor("#0873e3"));
    }

    public void logIn(View v) {
        Log.i("Login","Login with firebase");
    }
    public void signUp(View v) {
        Log.i("Login","SignUp with firebase");
    }
    public void goBack(View v) {
        Log.i("Login","Back");
        finish();
    }
}