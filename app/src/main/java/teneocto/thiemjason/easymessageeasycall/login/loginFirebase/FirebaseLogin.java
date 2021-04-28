package teneocto.thiemjason.easymessageeasycall.login.loginFirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import teneocto.thiemjason.easymessageeasycall.R;

public class FirebaseLogin extends AppCompatActivity {
    EditText inputEmail;
    EditText inputPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_login);

       activityInitial();
    }

    /**
     * All config here
     */
    public void activityInitial() {
        // Hide tab bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();

        findViewById(R.id.loginButton).setBackgroundColor(Color.parseColor("#0873e3"));

        this.inputEmail = findViewById(R.id.editTextTextEmailAddress);
        this.inputPass = findViewById(R.id.editTextTextPassword);
    }

    /**
     * Handle user login
     * @param v
     */
    public void logIn(View v) {
        Log.i("Login","Login with firebase");
    }

    /**
     * Handle user sign up
     * @param v
     */
    public void signUp(View v) {
        Log.i("Login","SignUp with firebase");
        Intent intentSignUp = new Intent(getApplicationContext(), FirebaseRegister.class);
        startActivity(intentSignUp);
    }

    /**
     * Hanle user go back to previous activity
     * @param v
     */
    public void goBack(View v) {
        Log.i("Login","Back");
        finish();
    }
}