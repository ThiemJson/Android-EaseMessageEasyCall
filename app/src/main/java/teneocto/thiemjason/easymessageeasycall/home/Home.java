package teneocto.thiemjason.easymessageeasycall.home;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import teneocto.thiemjason.easymessageeasycall.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView textView = findViewById(R.id.userinfo);
        String email =  FirebaseAuth.getInstance().getCurrentUser().getEmail();
        textView.setText(email);

        Button signout = findViewById(R.id.signout);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference();
        // Read from the database
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
//                String value = dataSnapshot.getValue(String.class);
                Log.d("VAlue", "Value is: " + dataSnapshot.getValue().toString());
                TextView dataLabel = findViewById(R.id.data);
                dataLabel.setText(dataSnapshot.getValue().toString());

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("test", "Failed to read value.", error.toException());
            }
        });


        signout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();

                // Write a message to the database
                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference();

                EditText data = findViewById(R.id.input);
                String dataraw = data.getText().toString();

                Map<String, User> dataInput = new HashMap<String, User>();
                dataInput.put(dataraw, new User("1851061743","18", dataraw));
                myRef.child("user").push().setValue(dataInput);
            }
        });
    }
}