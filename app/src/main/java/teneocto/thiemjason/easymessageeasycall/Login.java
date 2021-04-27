package teneocto.thiemjason.easymessageeasycall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TabHost;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Hide tab bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
    }

    public void loginWithFirebase(View v) {
        Log.i("Login", "Login with Firebase");

        Intent intentToFirebaseLogin = new Intent(getApplicationContext(), FirebaseLogin.class);
        startActivity(intentToFirebaseLogin);
    }

    public void loginWithFacebook(View v) {
        Log.i("Login", "Login with Facebook");
    }

    public void loginWithGoogle(View v) {
        Log.i("Login", "Login with Google");
    }
}