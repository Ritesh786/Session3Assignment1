package com.acadgild.fujitsu.session3assignment1;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mcontactbtn;

    private static final int PICK_CONTACT = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mcontactbtn = (Button) findViewById(R.id.contact_btn);
        mcontactbtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent it= new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);

        startActivityForResult(it, PICK_CONTACT);


    }
}
