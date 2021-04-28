package teneocto.thiemjason.easymessageeasycall.login.loginFirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import teneocto.thiemjason.easymessageeasycall.R;

public class FirebaseForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase_forgot_password);

        // Hide tab bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
    }

    /**
     * Handler user click send email recover
     */
    public void sendEmailRecover(View view) {
        Log.i("FIREBASE RecoverPass","Send email recover");
    }

    /**
     * Go back to previous pass
     */
    public void goBack(View view) {
        Log.i("FIREBASE RecoverPass","Go back");
        finish();
    }
}