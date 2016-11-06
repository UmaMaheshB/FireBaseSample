package com.example.mahesh.firebasesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText name,city,age;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.editText);
        city=(EditText)findViewById(R.id.editText2);
        age=(EditText)findViewById(R.id.editText3);

        firebaseDatabase=FirebaseDatabase.getInstance();
        databaseReference=firebaseDatabase.getReference();

    }

    public void save(View view) {

        databaseReference.child("name").setValue(name.getText().toString());
        databaseReference.child("city").setValue(city.getText().toString());
        databaseReference.child("age").setValue(age.getText().toString());



    }
}
