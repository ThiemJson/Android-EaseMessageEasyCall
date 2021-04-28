package teneocto.thiemjason.easymessageeasycall.login.loginFirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import teneocto.thiemjason.easymessageeasycall.R;

public class FirebaseRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_register);

        // Hide tab bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
    }

    /**
     * Handle user register
     * */
    public void register(View view) {
        Log.i("FIREBASE REGISTER", "Register");
    }

    /**
     * Handle user forgot password
     */
    public void forgotPassword(View view)  {
        Log.i("FIREBASE REGISTER", "Forgot password");
        Intent gotoForgotPassword = new Intent(getApplicationContext(), FirebaseForgotPassword.class);
        startActivity(gotoForgotPassword);
    }

    /**
     * Go back previous activity
     */
    public void goBack(View view) {
        Log.i("FIREBASE REGISTER", "GoBack");
        finish();
    }
}