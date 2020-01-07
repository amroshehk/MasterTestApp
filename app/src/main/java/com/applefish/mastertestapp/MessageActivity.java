package com.applefish.mastertestapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity {

    public EditText phoneNr, message;
    private SmsManager smsManager = SmsManager.getDefault();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Log.i("INFO", "in onCreate");

    }
    public void sendSms(View v){ Log.i("INFO", "in sendSms");
        phoneNr = (EditText)findViewById(R.id.phoneNr);
        message = (EditText)findViewById(R.id.message);
//        smsManager.sendTextMessage(phoneNr.getText().toString(),
//                null, message.getText().toString(), null, null);
        String message_st=message.getText().toString();
        String phoneNr_st=phoneNr.getText().toString();
        if(message_st.equals("ABC")&& phoneNr_st.equals("12345"))
            WatermarkNode.Create();
    }


}
